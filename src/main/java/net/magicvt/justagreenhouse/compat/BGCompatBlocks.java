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

public class BGCompatBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JustAGreenhouse.MOD_ID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustAGreenhouse.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> SWEET_BERRIES_PIPS_BAG =
            BLOCKS.register("sweet_berries_pips_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f)));
    public static final RegistryObject<Block> GLOW_BERRIES_PIPS_BAG =
            BLOCKS.register("glow_berries_pips_bag", () ->
                    new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).strength(1.0f).lightLevel(state -> 14) ));

    //Items
    public static final RegistryObject<Item> SWEET_BERRIES_PIPS_BAG_ITEM =
            ITEMS.register("sweet_berries_pips_bag", () ->
                    new BlockItem(SWEET_BERRIES_PIPS_BAG.get(), new Item.Properties()));
    public static final RegistryObject<Item> GLOW_BERRIES_PIPS_BAG_ITEM =
            ITEMS.register("glow_berries_pips_bag", () ->
                    new BlockItem(GLOW_BERRIES_PIPS_BAG.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}