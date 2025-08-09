package net.magicvt.justagreenhouse.compat;

import net.minecraftforge.eventbus.api.IEventBus;

public class NeapolitanCompat
{
    public static void init(IEventBus modEventBus) {
        NTCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Neapolitan Compat loaded.");
    }
}
