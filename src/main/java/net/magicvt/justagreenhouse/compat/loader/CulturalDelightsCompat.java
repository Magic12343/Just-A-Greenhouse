package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.CDCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class CulturalDelightsCompat {
    public static void init(IEventBus modEventBus) {
        CDCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Cultural Delights Compat loaded.");
    }
}
