package net.magicvt.justagreenhouse.recipe;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.ForgeRegistries;

public class SeedlingGrowerRecipeSerializer implements RecipeSerializer<SeedlingGrowerRecipe> {
    @Override
    public SeedlingGrowerRecipe fromJson(ResourceLocation id, JsonObject json) {
        Ingredient inputA = Ingredient.fromJson(json.get("inputA"));
        Ingredient inputB = Ingredient.fromJson(json.get("inputB"));
        ItemStack output = net.minecraftforge.common.crafting.CraftingHelper.getItemStack(json.getAsJsonObject("output"), true);
        return new SeedlingGrowerRecipe(id, inputA, inputB, output);
    }

    @Override
    public SeedlingGrowerRecipe fromNetwork(ResourceLocation id, net.minecraft.network.FriendlyByteBuf buf) {
        Ingredient inputA = Ingredient.fromNetwork(buf);
        Ingredient inputB = Ingredient.fromNetwork(buf);
        ItemStack output = buf.readItem();
        return new SeedlingGrowerRecipe(id, inputA, inputB, output);
    }

    @Override
    public void toNetwork(net.minecraft.network.FriendlyByteBuf buf, SeedlingGrowerRecipe recipe) {
        recipe.getInputA().toNetwork(buf);
        recipe.getInputB().toNetwork(buf);
        buf.writeItem(recipe.getResultItem(null));
    }
}
