package net.magicvt.justagreenhouse.compat;

import net.minecraftforge.eventbus.api.IEventBus;

public class HearthAndHarvestCompat {
    public static void init(IEventBus modEventBus) {
        HHCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Hearth and Harvest Compat loaded.");
    }
}
