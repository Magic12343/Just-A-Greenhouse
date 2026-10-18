package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.SPCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class SupplementariesCompat {
    public static void init(IEventBus modEventBus) {
        SPCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Supplementaries Compat loaded.");
    }
}
