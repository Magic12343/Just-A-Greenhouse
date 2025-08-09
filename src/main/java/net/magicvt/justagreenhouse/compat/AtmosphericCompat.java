package net.magicvt.justagreenhouse.compat;

import net.minecraftforge.eventbus.api.IEventBus;

public class AtmosphericCompat {
    public static void init(IEventBus modEventBus) {
        ATCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Atmospheric Compat loaded.");
    }
}
