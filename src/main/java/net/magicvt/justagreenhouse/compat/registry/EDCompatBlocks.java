package net.magicvt.justagreenhouse.compat.registry;

import net.magicvt.justagreenhouse.JustAGreenhouse;
import net.magicvt.justagreenhouse.block.SeedBagBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class EDCompatBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JustAGreenhouse.MOD_ID);

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustAGreenhouse.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> registeredBlock = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(registeredBlock.get(), new Item.Properties()));
        return registeredBlock;
    }

    //SEED BAGS
    public static final RegistryObject<Block> STARFRUIT_SEED_BAG =
            registerBlock("starfruit_seed_bag", () -> new SeedBagBlock());
    public static final RegistryObject<Block> SLOE_BERRY_SEED_BAG =
            registerBlock("sloe_berry_seed_bag", () -> new SeedBagBlock());
    public static final RegistryObject<Block> BARLEY_SEED_BAG =
            registerBlock("barley_seed_bag", () -> new SeedBagBlock());
    public static final RegistryObject<Block> HOP_SEED_BAG =
            registerBlock("hop_seed_bag", () -> new SeedBagBlock());
    public static final RegistryObject<Block> RHUBARB_SEED_BAG =
            registerBlock("rhubarb_seed_bag", () -> new SeedBagBlock());
    public static final RegistryObject<Block> MUSCADINE_SEED_BAG =
            registerBlock("muscadine_seed_bag", () -> new SeedBagBlock());


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
