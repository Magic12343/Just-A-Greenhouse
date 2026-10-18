package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.UGCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class UndergardenCompat {
    public static void init(IEventBus modEventBus) {
        UGCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Undergarden Compat loaded.");
    }
}
