package net.proctoredgames.the_sector;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.world.biome.GrassColors;
import net.proctoredgames.the_sector.block.ModBlocks;

public class TheSectorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) return GrassColors.getColor(0.5, 1.0);
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.growing_styroglyte);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.growing_styroglyte, RenderLayer.getCutoutMipped());
    }
}
