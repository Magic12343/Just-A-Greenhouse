package net.magicvt.justagreenhouse.compat;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class FarmersDelightCompat {

    public static void init(FMLCommonSetupEvent event, IEventBus modEventBus) {
        System.out.println("[JustAGreenhouse] Loading Farmer's Delight content.");
        FDCompatBlocks.register(modEventBus);
    }
}
