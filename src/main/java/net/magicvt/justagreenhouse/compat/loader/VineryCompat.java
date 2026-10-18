package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.LDVCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class VineryCompat {
    public static void init(IEventBus modEventBus) {
        LDVCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Lets Do Vinery Compat loaded.");
    }
}
