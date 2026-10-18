package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.NVCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class NirvanaCompat {
    public static void init(IEventBus modEventBus) {
        NVCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Nirvana Compat loaded.");
    }
}
