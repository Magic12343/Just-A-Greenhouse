package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.LDBCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class BreweryCompat {
    public static void init(IEventBus modEventBus) {
        LDBCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Lets Do Brewery Compat loaded.");
    }
}
