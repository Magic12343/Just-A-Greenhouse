package net.magicvt.justagreenhouse.block;

import net.magicvt.justagreenhouse.blockentity.ModBlockEntities;
import net.magicvt.justagreenhouse.blockentity.SeedlingGrowerBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.StringRepresentable;

public class SeedlingGrowerBlock extends BaseEntityBlock {

    public static final EnumProperty<WaterState> WATER_STATE =
            EnumProperty.create("water_state", WaterState.class);

    public static final TagKey<Item> TREE_GROWER_FILLER =
            TagKey.create(Registries.ITEM, new ResourceLocation("justagreenhouse", "tree_grower_filler"));

    public SeedlingGrowerBlock(Properties properties) {
        super(properties.sound(SoundType.LANTERN));
        this.registerDefaultState(this.stateDefinition.any().setValue(WATER_STATE, WaterState.WATER_NO));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(WATER_STATE);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SeedlingGrowerBlockEntity(pos, state);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, level, pos, oldState, isMoving);
        if (!level.isClientSide) {
            level.playSound(null, pos, SoundEvents.LANTERN_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
        }
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock())) {
            if (!level.isClientSide) {
                level.playSound(null, pos, SoundEvents.LANTERN_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
            super.onRemove(state, level, pos, newState, isMoving);
        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {

        ItemStack heldItem = player.getItemInHand(hand);
        BlockEntity be = level.getBlockEntity(pos);
        if (!(be instanceof SeedlingGrowerBlockEntity grower)) return InteractionResult.PASS;

        BlockPos behind = pos.relative(hit.getDirection().getOpposite());
        BlockState behindState = level.getBlockState(behind);

        if (state.getValue(WATER_STATE) == WaterState.WATER_NO) {
            if (behindState.is(Blocks.WATER_CAULDRON)) {
                int levelValue = behindState.getValue(LayeredCauldronBlock.LEVEL);
                if (levelValue > 0) {
                    if (!level.isClientSide) {
                        level.setBlock(behind, behindState.setValue(LayeredCauldronBlock.LEVEL, levelValue - 1), 3);
                        level.setBlock(pos, state.setValue(WATER_STATE, WaterState.WATER_IN), 3);
                        level.playSound(null, pos, SoundEvents.BUCKET_EMPTY, SoundSource.BLOCKS, 1f, 1f);
                    }
                    return InteractionResult.sidedSuccess(level.isClientSide);
                }
            }

            if (heldItem.is(TREE_GROWER_FILLER)) {
                if (!level.isClientSide) {
                    level.setBlock(pos, state.setValue(WATER_STATE, WaterState.WATER_IN), 3);
                    level.playSound(null, pos, SoundEvents.BUCKET_EMPTY, SoundSource.BLOCKS, 1f, 1f);
                    if (!player.isCreative()) heldItem.shrink(1);
                }
                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }

        if (state.getValue(WATER_STATE) == WaterState.WATER_IN) {
            if (!level.isClientSide) grower.insertItem(player, hand);
            return InteractionResult.sidedSuccess(level.isClientSide);
        }

        return InteractionResult.PASS;
    }

    public enum WaterState implements StringRepresentable {
        WATER_NO("water_no"),
        WATER_IN("water_in"),
        WORKING("working");

        private final String name;

        WaterState(String name) {
            this.name = name;
        }

        @Override
        public String getSerializedName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity instanceof SeedlingGrowerBlockEntity grower) {
            SeedlingGrowerBlockEntity.tick(level, pos, state, grower);
        }
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return !level.isClientSide && type == ModBlockEntities.SEEDLING_GROWER.get()
                ? (lvl, pos, st, be) -> SeedlingGrowerBlockEntity.tick(lvl, pos, st, (SeedlingGrowerBlockEntity) be)
                : null;
    }
}
