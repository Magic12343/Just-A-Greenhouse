package net.magicvt.justagreenhouse.recipe;

import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class SeedMakerRecipeSerializer implements RecipeSerializer<SeedMakerRecipe> {

    @Override
    public SeedMakerRecipe fromJson(ResourceLocation id, JsonObject json) {
        JsonObject ingredientObj = GsonHelper.getAsJsonObject(json, "ingredient");
        Ingredient ingredient = Ingredient.fromJson(ingredientObj);

        String resultId = GsonHelper.getAsString(json, "result");
        int count = GsonHelper.getAsInt(json, "count", 1);
        ItemStack result = new ItemStack(net.minecraft.core.registries.BuiltInRegistries.ITEM.get(
                new ResourceLocation(resultId)), count);

        return new SeedMakerRecipe(id, ingredient, result);
    }

    @Override
    public SeedMakerRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
        Ingredient ingredient = Ingredient.fromNetwork(buf);
        ItemStack result = buf.readItem();
        return new SeedMakerRecipe(id, ingredient, result);
    }

    @Override
    public void toNetwork(FriendlyByteBuf buf, SeedMakerRecipe recipe) {
        recipe.getIngredient().toNetwork(buf);
        buf.writeItem(recipe.getResultItem(null));
    }
}
