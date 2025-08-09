package net.magicvt.justagreenhouse.compat;

import net.minecraftforge.eventbus.api.IEventBus;

public class VeggiesDelightCompat
{
    public static void init(IEventBus modEventBus) {
        VDCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Veggies Delight Compat loaded.");
    }
}

