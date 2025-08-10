package net.magicvt.justagreenhouse.item;
import net.magicvt.justagreenhouse.sounds.ModSounds;

import net.magicvt.justagreenhouse.JustAGreenhouse;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JustAGreenhouse.MOD_ID);

    public static final RegistryObject<Item> GREENHOUSE_IRON_INGOT = ITEMS.register("greenhouse_iron_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HOMEWORK = ITEMS.register("homework_music_disc",
            () -> new RecordItem(6, ModSounds.HOMEWORK, new Item.Properties().stacksTo(1), 4320));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
