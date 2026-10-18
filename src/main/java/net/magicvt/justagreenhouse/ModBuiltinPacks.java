package net.magicvt.justagreenhouse;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.resource.PathPackResources;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import java.nio.file.Path;

@Mod.EventBusSubscriber(modid = JustAGreenhouse.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModBuiltinPacks {
    private static final Logger LOGGER = LogUtils.getLogger();

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onAddPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() == PackType.CLIENT_RESOURCES) {
            Path packPath = ModList.get()
                    .getModFileById(JustAGreenhouse.MOD_ID)
                    .getFile()
                    .findResource("resourcepacks/just_some_seedlings");

            event.addRepositorySource((consumer) -> {
                consumer.accept(Pack.readMetaAndCreate(
                        "builtin/just_some_seedlings",
                        Component.literal("Just Some Seedlings"),
                        false, // no activo por defecto
                        (name) -> new PathPackResources(name, false, packPath),
                        event.getPackType(),
                        Pack.Position.TOP,
                        PackSource.BUILT_IN
                ));
            });

            LOGGER.info("Registered builtin resource pack: Just Some Seedlings");
        }
    }
}
