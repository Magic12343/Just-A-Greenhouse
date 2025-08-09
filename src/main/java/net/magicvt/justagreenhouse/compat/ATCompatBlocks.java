package net.magicvt.justagreenhouse.compat;

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

public class ATCompatBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JustAGreenhouse.MOD_ID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustAGreenhouse.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> ALOE_KERNELS_BAG =
            BLOCKS.register("aloe_kernels_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));
    public static final RegistryObject<Block> DRAGON_ROOTS_BAG =
            BLOCKS.register("dragon_roots_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));
    public static final RegistryObject<Block> PASSIONFRUIT_VINE_BAG =
            BLOCKS.register("passionfruit_vine_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));

    //Items
    public static final RegistryObject<Item> ALOE_KERNELS_BAG_ITEM =
            ITEMS.register("aloe_kernels_bag", () ->
                    new BlockItem(ALOE_KERNELS_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_ROOTS_BAG_ITEM =
            ITEMS.register("dragon_roots_bag", () ->
                    new BlockItem(DRAGON_ROOTS_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> PASSIONFRUIT_VINE_BAG_ITEM =
            ITEMS.register("passionfruit_vine_bag", () ->
                    new BlockItem(PASSIONFRUIT_VINE_BAG.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}