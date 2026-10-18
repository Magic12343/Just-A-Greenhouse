package net.magicvt.justagreenhouse.compat;

import net.magicvt.justagreenhouse.compat.loader.*;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.IEventBus;

public class CompatHandler {
    public static void init(IEventBus modEventBus) {
        if (ModList.get().isLoaded("farmersdelight")) {
            FarmersDelightCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("berry_good")) {
            BerryGoodCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("atmospheric")) {
            AtmosphericCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("neapolitan")) {
            NeapolitanCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("ramadandelight")) {
            RamadanDelightCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("veggiesdelight")) {
            VeggiesDelightCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("delightful")) {
            DelightfulCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("hearthandharvest")) {
            HearthAndHarvestCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("collectorsreap")) {
            CollectorsReapCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("farmersrespite")) {
            FarmersRespiteCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("extravagantdelight")) {
            ExtravagantDelightCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("brewery")) {
            BreweryCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("farm_and_charm")) {
            FarmAndCharmCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("vinery")) {
            VineryCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("nethervinery")) {
            NetherVineryCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("fruitsdelight")) {
            FruitsDelightCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("nirvana")) {
            NirvanaCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("supplementaries")) {
            SupplementariesCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("undergarden")) {
            UndergardenCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("cosmopolitan") && ModList.get().isLoaded("habitat")) {
            CosmopolitanHabitatCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("cosmopolitan") && ModList.get().isLoaded("ars_nouveau")) {
            CosmopolitanArsNouveauCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("cosmopolitan") && ModList.get().isLoaded("undergarden")) {
            CosmopolitanUndergardenCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("ars_nouveau")) {
            ArsNouveauCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("enlightened_end")) {
            EnlightenedCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("culturaldelights")) {
            CulturalDelightsCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("vintagedelight")) {
            VintageDelightCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("windswept") && ModList.get().isLoaded("berry_good")) {
            WindsweptBerryGoodCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("hauntedharvest")) {
            HauntedHarvestCompat.init(modEventBus);
        }

        if (ModList.get().isLoaded("snowyspirit")) {
            SnowySpiritCompat.init(modEventBus);
        }

    }
}
