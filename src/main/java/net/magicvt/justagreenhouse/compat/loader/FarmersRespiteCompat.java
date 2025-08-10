package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.FRCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class FarmersRespiteCompat {
    public static void init(IEventBus modEventBus) {
        FRCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Farmers Respite Compat loaded.");
    }
}
