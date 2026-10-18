package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.CUGCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class CosmopolitanUndergardenCompat {
    public static void init(IEventBus modEventBus) {
        CUGCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse] Cosmopolitan + Undergarden Compat loaded.");
    }
}
