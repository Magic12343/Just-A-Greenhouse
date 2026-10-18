package net.magicvt.justagreenhouse.compat.registry;

import net.magicvt.justagreenhouse.JustAGreenhouse;
import net.magicvt.justagreenhouse.block.SeedBagBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class VIDCompatBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JustAGreenhouse.MOD_ID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustAGreenhouse.MOD_ID);

    // Helper method to register block + block item automatically
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> blockSupplier) {
        RegistryObject<T> block = BLOCKS.register(name, blockSupplier);
        ITEMS.register(name, () -> new net.minecraft.world.item.BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    // Blocks
    public static final RegistryObject<Block> GHOST_PEPPER_SEED_BAG =
            registerBlock("ghost_pepper_seed_bag", () -> new SeedBagBlock());
    public static final RegistryObject<Block> CUCUMBER_CD_SEED_BAG =
            registerBlock("cucumber_cd_seed_bag", () -> new SeedBagBlock());
    public static final RegistryObject<Block> OAT_SEED_BAG =
            registerBlock("oat_seed_bag", () -> new SeedBagBlock());

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
