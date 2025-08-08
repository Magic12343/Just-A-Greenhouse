package net.magicvt.justagreenhouse.blockentity;

import net.magicvt.justagreenhouse.block.SeedMakerBlock;
import net.magicvt.justagreenhouse.recipe.ModRecipes;
import net.magicvt.justagreenhouse.recipe.SeedMakerRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;

public class SeedMakerBlockEntity extends BlockEntity {

    private ItemStack input = ItemStack.EMPTY;
    private ItemStack result = ItemStack.EMPTY;
    private int progress = 0;
    private static final int MAX_PROGRESS = 20 * 60 * 3; // 3 minutos

    public SeedMakerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SEED_MAKER.get(), pos, state);
    }

    public boolean tryStartProcessing(ItemStack stack) {
        if (stack.isEmpty() || isProcessing() || level == null) return false;

        Optional<SeedMakerRecipe> recipeOptional = level.getRecipeManager()
                .getAllRecipesFor(ModRecipes.SEED_MAKER_RECIPE_TYPE.get()).stream()
                .filter(recipe -> recipe.getIngredient().test(stack))
                .findFirst();

        if (recipeOptional.isPresent()) {
            SeedMakerRecipe recipe = recipeOptional.get();
            this.input = stack.copyWithCount(1);
            this.result = recipe.getResultItem(level.registryAccess());
            this.progress = 0;
            return true;
        }

        return false;
    }

    public boolean isProcessing() {
        return !input.isEmpty();
    }

    public static void tick(Level level, BlockPos pos, BlockState state, SeedMakerBlockEntity be) {
        if (be.isProcessing()) {
            be.progress++;

            if (be.progress >= MAX_PROGRESS) {
                be.spawnResult();
                be.input = ItemStack.EMPTY;
                be.progress = 0;

                // Block OFF
                level.setBlock(pos, state.setValue(SeedMakerBlock.LIT, false), 3);
            }
        }
    }

    private void spawnResult() {
        if (!result.isEmpty() && level != null && !level.isClientSide) {
            ItemEntity itemEntity = new ItemEntity(
                    level,
                    worldPosition.getX() + 0.5,
                    worldPosition.getY() + 1.0,
                    worldPosition.getZ() + 0.5,
                    result.copy());
            level.addFreshEntity(itemEntity);
            result = ItemStack.EMPTY;

            // Result Sound
            level.playSound(null, worldPosition,
                    SoundEvents.ITEM_FRAME_REMOVE_ITEM,
                    SoundSource.BLOCKS, 1.0f, 1.0f);
        }
    }

    public static void clientTick(Level level, BlockPos pos, BlockState state, SeedMakerBlockEntity be) {
        if (state.getValue(SeedMakerBlock.LIT)) {

            // Sound
            if (level.random.nextInt(10) == 0) {
                level.playLocalSound(
                        pos.getX() + 0.5,
                        pos.getY(),
                        pos.getZ() + 0.5,
                        SoundEvents.COMPOSTER_FILL,
                        SoundSource.BLOCKS,
                        0.5F, 1.0F, false);
            }

            // Particles
            double x = pos.getX() + 0.5 + (level.random.nextDouble() - 0.5) * 0.6;
            double y = pos.getY() + 0.1;
            double z = pos.getZ() + 0.5 + (level.random.nextDouble() - 0.5) * 0.6;

            level.addParticle(
                    new BlockParticleOption(ParticleTypes.BLOCK, Blocks.DIRT.defaultBlockState()),
                    x, y, z,
                    0.0, 0.5, 0.0
            );
        }
    }
}
