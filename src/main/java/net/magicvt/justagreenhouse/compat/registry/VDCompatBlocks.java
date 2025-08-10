package net.magicvt.justagreenhouse.compat.registry;

import net.magicvt.justagreenhouse.JustAGreenhouse;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VDCompatBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JustAGreenhouse.MOD_ID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustAGreenhouse.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> BELLPEPPER_SEED_BAG =
            BLOCKS.register("bellpepper_seed_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));
    public static final RegistryObject<Block> BROCCOLI_SEED_BAG =
            BLOCKS.register("broccoli_seed_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));
    public static final RegistryObject<Block> CAULIFLOWER_SEED_BAG =
            BLOCKS.register("cauliflower_seed_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));
    public static final RegistryObject<Block> GARLIC_SEED_BAG =
            BLOCKS.register("garlic_seed_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));
    public static final RegistryObject<Block> TURNIP_SEED_BAG =
            BLOCKS.register("turnip_seed_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));
    public static final RegistryObject<Block> ZUCCHINI_SEED_BAG =
            BLOCKS.register("zucchini_seed_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));

    //Items
    public static final RegistryObject<Item> BELLPEPPER_SEED_BAG_ITEM =
            ITEMS.register("bellpepper_seed_bag", () ->
                    new BlockItem(BELLPEPPER_SEED_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROCCOLI_SEED_BAG_ITEM =
            ITEMS.register("broccoli_seed_bag", () ->
                    new BlockItem(BROCCOLI_SEED_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> CAULIFLOWER_SEED_BAG_ITEM =
            ITEMS.register("cauliflower_seed_bag", () ->
                    new BlockItem(CAULIFLOWER_SEED_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> GARLIC_SEED_BAG_ITEM =
            ITEMS.register("garlic_seed_bag", () ->
                    new BlockItem(GARLIC_SEED_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> TURNIP_SEED_BAG_ITEM =
            ITEMS.register("turnip_seed_bag", () ->
                    new BlockItem(TURNIP_SEED_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZUCCHINI_SEED_BAG_ITEM =
            ITEMS.register("zucchini_seed_bag", () ->
                    new BlockItem(ZUCCHINI_SEED_BAG.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}