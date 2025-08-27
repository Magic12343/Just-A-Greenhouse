package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.EDCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class ExtravagantDelightCompat {
    public static void init(IEventBus modEventBus) {
        EDCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Extravagant Delight Compat loaded.");
    }
}
