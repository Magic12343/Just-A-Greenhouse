package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.CHCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class CosmopolitanHabitatCompat {
    public static void init(IEventBus modEventBus) {
        CHCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse] Cosmopolitan + Habitat Compat loaded.");
    }
}
