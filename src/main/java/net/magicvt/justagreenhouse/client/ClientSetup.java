package net.magicvt.justagreenhouse.client;

import net.magicvt.justagreenhouse.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = "justagreenhouse", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SEEDLING_GROWER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_CATWALK.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_CATWALK.get(), RenderType.cutout());
        });
    }
}
