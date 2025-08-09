package net.magicvt.justagreenhouse.compat;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.IEventBus;

public class CompatHandler {
    public static void init(IEventBus modEventBus) {
        if (ModList.get().isLoaded("farmersdelight")) {
            FarmersDelightCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("berry_good")) {
            BerryGoodCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("atmospheric")) {
            AtmosphericCompat.init(modEventBus);
        }
    }
}
