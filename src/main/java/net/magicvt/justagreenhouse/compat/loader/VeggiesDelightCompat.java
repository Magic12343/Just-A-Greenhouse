package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.VDCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class VeggiesDelightCompat
{
    public static void init(IEventBus modEventBus) {
        VDCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Veggies Delight Compat loaded.");
    }
}

