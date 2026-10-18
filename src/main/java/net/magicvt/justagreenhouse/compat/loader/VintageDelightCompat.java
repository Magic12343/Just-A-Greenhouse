package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.VIDCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class VintageDelightCompat {
    public static void init(IEventBus modEventBus) {
        VIDCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Vintage Delight Compat loaded.");
    }
}
