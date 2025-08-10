package net.magicvt.justagreenhouse.compat;

import net.magicvt.justagreenhouse.compat.loader.*;
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

        if (ModList.get().isLoaded("neapolitan")) {
            NeapolitanCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("ramadandelight")) {
            RamadanDelightCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("veggiesdelight")) {
            VeggiesDelightCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("delightful")) {
            DelightfulCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("hearthandharvest")) {
            HearthAndHarvestCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("collectorsreap")) {
            CollectorsReapCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("farmersrespite")) {
            FarmersRespiteCompat.init(modEventBus);
        }

    }
}
