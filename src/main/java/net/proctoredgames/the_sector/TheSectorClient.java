package net.proctoredgames.the_sector;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.world.biome.GrassColors;
import net.proctoredgames.the_sector.block.ModBlocks;
import net.proctoredgames.the_sector.fluid.ModFluids;

public class TheSectorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) return GrassColors.getColor(0.5, 1.0);
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GROWING_STYROGLYTE);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GROWING_STYROGLYTE, RenderLayer.getCutoutMipped());
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 13172654, ModBlocks.GROWING_STYROGLYTE);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> 1886525, ModBlocks.PISTACHIO_LEAVES);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PISTACHIO_LEAVES, RenderLayer.getCutoutMipped());
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 1886525, ModBlocks.PISTACHIO_LEAVES);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_GLASS_STONE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_GLASS_STONE, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DENSE_CLOUD, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STEEL_TRAPDOOR, RenderLayer.getCutoutMipped());

        BlockRenderLayerMap.INSTANCE.putFluid(ModFluids.LIQUID_HYDROGEN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putFluid(ModFluids.FLOWING_LIQUID_HYDROGEN, RenderLayer.getTranslucent());

    }
}
