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

public class VDCompatBlocks {
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
    public static final RegistryObject<Block> BELLPEPPER_SEED_BAG =
            registerBlock("bellpepper_seed_bag", SeedBagBlock::new);
    public static final RegistryObject<Block> BROCCOLI_SEED_BAG =
            registerBlock("broccoli_seed_bag", SeedBagBlock::new);
    public static final RegistryObject<Block> CAULIFLOWER_SEED_BAG =
            registerBlock("cauliflower_seed_bag", SeedBagBlock::new);
    public static final RegistryObject<Block> GARLIC_SEED_BAG =
            registerBlock("garlic_seed_bag", SeedBagBlock::new);
    public static final RegistryObject<Block> TURNIP_SEED_BAG =
            registerBlock("turnip_seed_bag", SeedBagBlock::new);
    public static final RegistryObject<Block> ZUCCHINI_SEED_BAG =
            registerBlock("zucchini_seed_bag", SeedBagBlock::new);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
