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

        //Registers
        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        //Setup
        modEventBus.addListener(this::commonSetup);

        //Events
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        //Compat Handler
        CompatHandler.init(event, FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Server Events
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Código cuando inicia el servidor
    }

    //Client Events
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Others
        }
    }
}
