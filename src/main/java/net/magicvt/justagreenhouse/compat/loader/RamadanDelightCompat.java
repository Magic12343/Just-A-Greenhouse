package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.RDCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class RamadanDelightCompat
{
    public static void init(IEventBus modEventBus) {
        RDCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Ramadan Delight Compat loaded.");
    }
}
