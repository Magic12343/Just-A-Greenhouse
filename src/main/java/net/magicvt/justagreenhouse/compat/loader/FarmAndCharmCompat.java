package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.LDFCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class FarmAndCharmCompat {
    public static void init(IEventBus modEventBus) {
        LDFCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Lets Do Farm and Charm Compat loaded.");
    }
}
