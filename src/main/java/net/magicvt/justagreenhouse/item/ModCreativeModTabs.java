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
                        pOutput.accept(ModBlocks.GREENHOUSE_GLASS.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_BLOCK.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_STAIRS.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_SLAB.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_PILLAR.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_DOOR.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_LANTERN.get());
                        pOutput.accept(ModBlocks.GREENHOUSE_POST.get());
                        pOutput.accept(ModBlocks.FLOOR_LANTERN.get());
                        pOutput.accept(ModBlocks.SEED_MAKER.get());
                        pOutput.accept(ModItems.HOMEWORK.get());

                        // SEEDBAGS
                        //SPRING

                        if (ModList.get().isLoaded("collectorsreap")) {
                            CRCompatBlocks.LIME_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }

                        //SPRING AUTUMN
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.BROCCOLI_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }

                        //SPRING WINTER
                        if (ModList.get().isLoaded("berry_good")) {
                            BGCompatBlocks.SWEET_BERRIES_PIPS_BAG_ITEM.ifPresent(pOutput::accept);
                        }

                        // SPRING SUMMER AUTUMN
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.GARLIC_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }

                        //SPRING AUTUMN WINTER
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.TURNIP_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }

                        //SUMMER
                        pOutput.accept(ModBlocks.MELON_SEED_BAG.get());
                        pOutput.accept(ModBlocks.TORCHFLOWER_SEED_BAG.get());
                        pOutput.accept(ModBlocks.PITCHER_POD_BAG.get());
                        if (ModList.get().isLoaded("farmersdelight")) {
                            FDCompatBlocks.TOMATO_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.ZUCCHINI_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("delightful")) {
                            DFCompatBlocks.SALMONBERRY_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("delightful")) {
                            DFCompatBlocks.CANTALOUPE_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }

                        //SUMMER AUTUMN
                        pOutput.accept(ModBlocks.WHEAT_SEED_BAG.get());
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.BELLPEPPER_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("collectorsreap")) {
                            CRCompatBlocks.POMEGRANATE_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }

                        //AUTUMN
                        pOutput.accept(ModBlocks.BEETROOT_SEED_BAG.get());
                        pOutput.accept(ModBlocks.PUMPKIN_SEED_BAG.get());

                        //AUTUMN WINTER
                        if (ModList.get().isLoaded("farmersdelight")) {
                            FDCompatBlocks.CABBAGE_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("veggiesdelight")) {
                            VDCompatBlocks.CAULIFLOWER_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }

                        //WINTER

                        //YEAR AROUND
                        if (ModList.get().isLoaded("berry_good")) {
                            BGCompatBlocks.GLOW_BERRIES_PIPS_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("atmospheric")) {
                            ATCompatBlocks.ALOE_KERNELS_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("atmospheric")) {
                            ATCompatBlocks.DRAGON_ROOTS_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("atmospheric")) {
                            ATCompatBlocks.PASSIONFRUIT_VINE_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("neapolitan")) {
                            NTCompatBlocks.STRAWBERRY_PIPS_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("neapolitan")) {
                            NTCompatBlocks.MINT_SPROUTS_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("ramadandelight")) {
                            RDCompatBlocks.PARSLEY_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("hearthandharvest")) {
                            HHCompatBlocks.COTTON_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("hearthandharvest")) {
                            HHCompatBlocks.BLUEBERRY_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("hearthandharvest")) {
                            HHCompatBlocks.RASPBERRY_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }
                        if (ModList.get().isLoaded("farmersrespite")) {
                            FRCompatBlocks.TEA_SEED_BAG_ITEM.ifPresent(pOutput::accept);
                        }

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
