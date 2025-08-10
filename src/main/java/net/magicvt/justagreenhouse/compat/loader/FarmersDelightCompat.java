package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.FDCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class FarmersDelightCompat {
    public static void init(IEventBus modEventBus) {
        FDCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Farmer's Delight Compat loaded.");
    }
}
