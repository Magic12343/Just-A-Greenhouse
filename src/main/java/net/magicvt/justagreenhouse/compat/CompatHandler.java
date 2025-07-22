package net.magicvt.justagreenhouse.compat;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class CompatHandler {

    public static void init(FMLCommonSetupEvent event, IEventBus modEventBus) {
        if (ModList.get().isLoaded("farmersdelight")) {
            FarmersDelightCompat.init(event, modEventBus);
        }
    }
}
