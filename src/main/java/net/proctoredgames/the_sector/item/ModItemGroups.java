package net.proctoredgames.the_sector.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.proctoredgames.the_sector.TheSector;
import net.proctoredgames.the_sector.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup THE_SECTOR_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheSector.MOD_ID, "the_sector_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PISTACHIO))
                    .displayName(Text.translatable("itemgroup.the_sector.the_sector_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_PISTACHIO);
                        entries.add(ModItems.PISTACHIO);
                        entries.add(ModItems.PISTACHIO_SHELL);
                        entries.add(ModItems.SHELLED_PISTACHIO);
                        // Add any new items here
                    }).build());

    public static final ItemGroup THE_SECTOR_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheSector.MOD_ID, "the_sector_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.GROWING_STYROGLYTE))
                    .displayName(Text.translatable("itemgroup.the_sector.the_sector_blocks"))
                    .entries((displayContext, entries) -> {
                        // Basic Blocks
                        entries.add(ModBlocks.STYROGLYTE);
                        entries.add(ModBlocks.GROWING_STYROGLYTE);
                        entries.add(ModBlocks.COBBLED_STYROGLYTE);
                        entries.add(ModBlocks.CHARRED_STYROGLYTE);
                        entries.add(ModBlocks.ASH);
                        entries.add(ModBlocks.DENSE_CLOUD);

                        // Glass Stones (color order)
                        entries.add(ModBlocks.WHITE_GLASS_STONE);
                        entries.add(ModBlocks.LIGHT_GRAY_GLASS_STONE);
                        entries.add(ModBlocks.GRAY_GLASS_STONE);
                        entries.add(ModBlocks.BLACK_GLASS_STONE);
                        entries.add(ModBlocks.BROWN_GLASS_STONE);
                        entries.add(ModBlocks.RED_GLASS_STONE);
                        entries.add(ModBlocks.ORANGE_GLASS_STONE);
                        entries.add(ModBlocks.YELLOW_GLASS_STONE);
                        entries.add(ModBlocks.LIME_GLASS_STONE);
                        entries.add(ModBlocks.GREEN_GLASS_STONE);
                        entries.add(ModBlocks.CYAN_GLASS_STONE);
                        entries.add(ModBlocks.LIGHT_BLUE_GLASS_STONE);
                        entries.add(ModBlocks.BLUE_GLASS_STONE);
                        entries.add(ModBlocks.PURPLE_GLASS_STONE);
                        entries.add(ModBlocks.MAGENTA_GLASS_STONE);
                        entries.add(ModBlocks.PINK_GLASS_STONE);

                        // Steel Set
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.STEEL_STAIRS);
                        entries.add(ModBlocks.STEEL_SLAB);
                        entries.add(ModBlocks.STEEL_DOOR);
                        entries.add(ModBlocks.STEEL_TRAPDOOR);
                        entries.add(ModBlocks.STEEL_CONTROL_BLOCK);

                        //pistachio Food Blocks
                        entries.add(ModBlocks.RAW_PISTACHIO_BLOCK);
                        entries.add(ModBlocks.PISTACHIO_BLOCK);
                        entries.add(ModBlocks.PISTACHIO_VINE);

                        // Pistachio Set
                        entries.add(ModBlocks.PISTACHIO_LEAVES);
                        entries.add(ModBlocks.PISTACHIO_LOG);
                        entries.add(ModBlocks.PISTACHIO_WOOD);
                        entries.add(ModBlocks.STRIPPED_PISTACHIO_LOG);
                        entries.add(ModBlocks.STRIPPED_PISTACHIO_WOOD);
                        entries.add(ModBlocks.PISTACHIO_PLANKS);
                        entries.add(ModBlocks.PISTACHIO_STAIRS);
                        entries.add(ModBlocks.PISTACHIO_SLAB);
                        entries.add(ModBlocks.PISTACHIO_FENCE);
                        entries.add(ModBlocks.PISTACHIO_FENCE_GATE);
                        entries.add(ModBlocks.PISTACHIO_DOOR);
                        entries.add(ModBlocks.PISTACHIO_TRAPDOOR);
                        entries.add(ModBlocks.PISTACHIO_PRESSURE_PLATE);
                        entries.add(ModBlocks.PISTACHIO_BUTTON);
                        entries.add(ModBlocks.PISTACHIO_SIGN);
                        entries.add(ModBlocks.PISTACHIO_HANGING_SIGN);

                        // Dripleaf Set
                        entries.add(ModBlocks.DRIPLEAF_LOG);
                        entries.add(ModBlocks.DRIPLEAF_WOOD);
                        entries.add(ModBlocks.STRIPPED_DRIPLEAF_LOG);
                        entries.add(ModBlocks.STRIPPED_DRIPLEAF_WOOD);
                        entries.add(ModBlocks.DRIPLEAF_PLANKS);
                        entries.add(ModBlocks.DRIPLEAF_STAIRS);
                        entries.add(ModBlocks.DRIPLEAF_SLAB);
                        entries.add(ModBlocks.DRIPLEAF_FENCE);
                        entries.add(ModBlocks.DRIPLEAF_FENCE_GATE);
                        entries.add(ModBlocks.DRIPLEAF_DOOR);
                        entries.add(ModBlocks.DRIPLEAF_TRAPDOOR);
                        entries.add(ModBlocks.DRIPLEAF_PRESSURE_PLATE);
                        entries.add(ModBlocks.DRIPLEAF_BUTTON);
                        entries.add(ModBlocks.DRIPLEAF_SIGN);
                        entries.add(ModBlocks.DRIPLEAF_HANGING_SIGN);

                        // Hyderin Set
                        entries.add(ModBlocks.HYDERIN_LOG);
                        entries.add(ModBlocks.HYDERIN_WOOD);
                        entries.add(ModBlocks.STRIPPED_HYDERIN_LOG);
                        entries.add(ModBlocks.STRIPPED_HYDERIN_WOOD);
                        entries.add(ModBlocks.HYDERIN_PLANKS);
                        entries.add(ModBlocks.HYDERIN_STAIRS);
                        entries.add(ModBlocks.HYDERIN_SLAB);
                        entries.add(ModBlocks.HYDERIN_FENCE);
                        entries.add(ModBlocks.HYDERIN_FENCE_GATE);
                        entries.add(ModBlocks.HYDERIN_DOOR);
                        entries.add(ModBlocks.HYDERIN_TRAPDOOR);
                        entries.add(ModBlocks.HYDERIN_PRESSURE_PLATE);
                        entries.add(ModBlocks.HYDERIN_BUTTON);
                        entries.add(ModBlocks.HYDERIN_SIGN);
                        entries.add(ModBlocks.HYDERIN_HANGING_SIGN);

                        //Gnarlweed
                        entries.add(ModBlocks.SHORT_GNARLWEED);
                        entries.add(ModBlocks.SHORT_FLOWERING_GNARLWEED);
                        entries.add(ModBlocks.SHORT_CHARRED_GNARLWEED);
                        entries.add(ModBlocks.SHORT_EMBERED_GNARLWEED);
                        entries.add(ModBlocks.TALL_GNARLWEED);
                        entries.add(ModBlocks.TALL_FLOWERING_GNARLWEED);
                        entries.add(ModBlocks.TALL_CHARRED_GNARLWEED);
                        entries.add(ModBlocks.TALL_EMBERED_GNARLWEED);

                    }).build());

    public static void registerItemGroups() {
        TheSector.LOGGER.info("Registering Item Groups for " + TheSector.MOD_ID);
    }
}