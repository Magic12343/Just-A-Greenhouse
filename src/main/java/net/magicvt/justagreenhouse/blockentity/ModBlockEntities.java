package net.magicvt.justagreenhouse.blockentity;

import net.magicvt.justagreenhouse.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = "justagreenhouse", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "justagreenhouse");

    public static final RegistryObject<BlockEntityType<SeedMakerBlockEntity>> SEED_MAKER =
            BLOCK_ENTITIES.register("seed_maker",
                    () -> BlockEntityType.Builder.of(SeedMakerBlockEntity::new,
                            ModBlocks.SEED_MAKER.get()).build(null));

    public static void register() {
        BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
