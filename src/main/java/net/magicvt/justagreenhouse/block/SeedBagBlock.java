package net.magicvt.justagreenhouse.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;

public class SeedBagBlock extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    private static final VoxelShape BORDER = Shapes.or(
            Block.box(0, 0, 0, 1, 16, 16),
            Block.box(15, 0, 0, 16, 16, 16),
            Block.box(1, 0, 0, 15, 16, 1),
            Block.box(1, 0, 15, 15, 16, 16)
    );

    private static final VoxelShape INNER = Block.box(1, 1, 1, 15, 16, 15);

    public SeedBagBlock(BlockBehaviour.Properties properties) {
        super(properties.noOcclusion());
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public SeedBagBlock() {
        this(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHITE_WOOL)
                .strength(0.8F)
                .sound(SoundType.WOOL)
                .noOcclusion());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        return BORDER;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        return Shapes.or(BORDER, INNER);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (level.isClientSide) {
            if (level.random.nextFloat() < 0.25f) {
                double px = pos.getX() + 0.5 + (level.random.nextDouble() - 0.5) * 0.6;
                double pz = pos.getZ() + 0.5 + (level.random.nextDouble() - 0.5) * 0.6;
                level.addParticle(
                        new BlockParticleOption(ParticleTypes.BLOCK, state),
                        px,
                        pos.getY() + 1.02D,
                        pz,
                        0.0D,
                        0.03D,
                        0.0D
                );
            }
        } else {
            double top = pos.getY() + 1.0D;
            double bottom = pos.getY() + 0.1D;
            double currentY = entity.getY();

            if (currentY > bottom && currentY < top + 0.3D) {
                double targetY = Math.max(currentY - 0.00002D, bottom);
                entity.setPos(entity.getX(), targetY, entity.getZ());
            }

            entity.resetFallDistance();
        }
    }

    @Override
    public void attack(BlockState state, Level level, BlockPos pos, Player player) {
        if (!level.isClientSide && player.isShiftKeyDown()) {
            level.destroyBlock(pos, true, player);
        } else {
            super.attack(state, level, pos, player);
        }
    }
}
