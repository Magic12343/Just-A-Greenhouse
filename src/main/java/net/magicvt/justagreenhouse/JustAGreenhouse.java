package net.magicvt.justagreenhouse;

import com.mojang.logging.LogUtils;
import net.magicvt.justagreenhouse.block.ModBlocks;
import net.magicvt.justagreenhouse.compat.CompatHandler;
import net.magicvt.justagreenhouse.item.ModCreativeModTabs;
import net.magicvt.justagreenhouse.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(JustAGreenhouse.MOD_ID)
public class JustAGreenhouse {
    public static final String MOD_ID = "justagreenhouse";
    public static final Logger LOGGER = LogUtils.getLogger();

    public JustAGreenhouse() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registro base
        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Compatibilidad
        CompatHandler.init(modEventBus);

        // Eventos comunes
        modEventBus.addListener(this::commonSetup);

        // Eventos Forge generales
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Aquí va código de setup general, no registros
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Código del servidor
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Código cliente
        }
    }
}
