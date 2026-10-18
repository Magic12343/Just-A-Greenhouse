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

public class LDFCompatBlocks {
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
    public static final RegistryObject<Block> CORN_SEED_BAG_FC =
            registerBlock("corn_seed_bag_fc", SeedBagBlock::new);
    public static final RegistryObject<Block> OAT_SEED_BAG_FC =
            registerBlock("oat_seed_bag_fc", SeedBagBlock::new);
    public static final RegistryObject<Block> BARLEY_SEED_BAG_FC =
            registerBlock("barley_seed_bag_fc", SeedBagBlock::new);
    public static final RegistryObject<Block> LETTUCE_SEED_BAG_FC =
            registerBlock("lettuce_seed_bag_fc", SeedBagBlock::new);
    public static final RegistryObject<Block> TOMATO_SEED_BAG_FC =
            registerBlock("tomato_seed_bag_fc", SeedBagBlock::new);
    public static final RegistryObject<Block> STRAWBERRY_SEED_BAG_FC =
            registerBlock("strawberry_seed_bag_fc", SeedBagBlock::new);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
