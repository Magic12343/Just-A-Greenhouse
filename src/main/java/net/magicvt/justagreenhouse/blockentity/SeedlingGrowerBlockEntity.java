package net.magicvt.justagreenhouse.blockentity;

import net.magicvt.justagreenhouse.block.SeedlingGrowerBlock;
import net.magicvt.justagreenhouse.recipe.ModRecipes;
import net.magicvt.justagreenhouse.recipe.SeedlingGrowerRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.RecipeWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class SeedlingGrowerBlockEntity extends BlockEntity {

    private final ItemStackHandler items = new ItemStackHandler(2);
    private final LazyOptional<IItemHandler> itemHandler = LazyOptional.of(() -> items);

    private int progress = 0;
    private static final int MAX_PROGRESS = 1200;

    public SeedlingGrowerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SEEDLING_GROWER.get(), pos, state);
    }

    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            return itemHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        itemHandler.invalidate();
    }

    public void insertItem(Player player, InteractionHand hand) {
        if (level == null || level.isClientSide) return;
        ItemStack held = player.getItemInHand(hand);
        if (held.isEmpty()) return;

        ItemStack slotA = items.getStackInSlot(0);
        ItemStack slotB = items.getStackInSlot(1);

        if (!slotA.isEmpty() && !slotB.isEmpty()) return;

        if (slotA.isEmpty() && slotB.isEmpty()) {
            if (!isValidRecipeInput(held)) {
                level.playSound(null, worldPosition, SoundEvents.CROP_BREAK, SoundSource.BLOCKS, 0.7f, 1f);
                return;
            }
            items.setStackInSlot(0, held.split(1));
            level.playSound(null, worldPosition, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1f);
            setChanged();
            return;
        }

        if (!isValidPair(slotA, slotB, held)) {
            level.playSound(null, worldPosition, SoundEvents.CROP_BREAK, SoundSource.BLOCKS, 0.7f, 1f);
            return;
        }

        int targetSlot = slotA.isEmpty() ? 0 : 1;
        items.setStackInSlot(targetSlot, held.split(1));
        level.playSound(null, worldPosition, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1f);
        setChanged();

        if (!items.getStackInSlot(0).isEmpty() && !items.getStackInSlot(1).isEmpty()) {
            startWork();
        }
    }

    public void removeItem(Player player, InteractionHand hand) {
        if (level == null || level.isClientSide) return;
        BlockState state = getBlockState();

        if (state.getValue(SeedlingGrowerBlock.WATER_STATE) != SeedlingGrowerBlock.WaterState.WATER_IN) return;
        if (hand != InteractionHand.OFF_HAND) return;

        for (int i = 0; i < items.getSlots(); i++) {
            ItemStack stack = items.getStackInSlot(i);
            if (!stack.isEmpty()) {
                player.addItem(stack);
                items.setStackInSlot(i, ItemStack.EMPTY);
                level.playSound(null, worldPosition, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1f);
                setChanged();
                return;
            }
        }
    }

    private boolean isValidRecipeInput(ItemStack stack) {
        if (level == null) return false;
        for (SeedlingGrowerRecipe recipe : level.getRecipeManager().getAllRecipesFor(ModRecipes.SEEDLING_GROWER_RECIPE_TYPE.get())) {
            if (recipe.getInputA().test(stack) || recipe.getInputB().test(stack)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidPair(ItemStack slotA, ItemStack slotB, ItemStack newItem) {
        if (level == null) return false;

        ItemStack first = slotA.isEmpty() ? newItem : slotA;
        ItemStack second = slotB.isEmpty() ? newItem : slotB;

        for (SeedlingGrowerRecipe recipe : level.getRecipeManager().getAllRecipesFor(ModRecipes.SEEDLING_GROWER_RECIPE_TYPE.get())) {
            boolean matches = (recipe.getInputA().test(first) && recipe.getInputB().test(second))
                    || (recipe.getInputA().test(second) && recipe.getInputB().test(first));
            if (matches) return true;
        }
        return false;
    }

    private void startWork() {
        if (level == null || level.isClientSide) return;
        level.setBlock(worldPosition,
                getBlockState().setValue(SeedlingGrowerBlock.WATER_STATE, SeedlingGrowerBlock.WaterState.WORKING),
                3);
        level.playSound(null, worldPosition, SoundEvents.CROP_PLANTED, SoundSource.BLOCKS, 1f, 1f);
        setChanged();
    }

    public static void tick(Level level, BlockPos pos, BlockState state, SeedlingGrowerBlockEntity blockEntity) {
        if (state.getValue(SeedlingGrowerBlock.WATER_STATE) == SeedlingGrowerBlock.WaterState.WORKING) {
            blockEntity.progress++;
            if (blockEntity.progress >= MAX_PROGRESS) {
                blockEntity.finishRecipe();
                blockEntity.progress = 0;
            }
        }
    }

    private void finishRecipe() {
        if (level == null || level.isClientSide) return;

        Optional<SeedlingGrowerRecipe> match = level.getRecipeManager()
                .getAllRecipesFor(ModRecipes.SEEDLING_GROWER_RECIPE_TYPE.get())
                .stream()
                .filter(r -> (r.getInputA().test(items.getStackInSlot(0)) && r.getInputB().test(items.getStackInSlot(1)))
                        || (r.getInputA().test(items.getStackInSlot(1)) && r.getInputB().test(items.getStackInSlot(0))))
                .findFirst();

        if (match.isEmpty()) return;

        ItemStack result = match.get().getResultItem(level.registryAccess()).copy();

        items.setStackInSlot(0, ItemStack.EMPTY);
        items.setStackInSlot(1, ItemStack.EMPTY);
        setChanged();

        BlockEntity below = level.getBlockEntity(worldPosition.below());
        boolean inserted = false;

        if (below != null) {
            LazyOptional<IItemHandler> belowHandler = below.getCapability(ForgeCapabilities.ITEM_HANDLER, Direction.UP);
            if (belowHandler.isPresent()) {
                IItemHandler handler = belowHandler.orElseThrow(IllegalStateException::new);
                for (int i = 0; i < handler.getSlots(); i++) {
                    ItemStack leftover = handler.insertItem(i, result.copy(), false);
                    if (leftover.isEmpty()) {
                        inserted = true;
                        break;
                    }
                }
            }
        }

        if (!inserted) {
            Block.popResource(level, worldPosition, result);
        }

        level.playSound(null, worldPosition, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1f);
        level.setBlock(worldPosition,
                getBlockState().setValue(SeedlingGrowerBlock.WATER_STATE, SeedlingGrowerBlock.WaterState.WATER_NO),
                3);
    }
}
