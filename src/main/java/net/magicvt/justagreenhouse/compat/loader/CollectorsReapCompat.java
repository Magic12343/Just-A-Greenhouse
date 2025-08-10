package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.CRCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class CollectorsReapCompat {
    public static void init(IEventBus modEventBus) {
        CRCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Collectors Reap Compat loaded.");
    }
}
