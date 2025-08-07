package net.magicvt.justagreenhouse.block;

import net.magicvt.justagreenhouse.blockentity.ModBlockEntities;
import net.magicvt.justagreenhouse.blockentity.SeedMakerBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class SeedMakerBlock extends Block implements EntityBlock {

    public SeedMakerBlock() {
        super(Properties.copy(Blocks.IRON_BLOCK));
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {

        if (level.isClientSide()) return InteractionResult.SUCCESS;

        BlockEntity be = level.getBlockEntity(pos);
        if (be instanceof SeedMakerBlockEntity seedMaker) {
            ItemStack heldItem = player.getItemInHand(hand);
            if (seedMaker.tryStartProcessing(heldItem)) {
                heldItem.shrink(1); // consume uno
                return InteractionResult.CONSUME;
            }
        }

        return InteractionResult.PASS;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SeedMakerBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        if (!level.isClientSide && type == ModBlockEntities.SEED_MAKER.get()) {
            return (lvl, pos, blockState, be) -> {
                if (be instanceof SeedMakerBlockEntity seedMaker) {
                    SeedMakerBlockEntity.tick(lvl, pos, blockState, seedMaker);
                }
            };
        }
        return null;
    }
}
