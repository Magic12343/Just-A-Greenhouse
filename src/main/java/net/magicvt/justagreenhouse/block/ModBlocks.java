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
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));

    public static final RegistryObject<Block> GREENHOUSE_PILLAR = registerBlock("greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> GREENHOUSE_BLOCK = registerBlock("greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> GREENHOUSE_STAIRS = registerBlock("greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> GREENHOUSE_SLAB = registerBlock("greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));


    public static final RegistryObject<DoorBlock> GREENHOUSE_DOOR = registerBlock("greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));

    public static final RegistryObject<LanternBlock> GREENHOUSE_LANTERN = registerBlock("greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));

    public static final RegistryObject<Block> GREENHOUSE_POST = registerBlock("greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));

    public static final RegistryObject<Block> FLOOR_LANTERN = registerBlock("floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));

    // Seedbags
    public static final RegistryObject<Block> WHEAT_SEED_BAG = registerBlock("wheat_seed_bag",
            () -> new SeedBagBlock());

    public static final RegistryObject<Block> MELON_SEED_BAG = registerBlock("melon_seed_bag",
            () -> new SeedBagBlock());

    public static final RegistryObject<Block> BEETROOT_SEED_BAG = registerBlock("beetroot_seed_bag",
            () -> new SeedBagBlock());

    public static final RegistryObject<Block> PUMPKIN_SEED_BAG = registerBlock("pumpkin_seed_bag",
            () -> new SeedBagBlock());

    public static final RegistryObject<Block> TORCHFLOWER_SEED_BAG = registerBlock("torchflower_seed_bag",
            () -> new SeedBagBlock());

    public static final RegistryObject<Block> PITCHER_POD_BAG = registerBlock("pitcher_pod_bag",
            () -> new SeedBagBlock());

    // Seed Makers
    public static final RegistryObject<Block> SEED_MAKER = registerBlock("seed_maker",
            () -> new SeedMakerBlock());
    public static final RegistryObject<Block> SEEDLING_GROWER = BLOCKS.register("seedling_grower",
            () -> new SeedlingGrowerBlock(BlockBehaviour.Properties.of()
                    .strength(1.5F)
                    .sound(SoundType.WOOD)
                    .noOcclusion()));



    //Colored Blocks
    public static final RegistryObject<Block> WHITE_GREENHOUSE_GLASS = registerBlock("white_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> LIGHT_GRAY_GREENHOUSE_GLASS = registerBlock("light_gray_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> GRAY_GREENHOUSE_GLASS = registerBlock("gray_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> BLACK_GREENHOUSE_GLASS = registerBlock("black_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> BROWN_GREENHOUSE_GLASS = registerBlock("brown_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> RED_GREENHOUSE_GLASS = registerBlock("red_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> ORANGE_GREENHOUSE_GLASS = registerBlock("orange_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> YELLOW_GREENHOUSE_GLASS = registerBlock("yellow_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> LIME_GREENHOUSE_GLASS = registerBlock("lime_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> CYAN_GREENHOUSE_GLASS = registerBlock("cyan_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> LIGHT_BLUE_GREENHOUSE_GLASS = registerBlock("light_blue_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> BLUE_GREENHOUSE_GLASS = registerBlock("blue_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> PURPLE_GREENHOUSE_GLASS = registerBlock("purple_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> MAGENTA_GREENHOUSE_GLASS = registerBlock("magenta_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));
    public static final RegistryObject<Block> PINK_GREENHOUSE_GLASS = registerBlock("pink_greenhouse_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).sound(SoundType.LANTERN).strength(2.0f, 3.0f)));

    public static final RegistryObject<Block> WHITE_GREENHOUSE_PILLAR = registerBlock("white_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIGHT_GRAY_GREENHOUSE_PILLAR = registerBlock("light_gray_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> GRAY_GREENHOUSE_PILLAR = registerBlock("gray_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BLACK_GREENHOUSE_PILLAR = registerBlock("black_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BROWN_GREENHOUSE_PILLAR = registerBlock("brown_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> RED_GREENHOUSE_PILLAR = registerBlock("red_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> ORANGE_GREENHOUSE_PILLAR = registerBlock("orange_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> YELLOW_GREENHOUSE_PILLAR = registerBlock("yellow_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIME_GREENHOUSE_PILLAR = registerBlock("lime_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> CYAN_GREENHOUSE_PILLAR = registerBlock("cyan_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIGHT_BLUE_GREENHOUSE_PILLAR = registerBlock("light_blue_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BLUE_GREENHOUSE_PILLAR = registerBlock("blue_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> PURPLE_GREENHOUSE_PILLAR = registerBlock("purple_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> MAGENTA_GREENHOUSE_PILLAR = registerBlock("magenta_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> PINK_GREENHOUSE_PILLAR = registerBlock("pink_greenhouse_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> WHITE_GREENHOUSE_BLOCK = registerBlock("white_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIGHT_GRAY_GREENHOUSE_BLOCK = registerBlock("light_gray_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> GRAY_GREENHOUSE_BLOCK = registerBlock("gray_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BLACK_GREENHOUSE_BLOCK = registerBlock("black_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BROWN_GREENHOUSE_BLOCK = registerBlock("brown_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> RED_GREENHOUSE_BLOCK = registerBlock("red_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> ORANGE_GREENHOUSE_BLOCK = registerBlock("orange_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> YELLOW_GREENHOUSE_BLOCK = registerBlock("yellow_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIME_GREENHOUSE_BLOCK = registerBlock("lime_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> CYAN_GREENHOUSE_BLOCK = registerBlock("cyan_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIGHT_BLUE_GREENHOUSE_BLOCK = registerBlock("light_blue_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BLUE_GREENHOUSE_BLOCK = registerBlock("blue_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> PURPLE_GREENHOUSE_BLOCK = registerBlock("purple_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> MAGENTA_GREENHOUSE_BLOCK = registerBlock("magenta_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> PINK_GREENHOUSE_BLOCK = registerBlock("pink_greenhouse_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> WHITE_GREENHOUSE_STAIRS = registerBlock("white_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIGHT_GRAY_GREENHOUSE_STAIRS = registerBlock("light_gray_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_GRAY_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> GRAY_GREENHOUSE_STAIRS = registerBlock("gray_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BLACK_GREENHOUSE_STAIRS = registerBlock("black_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BROWN_GREENHOUSE_STAIRS = registerBlock("brown_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> RED_GREENHOUSE_STAIRS = registerBlock("red_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> ORANGE_GREENHOUSE_STAIRS = registerBlock("orange_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> YELLOW_GREENHOUSE_STAIRS = registerBlock("yellow_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIME_GREENHOUSE_STAIRS = registerBlock("lime_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.LIME_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> CYAN_GREENHOUSE_STAIRS = registerBlock("cyan_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.CYAN_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIGHT_BLUE_GREENHOUSE_STAIRS = registerBlock("light_blue_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BLUE_GREENHOUSE_STAIRS = registerBlock("blue_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> PURPLE_GREENHOUSE_STAIRS = registerBlock("purple_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.PURPLE_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> MAGENTA_GREENHOUSE_STAIRS = registerBlock("magenta_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.MAGENTA_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> PINK_GREENHOUSE_STAIRS = registerBlock("pink_greenhouse_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_GREENHOUSE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                            .sound(SoundType.LANTERN)));

    public static final RegistryObject<Block> WHITE_GREENHOUSE_SLAB = registerBlock("white_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIGHT_GRAY_GREENHOUSE_SLAB = registerBlock("light_gray_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> GRAY_GREENHOUSE_SLAB = registerBlock("gray_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BLACK_GREENHOUSE_SLAB = registerBlock("black_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BROWN_GREENHOUSE_SLAB = registerBlock("brown_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> RED_GREENHOUSE_SLAB = registerBlock("red_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> ORANGE_GREENHOUSE_SLAB = registerBlock("orange_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> YELLOW_GREENHOUSE_SLAB = registerBlock("yellow_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIME_GREENHOUSE_SLAB = registerBlock("lime_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> CYAN_GREENHOUSE_SLAB = registerBlock("cyan_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> LIGHT_BLUE_GREENHOUSE_SLAB = registerBlock("light_blue_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> BLUE_GREENHOUSE_SLAB = registerBlock("blue_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> PURPLE_GREENHOUSE_SLAB = registerBlock("purple_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> MAGENTA_GREENHOUSE_SLAB = registerBlock("magenta_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));
    public static final RegistryObject<Block> PINK_GREENHOUSE_SLAB = registerBlock("pink_greenhouse_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(1.0f, 3.0f)
                    .sound(SoundType.LANTERN)));

    public static final RegistryObject<DoorBlock> WHITE_GREENHOUSE_DOOR = registerBlock("white_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> LIGHT_GRAY_GREENHOUSE_DOOR = registerBlock("light_gray_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> GRAY_GREENHOUSE_DOOR = registerBlock("gray_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> BLACK_GREENHOUSE_DOOR = registerBlock("black_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> BROWN_GREENHOUSE_DOOR = registerBlock("brown_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> RED_GREENHOUSE_DOOR = registerBlock("red_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> ORANGE_GREENHOUSE_DOOR = registerBlock("orange_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> YELLOW_GREENHOUSE_DOOR = registerBlock("yellow_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> LIME_GREENHOUSE_DOOR = registerBlock("lime_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> CYAN_GREENHOUSE_DOOR = registerBlock("cyan_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> LIGHT_BLUE_GREENHOUSE_DOOR = registerBlock("light_blue_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> BLUE_GREENHOUSE_DOOR = registerBlock("blue_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> PURPLE_GREENHOUSE_DOOR = registerBlock("purple_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> MAGENTA_GREENHOUSE_DOOR = registerBlock("magenta_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));
    public static final RegistryObject<DoorBlock> PINK_GREENHOUSE_DOOR = registerBlock("pink_greenhouse_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)
                    .strength(1.0f, 3.0f)
                    .noOcclusion()
                    .sound(SoundType.LANTERN),
                    BlockSetType.ACACIA));

    public static final RegistryObject<LanternBlock> WHITE_GREENHOUSE_LANTERN = registerBlock("white_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> LIGHT_GRAY_GREENHOUSE_LANTERN = registerBlock("light_gray_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> GRAY_GREENHOUSE_LANTERN = registerBlock("gray_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> BLACK_GREENHOUSE_LANTERN = registerBlock("black_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> BROWN_GREENHOUSE_LANTERN = registerBlock("brown_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> RED_GREENHOUSE_LANTERN = registerBlock("red_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> ORANGE_GREENHOUSE_LANTERN = registerBlock("orange_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> YELLOW_GREENHOUSE_LANTERN = registerBlock("yellow_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> LIME_GREENHOUSE_LANTERN = registerBlock("lime_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> CYAN_GREENHOUSE_LANTERN = registerBlock("cyan_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> LIGHT_BLUE_GREENHOUSE_LANTERN = registerBlock("light_blue_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> BLUE_GREENHOUSE_LANTERN = registerBlock("blue_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> PURPLE_GREENHOUSE_LANTERN = registerBlock("purple_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> MAGENTA_GREENHOUSE_LANTERN = registerBlock("magenta_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));
    public static final RegistryObject<LanternBlock> PINK_GREENHOUSE_LANTERN = registerBlock("pink_greenhouse_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN).sound(SoundType.LANTERN).strength(1.0f, 3.0f)));

    public static final RegistryObject<Block> WHITE_GREENHOUSE_POST = registerBlock("white_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> LIGHT_GRAY_GREENHOUSE_POST = registerBlock("light_gray_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> GRAY_GREENHOUSE_POST = registerBlock("gray_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> BLACK_GREENHOUSE_POST = registerBlock("black_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> BROWN_GREENHOUSE_POST = registerBlock("brown_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> RED_GREENHOUSE_POST = registerBlock("red_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> ORANGE_GREENHOUSE_POST = registerBlock("orange_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> YELLOW_GREENHOUSE_POST = registerBlock("yellow_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> LIME_GREENHOUSE_POST = registerBlock("lime_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> CYAN_GREENHOUSE_POST = registerBlock("cyan_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> LIGHT_BLUE_GREENHOUSE_POST = registerBlock("light_blue_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> BLUE_GREENHOUSE_POST = registerBlock("blue_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> PURPLE_GREENHOUSE_POST = registerBlock("purple_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> MAGENTA_GREENHOUSE_POST = registerBlock("magenta_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> PINK_GREENHOUSE_POST = registerBlock("pink_greenhouse_post",
            () -> new PostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.LANTERN).noCollission()));

    public static final RegistryObject<Block> WHITE_FLOOR_LANTERN = registerBlock("white_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> LIGHT_GRAY_FLOOR_LANTERN = registerBlock("light_gray_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> GRAY_FLOOR_LANTERN = registerBlock("gray_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> BLACK_FLOOR_LANTERN = registerBlock("black_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> BROWN_FLOOR_LANTERN = registerBlock("brown_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> RED_FLOOR_LANTERN = registerBlock("red_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> ORANGE_FLOOR_LANTERN = registerBlock("orange_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> YELLOW_FLOOR_LANTERN = registerBlock("yellow_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> LIME_FLOOR_LANTERN = registerBlock("lime_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> CYAN_FLOOR_LANTERN = registerBlock("cyan_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> LIGHT_BLUE_FLOOR_LANTERN = registerBlock("light_blue_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> BLUE_FLOOR_LANTERN = registerBlock("blue_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> PURPLE_FLOOR_LANTERN = registerBlock("purple_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> MAGENTA_FLOOR_LANTERN = registerBlock("magenta_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));
    public static final RegistryObject<Block> PINK_FLOOR_LANTERN = registerBlock("pink_floor_lantern",
            () -> new FakeFence(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.LANTERN).noCollission()));

    //Catwalks
    public static final RegistryObject<Block> CATWALK = registerBlock("catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> WHITE_CATWALK = registerBlock("white_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> LIGHT_GRAY_CATWALK = registerBlock("light_gray_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> GRAY_CATWALK = registerBlock("gray_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> BROWN_CATWALK = registerBlock("brown_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> RED_CATWALK = registerBlock("red_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> ORANGE_CATWALK = registerBlock("orange_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> YELLOW_CATWALK = registerBlock("yellow_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> LIME_CATWALK = registerBlock("lime_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> CYAN_CATWALK = registerBlock("cyan_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> LIGHT_BLUE_CATWALK = registerBlock("light_blue_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> BLUE_CATWALK = registerBlock("blue_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> PURPLE_CATWALK = registerBlock("purple_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> MAGENTA_CATWALK = registerBlock("magenta_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> PINK_CATWALK = registerBlock("pink_catwalk",
            () -> new CatwalkBlock());
    public static final RegistryObject<Block> BLACK_CATWALK = registerBlock("black_catwalk",
            () -> new CatwalkBlock());


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
