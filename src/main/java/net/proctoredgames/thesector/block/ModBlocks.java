package net.proctoredgames.thesector.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.proctoredgames.thesector.TheSector;
import net.proctoredgames.thesector.block.custom.DenseCloudBlock;
import net.proctoredgames.thesector.block.custom.PistachioBlock;
import net.proctoredgames.thesector.block.custom.PistachioVineBlock;
import net.proctoredgames.thesector.block.custom.RawPistachioBlock;
import net.proctoredgames.thesector.item.custom.PistachioItem;

import java.util.function.Function;

public class ModBlocks {
    public static final Block DENSE_CLOUD = registerBlock("dense_cloud", new DenseCloudBlock(AbstractBlock.Settings.create()));

    public static final Block BLACK_GLASS_STONE = registerBlock("black_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.BLACK).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block BLUE_GLASS_STONE = registerBlock("blue_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block BROWN_GLASS_STONE = registerBlock("brown_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.BROWN).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block CYAN_GLASS_STONE = registerBlock("cyan_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.CYAN).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block GRAY_GLASS_STONE = registerBlock("gray_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.GRAY).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block GREEN_GLASS_STONE = registerBlock("green_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.GREEN).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block LIGHT_BLUE_GLASS_STONE = registerBlock("light_blue_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block LIGHT_GRAY_GLASS_STONE = registerBlock("light_gray_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.LIGHT_GRAY).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block LIME_GLASS_STONE = registerBlock("lime_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.LIME).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block MAGENTA_GLASS_STONE = registerBlock("magenta_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.MAGENTA).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block ORANGE_GLASS_STONE = registerBlock("orange_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.ORANGE).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block PINK_GLASS_STONE = registerBlock("pink_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.PINK).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block PURPLE_GLASS_STONE = registerBlock("purple_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.PURPLE).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block RED_GLASS_STONE = registerBlock("red_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.RED).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block WHITE_GLASS_STONE = registerBlock("white_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block YELLOW_GLASS_STONE = registerBlock("yellow_glass_stone", new Block(AbstractBlock.Settings.create().mapColor(DyeColor.YELLOW).instrument(NoteBlockInstrument.HAT).strength(0.3F).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block RAW_PISTACHIO_BLOCK = registerBlock("raw_pistachio_block", new RawPistachioBlock(AbstractBlock.Settings.create()));

    public static final Block PISTACHIO_BLOCK = registerBlock("pistachio_block", new PistachioBlock(AbstractBlock.Settings.create()));
    public static final Block PISTACHIO_VINE = registerBlock("pistachio_vine", new PistachioVineBlock(AbstractBlock.Settings.create()));

    public static final Block DRIPLEAF_LOG = registerBlock("dripleaf_log", new PillarBlock(AbstractBlock.Settings.create()));

    public static final Block PISTACHIO_LOG = registerBlock("pistachio_log", new PillarBlock(AbstractBlock.Settings.create()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TheSector.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TheSector.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TheSector.LOGGER.info("Registering Mod Blocks for " + TheSector.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.DENSE_CLOUD);
            entries.add(ModBlocks.BLACK_GLASS_STONE);
            entries.add(ModBlocks.BLUE_GLASS_STONE);
            entries.add(ModBlocks.BROWN_GLASS_STONE);
            entries.add(ModBlocks.CYAN_GLASS_STONE);
            entries.add(ModBlocks.GRAY_GLASS_STONE);
            entries.add(ModBlocks.GREEN_GLASS_STONE);
            entries.add(ModBlocks.LIGHT_BLUE_GLASS_STONE);
            entries.add(ModBlocks.LIGHT_GRAY_GLASS_STONE);
            entries.add(ModBlocks.LIME_GLASS_STONE);
            entries.add(ModBlocks.MAGENTA_GLASS_STONE);
            entries.add(ModBlocks.ORANGE_GLASS_STONE);
            entries.add(ModBlocks.PINK_GLASS_STONE);
            entries.add(ModBlocks.PURPLE_GLASS_STONE);
            entries.add(ModBlocks.RED_GLASS_STONE);
            entries.add(ModBlocks.WHITE_GLASS_STONE);
            entries.add(ModBlocks.YELLOW_GLASS_STONE);
            entries.add(ModBlocks.RAW_PISTACHIO_BLOCK);
            entries.add(ModBlocks.PISTACHIO_BLOCK);
            entries.add(ModBlocks.PISTACHIO_VINE);
            entries.add(ModBlocks.DRIPLEAF_LOG);
            entries.add(ModBlocks.PISTACHIO_LOG);
        });
    }
}
