package net.magicvt.justagreenhouse.recipe;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = "justagreenhouse", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "justagreenhouse");

    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, "justagreenhouse");

    public static final RegistryObject<RecipeSerializer<SeedMakerRecipe>> SEED_MAKER_RECIPE_SERIALIZER =
            SERIALIZERS.register("seed_maker", SeedMakerRecipeSerializer::new);

    public static final RegistryObject<RecipeType<SeedMakerRecipe>> SEED_MAKER_RECIPE_TYPE =
            TYPES.register("seed_maker", () -> SeedMakerRecipeType.INSTANCE);

    public static void register() {
        SERIALIZERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
