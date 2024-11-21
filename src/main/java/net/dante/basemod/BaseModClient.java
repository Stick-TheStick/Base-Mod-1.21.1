package net.dante.basemod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.dante.basemod.block.ModBlocks; // Adjust this import as needed

public class BaseModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WITHERED_GRASS, RenderLayer.getCutout());
    }
}
