package net.magicvt.justagreenhouse.item;

import net.magicvt.justagreenhouse.JustAGreenhouse;
import net.magicvt.justagreenhouse.block.ModBlocks;
import net.magicvt.justagreenhouse.compat.registry.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JustAGreenhouse.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GREENHOUSE_TAB = CREATIVE_MODE_TABS.register("greenhouse_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GREENHOUSE_GLASS.get()))
                    .title(Component.translatable("creativetab.greenhouse_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GREENHOUSE_IRON_INGOT.get());

                        pOutput.accept(ModBlocks.WHITE_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.GRAY_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.BLACK_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.BROWN_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.RED_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.ORANGE_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.YELLOW_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.LIME_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.CYAN_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.BLUE_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.PURPLE_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.MAGENTA_GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.PINK_GREENHOUSE_GLASS.get());

                        pOutput.accept(ModBlocks.WHITE_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.GRAY_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLACK_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.BROWN_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.RED_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.ORANGE_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.YELLOW_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.LIME_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.CYAN_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.BLUE_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.PURPLE_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.MAGENTA_GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.PINK_GREENHOUSE_BLOCK.get());

                        pOutput.accept(ModBlocks.WHITE_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.GRAY_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACK_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.BROWN_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.RED_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.ORANGE_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.YELLOW_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.LIME_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.CYAN_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.BLUE_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.PURPLE_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.MAGENTA_GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.PINK_GREENHOUSE_STAIRS.get());

                        pOutput.accept(ModBlocks.WHITE_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.GRAY_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.BLACK_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.BROWN_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.RED_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.ORANGE_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.YELLOW_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.LIME_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.CYAN_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.BLUE_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.PURPLE_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.MAGENTA_GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.PINK_GREENHOUSE_SLAB.get());

                        pOutput.accept(ModBlocks.WHITE_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.GRAY_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.BLACK_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.BROWN_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.RED_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.ORANGE_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.YELLOW_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.LIME_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.CYAN_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.BLUE_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.PURPLE_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.MAGENTA_GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.PINK_GREENHOUSE_PILLAR.get());

                        pOutput.accept(ModBlocks.WHITE_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.GRAY_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.BLACK_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.BROWN_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.RED_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.ORANGE_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.YELLOW_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.LIME_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.CYAN_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.BLUE_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.PURPLE_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.MAGENTA_GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.PINK_GREENHOUSE_DOOR.get());

                        pOutput.accept(ModBlocks.WHITE_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.GRAY_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.BLACK_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.BROWN_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.RED_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.ORANGE_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.YELLOW_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.LIME_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.CYAN_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.BLUE_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.PURPLE_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.MAGENTA_GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.PINK_GREENHOUSE_LANTERN.get());

                        pOutput.accept(ModBlocks.WHITE_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.GRAY_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.BLACK_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.BROWN_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.RED_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.ORANGE_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.YELLOW_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.LIME_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.CYAN_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.BLUE_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.PURPLE_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.MAGENTA_GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.PINK_GREENHOUSE_POST.get());

                        pOutput.accept(ModBlocks.WHITE_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.GRAY_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.BLACK_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.BROWN_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.RED_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.ORANGE_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.YELLOW_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.LIME_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.CYAN_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.BLUE_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.PURPLE_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.MAGENTA_FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.PINK_FLOOR_LANTERN.get());

                        pOutput.accept(ModBlocks.WHITE_CATWALK.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_CATWALK.get());
                        pOutput.accept(ModBlocks.GRAY_CATWALK.get());
                        pOutput.accept(ModBlocks.BLACK_CATWALK.get());
                        pOutput.accept(ModBlocks.BROWN_CATWALK.get());
                        pOutput.accept(ModBlocks.RED_CATWALK.get());
                        pOutput.accept(ModBlocks.ORANGE_CATWALK.get());
                        pOutput.accept(ModBlocks.YELLOW_CATWALK.get());
                        pOutput.accept(ModBlocks.LIME_CATWALK.get());
                        pOutput.accept(ModBlocks.CATWALK.get());
                        pOutput.accept(ModBlocks.CYAN_CATWALK.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_CATWALK.get());
                        pOutput.accept(ModBlocks.BLUE_CATWALK.get());
                        pOutput.accept(ModBlocks.PURPLE_CATWALK.get());
                        pOutput.accept(ModBlocks.MAGENTA_CATWALK.get());
                        pOutput.accept(ModBlocks.PINK_CATWALK.get());

                        pOutput.accept(ModBlocks.SEED_MAKER.get());
                        pOutput.accept(ModBlocks.SEEDLING_GROWER.get());
                        pOutput.accept(ModItems.HOMEWORK.get());

                        // SEEDBAGS
                        //SPRING

                        if (ModList.get().isLoaded("collectorsreap")) {
                            CRCompatBlocks.LIME_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("extravagantdelight")) {
                            EDCompatBlocks.RHUBARB_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("supplementaries")) {
                            SPCompatBlocks.FLAX_SEED_BAG.ifPresent(pOutput::accept);
                        }

                        //SPRING AUTUMN
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.BROCCOLI_SEED_BAG.ifPresent(pOutput::accept);
                        }

                        //SPRING WINTER
                        if (ModList.get().isLoaded("berry_good")) {
                            BGCompatBlocks.SWEET_BERRIES_PIPS_BAG.ifPresent(pOutput::accept);
                        }

                        //SPRING SUMMER
                        if (ModList.get().isLoaded("extravagantdelight")) {
                            EDCompatBlocks.BARLEY_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("nirvana")) {
                            NVCompatBlocks.HEMP_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("vintagedelight") && ModList.get().isLoaded("ars_nouveau")) {
                            VIDCompatBlocks.GHOST_PEPPER_SEED_BAG.ifPresent(pOutput::accept);
                            VIDCompatBlocks.CUCUMBER_CD_SEED_BAG.ifPresent(pOutput::accept);
                        }

                        // SPRING SUMMER AUTUMN
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.GARLIC_SEED_BAG.ifPresent(pOutput::accept);
                        }

                        //SPRING AUTUMN WINTER
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.TURNIP_SEED_BAG.ifPresent(pOutput::accept);
                        }

                        //SUMMER
                        pOutput.accept(ModBlocks.MELON_SEED_BAG.get());
                        pOutput.accept(ModBlocks.TORCHFLOWER_SEED_BAG.get());
                        pOutput.accept(ModBlocks.PITCHER_POD_BAG.get());
                        if (ModList.get().isLoaded("farmersdelight")) {
                            FDCompatBlocks.TOMATO_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.ZUCCHINI_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("delightful")) {
                            DFCompatBlocks.SALMONBERRY_SEED_BAG.ifPresent(pOutput::accept);
                            DFCompatBlocks.CANTALOUPE_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("collectorsreap")) {
                            CRCompatBlocks.PINK_DRAGON_FRUIT_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("fruitsdelight")) {
                            FrDCompatBlocks.HAMIMELON_SEED_BAG.ifPresent(pOutput::accept);
                            FrDCompatBlocks.LEMON_SEED_BAG.ifPresent(pOutput::accept);
                        }

                        //SUMMER AUTUMN
                        pOutput.accept(ModBlocks.WHEAT_SEED_BAG.get());
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.BELLPEPPER_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("collectorsreap")) {
                            CRCompatBlocks.POMEGRANATE_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("extravagantdelight")) {
                            EDCompatBlocks.SLOE_BERRY_SEED_BAG.ifPresent(pOutput::accept);
                            EDCompatBlocks.MUSCADINE_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("hauntedharvest") && ModList.get().isLoaded("ars_nouveau")) {
                            HAHCompatBlocks.CORN_HH_SEED_BAG.ifPresent(pOutput::accept);
                        }

                        //AUTUMN
                        pOutput.accept(ModBlocks.BEETROOT_SEED_BAG.get());
                        pOutput.accept(ModBlocks.PUMPKIN_SEED_BAG.get());

                        //AUTUMN WINTER
                        if (ModList.get().isLoaded("farmersdelight")) {
                            FDCompatBlocks.CABBAGE_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.CAULIFLOWER_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("extravagantdelight")) {
                            EDCompatBlocks.HOP_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("vintagedelight") && ModList.get().isLoaded("ars_nouveau")) {
                            VIDCompatBlocks.OAT_SEED_BAG.ifPresent(pOutput::accept);
                        }

                        //WINTER


                        //YEAR AROUND
                        if (ModList.get().isLoaded("berry_good")) {
                            BGCompatBlocks.GLOW_BERRIES_PIPS_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("atmospheric")) {
                            ATCompatBlocks.ALOE_KERNELS_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("atmospheric")) {
                            ATCompatBlocks.DRAGON_ROOTS_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("atmospheric")) {
                            ATCompatBlocks.PASSIONFRUIT_VINE_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("neapolitan")) {
                            NTCompatBlocks.STRAWBERRY_PIPS_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("neapolitan")) {
                            NTCompatBlocks.MINT_SPROUTS_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("ramadandelight")) {
                            RDCompatBlocks.PARSLEY_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("hearthandharvest")) {
                            HHCompatBlocks.COTTON_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("hearthandharvest")) {
                            HHCompatBlocks.BLUEBERRY_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("hearthandharvest")) {
                            HHCompatBlocks.RASPBERRY_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("farmersrespite")) {
                            FRCompatBlocks.TEA_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("extravagantdelight")) {
                            EDCompatBlocks.STARFRUIT_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("brewery")) {
                            LDBCompatBlocks.HOP_SEED_BAG_B.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("farm_and_charm")) {
                            LDFCompatBlocks.CORN_SEED_BAG_FC.ifPresent(pOutput::accept);
                            LDFCompatBlocks.OAT_SEED_BAG_FC.ifPresent(pOutput::accept);
                            LDFCompatBlocks.BARLEY_SEED_BAG_FC.ifPresent(pOutput::accept);
                            LDFCompatBlocks.LETTUCE_SEED_BAG_FC.ifPresent(pOutput::accept);
                            LDFCompatBlocks.TOMATO_SEED_BAG_FC.ifPresent(pOutput::accept);
                            LDFCompatBlocks.STRAWBERRY_SEED_BAG_FC.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("vinery")) {
                            LDVCompatBlocks.RED_GRAPE_SEED_BAG_V.ifPresent(pOutput::accept);
                            LDVCompatBlocks.TAIGA_RED_GRAPE_SEED_BAG_V.ifPresent(pOutput::accept);
                            LDVCompatBlocks.SAVANNA_RED_GRAPE_SEED_BAG_V.ifPresent(pOutput::accept);
                            LDVCompatBlocks.JUNGLE_RED_GRAPE_SEED_BAG_V.ifPresent(pOutput::accept);
                            LDVCompatBlocks.WHITE_GRAPE_SEED_BAG_V.ifPresent(pOutput::accept);
                            LDVCompatBlocks.TAIGA_WHITE_GRAPE_SEED_BAG_V.ifPresent(pOutput::accept);
                            LDVCompatBlocks.SAVANNA_WHITE_GRAPE_SEED_BAG_V.ifPresent(pOutput::accept);
                            LDVCompatBlocks.JUNGLE_WHITE_GRAPE_SEED_BAG_V.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("nethervinery")) {
                            LDNVCompatBlocks.CRIMSON_GRAPE_SEED_BAG_V.ifPresent(pOutput::accept);
                            LDNVCompatBlocks.WARPED_RED_GRAPE_SEED_BAG_V.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("undergarden")) {
                            UGCompatBlocks.GLOOMGOURD_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("cosmopolitan") && ModList.get().isLoaded("undergarden")) {
                            CUGCompatBlocks.BLISTERBERRY_SEED_BAG.ifPresent(pOutput::accept);
                            CUGCompatBlocks.UNDERBEANS_SEED_BAG.ifPresent(pOutput::accept);
                            CUGCompatBlocks.DROOPFRUIT_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("cosmopolitan") && ModList.get().isLoaded("habitat")) {
                            CHCompatBlocks.KABLOOM_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("cosmopolitan") && ModList.get().isLoaded("ars_nouveau")) {
                            CANCompatBlocks.SOURCE_BERRY_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("ars_nouveau") && ModList.get().isLoaded("ars_nouveau")) {
                            ANCompatBlocks.MAGEBLOOM_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("enlightened_end") && ModList.get().isLoaded("ars_nouveau")) {
                            ELCompatBlocks.ELEVIBLOOM_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("culturaldelights")) {
                            CDCompatBlocks.CUCUMBER_SEED_BAG.ifPresent(pOutput::accept);
                            CDCompatBlocks.CORN_SEED_BAG.ifPresent(pOutput::accept);
                            CDCompatBlocks.EGGPLANT_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("windswept") && ModList.get().isLoaded("berry_good")) {
                            WBGCompatBlocks.WILD_BERRY_SEED_BAG.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("snowyspirit") && ModList.get().isLoaded("ars_nouveau")) {
                            SNPCompatBlocks.GINGER_SEED_BAG.ifPresent(pOutput::accept);
                        }


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
