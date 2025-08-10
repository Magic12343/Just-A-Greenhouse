package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.NTCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class NeapolitanCompat
{
    public static void init(IEventBus modEventBus) {
        NTCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Neapolitan Compat loaded.");
    }
}
