package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.ELCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class EnlightenedCompat {
    public static void init(IEventBus modEventBus) {
        ELCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Enlightened Compat loaded.");
    }
}
