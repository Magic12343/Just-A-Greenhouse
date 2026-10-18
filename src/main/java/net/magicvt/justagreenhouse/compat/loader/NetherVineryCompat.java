package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.LDNVCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class NetherVineryCompat {
    public static void init(IEventBus modEventBus) {
        LDNVCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Lets Do Nether Vinery Compat loaded.");
    }
}
