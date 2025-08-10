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

public class FDCompatBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JustAGreenhouse.MOD_ID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustAGreenhouse.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> TOMATO_SEED_BAG =
            BLOCKS.register("tomato_seed_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));
    public static final RegistryObject<Block> CABBAGE_SEED_BAG =
            BLOCKS.register("cabbage_seed_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));

    //Items
    public static final RegistryObject<Item> TOMATO_SEED_BAG_ITEM =
            ITEMS.register("tomato_seed_bag", () ->
                    new BlockItem(TOMATO_SEED_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> CABBAGE_SEED_BAG_ITEM =
            ITEMS.register("cabbage_seed_bag", () ->
                    new BlockItem(CABBAGE_SEED_BAG.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}