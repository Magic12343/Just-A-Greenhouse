package net.magicvt.justagreenhouse.compat.loader;

import net.magicvt.justagreenhouse.compat.registry.HAHCompatBlocks;
import net.minecraftforge.eventbus.api.IEventBus;

public class HauntedHarvestCompat {
    public static void init(IEventBus modEventBus) {
        HAHCompatBlocks.register(modEventBus);
        System.out.println("[JustAGreenhouse]Haunted Harvest Compat loaded.");
    }
}
