package net.magicvt.justagreenhouse.recipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.wrapper.RecipeWrapper;

public class SeedlingGrowerRecipe implements net.minecraft.world.item.crafting.Recipe<RecipeWrapper> {

    private final ResourceLocation id;
    private final Ingredient inputA;
    private final Ingredient inputB;
    private final ItemStack output;

    public SeedlingGrowerRecipe(ResourceLocation id, Ingredient inputA, Ingredient inputB, ItemStack output) {
        this.id = id;
        this.inputA = inputA;
        this.inputB = inputB;
        this.output = output;
    }

    @Override
    public boolean matches(RecipeWrapper inv, Level level) {
        if (inv.getItem(0).isEmpty() || inv.getItem(1).isEmpty()) return false;

        boolean normal = inputA.test(inv.getItem(0)) && inputB.test(inv.getItem(1));
        boolean reversed = inputA.test(inv.getItem(1)) && inputB.test(inv.getItem(0));

        return normal || reversed;
    }

    @Override
    public ItemStack assemble(RecipeWrapper inv, net.minecraft.core.RegistryAccess registryAccess) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int w, int h) {
        return true;
    }

    @Override
    public ItemStack getResultItem(net.minecraft.core.RegistryAccess registryAccess) {
        return output;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.SEEDLING_GROWER_RECIPE_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.SEEDLING_GROWER_RECIPE_TYPE.get();
    }

    public Ingredient getInputA() {
        return inputA;
    }

    public Ingredient getInputB() {
        return inputB;
    }
}
