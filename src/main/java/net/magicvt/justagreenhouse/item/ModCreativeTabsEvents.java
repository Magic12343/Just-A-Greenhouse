package net.magicvt.justagreenhouse.item;

import net.magicvt.justagreenhouse.JustAGreenhouse;
import net.magicvt.justagreenhouse.compat.FDCompatBlocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JustAGreenhouse.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeTabsEvents {

    @SubscribeEvent
    public static void buildCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeModTabs.TUTORIAL_TAB.get()) {
            if (ModList.get().isLoaded("farmersdelight")) {
                if (FDCompatBlocks.TOMATO_SEED_BAG_ITEM.isPresent()) {
                    event.accept(FDCompatBlocks.TOMATO_SEED_BAG_ITEM.get());
                }
                if (FDCompatBlocks.CABBAGE_SEED_BAG_ITEM.isPresent()) {
                    event.accept(FDCompatBlocks.CABBAGE_SEED_BAG_ITEM.get());
                }
            }
        }
    }
}

