package net.magicvt.justagreenhouse.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class CatwalkBlock extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BooleanProperty.create("waterlogged");
    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);
    public static final EnumProperty<CatwalkShape> SHAPE = EnumProperty.create("shape", CatwalkShape.class);

    private static final VoxelShape LAYER_SHAPE = Block.box(0, 14, 0, 16, 16, 16);

    public CatwalkBlock() {
        super(BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.LANTERN)
                .noOcclusion());
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(WATERLOGGED, true)
                .setValue(FACING, Direction.NORTH)
                .setValue(SHAPE, CatwalkShape.STRAIGHT));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        FluidState fluid = level.getFluidState(pos);

        if (fluid.getType() != Fluids.WATER) {
            return null;
        }

        BlockState state = this.defaultBlockState()
                .setValue(WATERLOGGED, true)
                .setValue(FACING, context.getHorizontalDirection().getOpposite());

        return updateConnections(state, level, pos);
    }

    // NEW: Override updateShape to detect water removal
    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        if (!level.isClientSide()) {
            FluidState fluid = level.getFluidState(currentPos);
            if (fluid.getType() != Fluids.WATER) {
                level.scheduleTick(currentPos, this, 1);
            }
        }
        return super.updateShape(state, facing, facingState, level, currentPos, facingPos);
    }

    @Override
    public void tick(BlockState state, net.minecraft.server.level.ServerLevel level, BlockPos pos, net.minecraft.util.RandomSource random) {
        FluidState fluid = level.getFluidState(pos);
        if (fluid.getType() != Fluids.WATER) {
            level.destroyBlock(pos, true); // Break block and drop items
        }
        super.tick(state, level, pos, random);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide) {
            FluidState fluid = level.getFluidState(pos);
            if (fluid.getType() != Fluids.WATER) {
                level.scheduleTick(pos, this, 1); // Schedule tick to break block
            } else {
                BlockState newState = updateConnections(state, level, pos);
                if (newState != state) {
                    level.setBlock(pos, newState, 3);
                }
            }
        }
        super.neighborChanged(state, level, pos, block, fromPos, isMoving);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, level, pos, oldState, isMoving);
        if (!level.isClientSide) {
            level.playSound(null, pos, SoundEvents.LANTERN_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
            updateNeighbors(level, pos);
        }
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        super.onRemove(state, level, pos, newState, isMoving);
        if (!level.isClientSide) updateNeighbors(level, pos);
    }

    private void updateNeighbors(Level level, BlockPos pos) {
        for (Direction dir : Direction.Plane.HORIZONTAL) {
            BlockPos neighborPos = pos.relative(dir);
            BlockState neighbor = level.getBlockState(neighborPos);
            if (neighbor.getBlock() instanceof CatwalkBlock) {
                BlockState updated = ((CatwalkBlock) neighbor.getBlock()).updateConnections(neighbor, level, neighborPos);
                level.setBlock(neighborPos, updated, 3);
            }
        }
    }

    private BlockState updateConnections(BlockState state, Level level, BlockPos pos) {
        boolean north = isCatwalk(level, pos.north());
        boolean south = isCatwalk(level, pos.south());
        boolean west = isCatwalk(level, pos.west());
        boolean east = isCatwalk(level, pos.east());

        int count = (north ? 1 : 0) + (south ? 1 : 0) + (west ? 1 : 0) + (east ? 1 : 0);
        CatwalkShape shape;
        Direction facing = Direction.NORTH;

        if (count == 4) {
            shape = CatwalkShape.CROSS;
        } else if (count == 3) {
            shape = CatwalkShape.T;
            if (!north) facing = Direction.NORTH;
            else if (!south) facing = Direction.SOUTH;
            else if (!west) facing = Direction.WEST;
            else facing = Direction.EAST;
        } else if (count == 2) {
            if ((north && south) || (west && east)) {
                shape = CatwalkShape.STRAIGHT;
                facing = north || south ? Direction.NORTH : Direction.EAST;
            } else {
                shape = CatwalkShape.CURVE;
                if (north && east) facing = Direction.SOUTH;
                else if (north && west) facing = Direction.EAST;
                else if (south && east) facing = Direction.WEST;
                else facing = Direction.NORTH;
            }
        } else if (count == 1) {
            shape = CatwalkShape.STRAIGHT;
            if (north) facing = Direction.NORTH;
            else if (south) facing = Direction.SOUTH;
            else if (west) facing = Direction.WEST;
            else facing = Direction.EAST;
        } else {
            shape = CatwalkShape.STRAIGHT;
        }

        return state.setValue(SHAPE, shape).setValue(FACING, facing);
    }

    private boolean isCatwalk(Level level, BlockPos pos) {
        return level.getBlockState(pos).getBlock() instanceof CatwalkBlock;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, FACING, SHAPE);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED)
                ? Fluids.WATER.getSource(false)
                : super.getFluidState(state);
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext ctx) {
        return false;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext ctx) {
        return LAYER_SHAPE;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return LAYER_SHAPE;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (!level.isClientSide && entity instanceof Player player && player.onGround()) {
            double boost = 1.5;
            var motion = player.getDeltaMovement();
            if (Math.abs(motion.x) > 0.01 || Math.abs(motion.z) > 0.01) {
                player.setDeltaMovement(
                        motion.x * 1.3 + player.getLookAngle().x * boost,
                        motion.y,
                        motion.z * 1.3 + player.getLookAngle().z * boost
                );
            }
        }
        super.stepOn(level, pos, state, entity);
    }

    public enum CatwalkShape implements StringRepresentable {
        STRAIGHT, CURVE, T, CROSS;
        @Override
        public String getSerializedName() { return name().toLowerCase(); }
    }
}