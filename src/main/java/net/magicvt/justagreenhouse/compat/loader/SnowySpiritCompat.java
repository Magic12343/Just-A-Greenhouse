package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.SNPCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class SnowySpiritCompat {
    public static void init(IEventBus modEventBus) {
        SNPCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Snowy Spirit Compat loaded.");
    }
}
