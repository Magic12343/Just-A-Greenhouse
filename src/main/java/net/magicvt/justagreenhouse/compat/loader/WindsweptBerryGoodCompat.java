package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.WBGCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class WindsweptBerryGoodCompat {
    public static void init(IEventBus modEventBus) {
        WBGCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Windswept + Berry Good Compat loaded.");
    }
}
