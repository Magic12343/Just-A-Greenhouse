package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.ANCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class ArsNouveauCompat {
    public static void init(IEventBus modEventBus) {
        ANCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Ars Nouveau Compat loaded.");
    }
}
