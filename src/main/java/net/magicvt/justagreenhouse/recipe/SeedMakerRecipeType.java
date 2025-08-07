package net.magicvt.justagreenhouse.recipe;

import net.minecraft.world.item.crafting.RecipeType;

public class SeedMakerRecipeType implements RecipeType<SeedMakerRecipe> {
    public static final SeedMakerRecipeType INSTANCE = new SeedMakerRecipeType();
    public static final String ID = "seed_maker";

    private SeedMakerRecipeType() {}
}
