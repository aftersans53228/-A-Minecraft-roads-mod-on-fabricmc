package net.aftersans53228.aft_fabroads;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class FabroadsClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //client Initialize
        //普通方块
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.RoadBlock, RenderLayer.getCutoutMipped());
        //地面划线
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.LineStraight, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.LineCorner, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.LineTshaped, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.LineCross, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.LineDiagonal, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.LineLeftBend, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.LineRightBend, RenderLayer.getCutout());
        //地面箭头
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowForward, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowLeft, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowRight, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowForwardLeft, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowForwardRight, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowBack, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowLeftRight, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowBackLeft, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowBackForward, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowConfluenceLeft, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FabroadsMod.ArrowConfluenceRight, RenderLayer.getCutout());
    }
}
