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

public class LDVCompatBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JustAGreenhouse.MOD_ID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustAGreenhouse.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> blockSupplier) {
        RegistryObject<T> block = BLOCKS.register(name, blockSupplier);
        ITEMS.register(name, () -> new net.minecraft.world.item.BlockItem(block.get(), new Item.Properties()));
        return block;
    }
    // Blocks
    public static final RegistryObject<Block> RED_GRAPE_SEED_BAG_V =
            registerBlock("red_grape_seed_bag_v", SeedBagBlock::new);
    public static final RegistryObject<Block> TAIGA_RED_GRAPE_SEED_BAG_V =
            registerBlock("taiga_red_grape_seed_bag_v", SeedBagBlock::new);
    public static final RegistryObject<Block> SAVANNA_RED_GRAPE_SEED_BAG_V =
            registerBlock("savanna_red_grape_seed_bag_v", SeedBagBlock::new);
    public static final RegistryObject<Block> JUNGLE_RED_GRAPE_SEED_BAG_V =
            registerBlock("jungle_red_grape_seed_bag_v", SeedBagBlock::new);
    public static final RegistryObject<Block> WHITE_GRAPE_SEED_BAG_V =
            registerBlock("white_grape_seed_bag_v", SeedBagBlock::new);
    public static final RegistryObject<Block> TAIGA_WHITE_GRAPE_SEED_BAG_V =
            registerBlock("taiga_white_grape_seed_bag_v", SeedBagBlock::new);
    public static final RegistryObject<Block> SAVANNA_WHITE_GRAPE_SEED_BAG_V =
            registerBlock("savanna_white_grape_seed_bag_v", SeedBagBlock::new);
    public static final RegistryObject<Block> JUNGLE_WHITE_GRAPE_SEED_BAG_V =
            registerBlock("jungle_white_grape_seed_bag_v", SeedBagBlock::new);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
