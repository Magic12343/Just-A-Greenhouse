package net.magicvt.justagreenhouse.block;

import net.magicvt.justagreenhouse.JustAGreenhouse;
import net.magicvt.justagreenhouse.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JustAGreenhouse.MOD_ID);

    public static final RegistryObject<Block> GREENHOUSE_GLASS = registerBlock("greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> GREENHOUSE_PILLAR = registerBlock("greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> GREENHOUSE_BLOCK = registerBlock("greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> GREENHOUSE_STAIRS = registerBlock("greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> GREENHOUSE_SLAB = registerBlock("greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.LANTERN)));

    public static final RegistryObject<DoorBlock> GREENHOUSE_DOOR = registerBlock("greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.LANTERN).noOcclusion(), BlockSetType.ACACIA));

    public static final RegistryObject<LanternBlock> GREENHOUSE_LANTERN = registerBlock("greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> GREENHOUSE_POST = registerBlock("greenhouse_post",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> FLOOR_LANTERN = registerBlock("floor_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN)));

    // Seedbags
    public static final RegistryObject<Block> WHEAT_SEED_BAG = registerBlock("wheat_seed_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> MELON_SEED_BAG = registerBlock("melon_seed_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> BEETROOT_SEED_BAG = registerBlock("beetroot_seed_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PUMPKIN_SEED_BAG = registerBlock("pumpkin_seed_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> TORCHFLOWER_SEED_BAG = registerBlock("torchflower_seed_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PITCHER_POD_BAG = registerBlock("pitcher_pod_bag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL)));

    // Seed Maker
    public static final RegistryObject<Block> SEED_MAKER = registerBlock("seed_maker",
            () -> new SeedMakerBlock());

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
