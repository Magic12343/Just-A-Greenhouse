package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.FrDCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class FruitsDelightCompat {
    public static void init(IEventBus modEventBus) {
        FrDCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Fruits Delight Compat loaded.");
    }
}
