package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.CANCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class CosmopolitanArsNouveauCompat {
    public static void init(IEventBus modEventBus) {
        CANCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse] Cosmopolitan + Ars Nouveau Compat loaded.");
    }
}
