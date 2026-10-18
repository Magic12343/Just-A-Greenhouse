package net.magicvt.justagreenhouse.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PostBlock extends Block {

    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
    public static final BooleanProperty FLOOR_TRUE = BooleanProperty.create("floor_true");
    public static final BooleanProperty POT_TRUE = BooleanProperty.create("pot_true");

    private static final VoxelShape SHAPE_Y = Block.box(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D);
    private static final VoxelShape SHAPE_X = Block.box(0.0D, 6.0D, 6.0D, 16.0D, 10.0D, 10.0D);
    private static final VoxelShape SHAPE_Z = Block.box(6.0D, 6.0D, 0.0D, 10.0D, 10.0D, 16.0D);

    public PostBlock(BlockBehaviour.Properties properties) {
        super(properties.noCollission());
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(AXIS, Direction.Axis.Y)
                .setValue(FLOOR_TRUE, false)
                .setValue(POT_TRUE, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AXIS, FLOOR_TRUE, POT_TRUE);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Direction.Axis axis = context.getClickedFace().getAxis();

        BlockState above = level.getBlockState(pos.above());
        BlockState below = level.getBlockState(pos.below());

        boolean hasFakeFenceAbove = false;
        boolean hasFlowerPotBelow = false;

        //FLOOR TRUE
        if (axis == Direction.Axis.Y) {
            hasFakeFenceAbove = above.getBlock() instanceof FakeFence;
        }

        //POT TRUE
        if (axis == Direction.Axis.X || axis == Direction.Axis.Z) {
            hasFlowerPotBelow = below.is(Blocks.FLOWER_POT) || below.getBlock().toString().contains("potted_");
        }

        return this.defaultBlockState()
                .setValue(AXIS, axis)
                .setValue(FLOOR_TRUE, hasFakeFenceAbove)
                .setValue(POT_TRUE, hasFlowerPotBelow);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (level.isClientSide) return;

        BlockState above = level.getBlockState(pos.above());
        BlockState below = level.getBlockState(pos.below());

        Direction.Axis axis = state.getValue(AXIS);
        boolean hasFakeFenceAbove = false;
        boolean hasFlowerPotBelow = false;

        //FLOOR TRUE
        if (axis == Direction.Axis.Y) {
            hasFakeFenceAbove = above.getBlock() instanceof FakeFence;
        }

        //POT TRUE
        if (axis == Direction.Axis.X || axis == Direction.Axis.Z) {
            hasFlowerPotBelow = below.is(Blocks.FLOWER_POT) || below.getBlock().toString().contains("potted_");
        }

        if (state.getValue(FLOOR_TRUE) != hasFakeFenceAbove || state.getValue(POT_TRUE) != hasFlowerPotBelow) {
            level.setBlock(pos, state.setValue(FLOOR_TRUE, hasFakeFenceAbove).setValue(POT_TRUE, hasFlowerPotBelow), 3);
        }
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return switch (rotation) {
            case CLOCKWISE_90, COUNTERCLOCKWISE_90 -> switch (state.getValue(AXIS)) {
                case X -> state.setValue(AXIS, Direction.Axis.Z);
                case Z -> state.setValue(AXIS, Direction.Axis.X);
                default -> state;
            };
            default -> state;
        };
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(AXIS)) {
            case X -> SHAPE_X;
            case Z -> SHAPE_Z;
            default -> SHAPE_Y;
        };
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }
}
