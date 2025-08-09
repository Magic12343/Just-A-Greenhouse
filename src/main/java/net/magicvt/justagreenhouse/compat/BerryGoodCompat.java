package net.magicvt.justagreenhouse.compat;

import net.minecraftforge.eventbus.api.IEventBus;

public class BerryGoodCompat {
    public static void init(IEventBus modEventBus) {
        BGCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Berry Good Compat loaded.");
    }
}