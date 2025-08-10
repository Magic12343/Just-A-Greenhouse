package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.DFCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class DelightfulCompat {
    public static void init(IEventBus modEventBus) {
        DFCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Delightful Compat loaded.");
    }
}
