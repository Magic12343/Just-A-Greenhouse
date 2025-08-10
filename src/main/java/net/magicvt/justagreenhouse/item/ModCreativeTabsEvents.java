package net.magicvt.justagreenhouse.item;

import net.magicvt.justagreenhouse.JustAGreenhouse;
import net.magicvt.justagreenhouse.compat.registry.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustAGreenhouse.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeTabsEvents {

    @SubscribeEvent
    public static void buildCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeModTabs.GREENHOUSE_TAB.get()) {
            if (ModList.get().isLoaded("farmersdelight")) {
                if (FDCompatBlocks.TOMATO_SEED_BAG_ITEM.isPresent()) {
                    event.accept(FDCompatBlocks.TOMATO_SEED_BAG_ITEM.get());
                }
                if (FDCompatBlocks.CABBAGE_SEED_BAG_ITEM.isPresent()) {
                    event.accept(FDCompatBlocks.CABBAGE_SEED_BAG_ITEM.get());
                }

            }

            if (ModList.get().isLoaded("berry_good")) {
                if (BGCompatBlocks.SWEET_BERRIES_PIPS_BAG.isPresent()) {
                    event.accept(BGCompatBlocks.SWEET_BERRIES_PIPS_BAG_ITEM.get());
                }
                if (BGCompatBlocks.GLOW_BERRIES_PIPS_BAG.isPresent()) {
                    event.accept(BGCompatBlocks.GLOW_BERRIES_PIPS_BAG_ITEM.get());
                }

            }

            if (ModList.get().isLoaded("atmospheric")) {
                if (ATCompatBlocks.ALOE_KERNELS_BAG.isPresent()) {
                    event.accept(ATCompatBlocks.ALOE_KERNELS_BAG_ITEM.get());
                }
                if (ATCompatBlocks.DRAGON_ROOTS_BAG.isPresent()) {
                    event.accept(ATCompatBlocks.DRAGON_ROOTS_BAG_ITEM.get());
                }
                if (ATCompatBlocks.PASSIONFRUIT_VINE_BAG.isPresent()) {
                    event.accept(ATCompatBlocks.PASSIONFRUIT_VINE_BAG_ITEM.get());
                }

            }

            if (ModList.get().isLoaded("neapolitan")) {
                if (NTCompatBlocks.STRAWBERRY_PIPS_BAG.isPresent()) {
                    event.accept(NTCompatBlocks.STRAWBERRY_PIPS_BAG_ITEM.get());
                }
                if (NTCompatBlocks.MINT_SPROUTS_BAG.isPresent()) {
                    event.accept(NTCompatBlocks.MINT_SPROUTS_BAG_ITEM.get());
                }

            }

            if (ModList.get().isLoaded("ramadandelight")) {
                if (RDCompatBlocks.PARSLEY_SEED_BAG.isPresent()) {
                    event.accept(RDCompatBlocks.PARSLEY_SEED_BAG_ITEM.get());
                }

            }

            if (ModList.get().isLoaded("veggiesdelight")) {
                if (VDCompatBlocks.BELLPEPPER_SEED_BAG.isPresent()) {
                    event.accept(VDCompatBlocks.BELLPEPPER_SEED_BAG_ITEM.get());
                }
                if (VDCompatBlocks.BROCCOLI_SEED_BAG.isPresent()) {
                    event.accept(VDCompatBlocks.BROCCOLI_SEED_BAG_ITEM.get());
                }
                if (VDCompatBlocks.CAULIFLOWER_SEED_BAG.isPresent()) {
                    event.accept(VDCompatBlocks.CAULIFLOWER_SEED_BAG_ITEM.get());
                }
                if (VDCompatBlocks.GARLIC_SEED_BAG.isPresent()) {
                    event.accept(VDCompatBlocks.GARLIC_SEED_BAG_ITEM.get());
                }
                if (VDCompatBlocks.TURNIP_SEED_BAG.isPresent()) {
                    event.accept(VDCompatBlocks.TURNIP_SEED_BAG_ITEM.get());
                }
                if (VDCompatBlocks.ZUCCHINI_SEED_BAG.isPresent()) {
                    event.accept(VDCompatBlocks.ZUCCHINI_SEED_BAG_ITEM.get());
                }



            }

            if (ModList.get().isLoaded("delightful")) {
                if (DFCompatBlocks.SALMONBERRY_SEED_BAG.isPresent()) {
                    event.accept(DFCompatBlocks.SALMONBERRY_SEED_BAG_ITEM.get());
                }
                if (DFCompatBlocks.CANTALOUPE_SEED_BAG.isPresent()) {
                    event.accept(DFCompatBlocks.CANTALOUPE_SEED_BAG_ITEM.get());
                }

            }

            if (ModList.get().isLoaded("hearthandharvest")) {
                if (HHCompatBlocks.COTTON_SEED_BAG.isPresent()) {
                    event.accept(HHCompatBlocks.COTTON_SEED_BAG_ITEM.get());
                }
                if (HHCompatBlocks.BLUEBERRY_SEED_BAG.isPresent()) {
                    event.accept(HHCompatBlocks.BLUEBERRY_SEED_BAG_ITEM.get());
                }
                if (HHCompatBlocks.RASPBERRY_SEED_BAG.isPresent()) {
                    event.accept(HHCompatBlocks.RASPBERRY_SEED_BAG_ITEM.get());
                }

            }

            if (ModList.get().isLoaded("collectorsreap")) {
                if (CRCompatBlocks.POMEGRANATE_SEED_BAG.isPresent()) {
                    event.accept(CRCompatBlocks.POMEGRANATE_SEED_BAG_ITEM.get());
                }
                if (CRCompatBlocks.LIME_SEED_BAG.isPresent()) {
                    event.accept(CRCompatBlocks.LIME_SEED_BAG_ITEM.get());
                }

            }

            if (ModList.get().isLoaded("farmersrespite")) {
                if (FRCompatBlocks.TEA_SEED_BAG.isPresent()) {
                    event.accept(FRCompatBlocks.TEA_SEED_BAG_ITEM.get());
                }

            }


        }
    }
}

