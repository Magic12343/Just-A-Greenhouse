package net.magicvt.justagreenhouse.blockentity;

import net.magicvt.justagreenhouse.recipe.ModRecipes;
import net.magicvt.justagreenhouse.recipe.SeedMakerRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;

public class SeedMakerBlockEntity extends BlockEntity {
    private int progress = 0;
    private static final int MAX_PROGRESS = 3600; // 3 minutos

    private ItemStack result = ItemStack.EMPTY;

    public SeedMakerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SEED_MAKER.get(), pos, state);
    }

    public boolean tryStartProcessing(ItemStack input) {
        if (isProcessing()) return false;

        SimpleContainer container = new SimpleContainer(1);
        container.setItem(0, input.copy());

        Optional<SeedMakerRecipe> match = level.getRecipeManager()
                .getRecipeFor(ModRecipes.SEED_MAKER_RECIPE_TYPE.get(), container, level);

        if (match.isPresent()) {
            result = match.get().getResultItem(level.registryAccess()).copy();
            progress = MAX_PROGRESS;
            setChanged();
            return true;
        }

        return false;
    }

    public void tickServer() {
        if (!isProcessing()) return;

        progress--;

        if (progress <= 0) {
            finishProcessing();
        }
    }

    private void finishProcessing() {
        if (!level.isClientSide && !result.isEmpty()) {
            ItemEntity item = new ItemEntity(level, worldPosition.getX() + 0.5,
                    worldPosition.getY() + 1, worldPosition.getZ() + 0.5, result.copy());
            level.addFreshEntity(item);
        }

        result = ItemStack.EMPTY;
        progress = 0;
        setChanged();
    }

    public boolean isProcessing() {
        return progress > 0;
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putInt("Progress", progress);
        if (!result.isEmpty()) tag.put("Result", result.save(new CompoundTag()));
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        progress = tag.getInt("Progress");
        if (tag.contains("Result")) {
            result = ItemStack.of(tag.getCompound("Result"));
        }
    }

    public static void tick(Level level, BlockPos pos, BlockState state, SeedMakerBlockEntity blockEntity) {
        blockEntity.tickServer();
    }
}
