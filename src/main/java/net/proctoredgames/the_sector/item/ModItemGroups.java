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

                    }).build());

    public static final ItemGroup THE_SECTOR_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheSector.MOD_ID, "the_sector_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DENSE_CLOUD))
                    .displayName(Text.translatable("itemgroup.the_sector.the_sector_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DENSE_CLOUD);
                        entries.add(ModBlocks.STYROGLYTE);
                        entries.add(ModBlocks.MOSSY_STYROGLYTE);
                        entries.add(ModBlocks.BLACK_GLASS_STONE);
                        entries.add(ModBlocks.GRAY_GLASS_STONE);
                        entries.add(ModBlocks.GREEN_GLASS_STONE);
                        entries.add(ModBlocks.BLUE_GLASS_STONE);
                        entries.add(ModBlocks.CYAN_GLASS_STONE);
                        entries.add(ModBlocks.BROWN_GLASS_STONE);
                        entries.add(ModBlocks.LIGHT_BLUE_GLASS_STONE);
                        entries.add(ModBlocks.LIGHT_GRAY_GLASS_STONE);
                        entries.add(ModBlocks.MAGENTA_GLASS_STONE);
                        entries.add(ModBlocks.ORANGE_GLASS_STONE);
                        entries.add(ModBlocks.PINK_GLASS_STONE);
                        entries.add(ModBlocks.PURPLE_GLASS_STONE);
                        entries.add(ModBlocks.LIME_GLASS_STONE);
                        entries.add(ModBlocks.RED_GLASS_STONE);
                        entries.add(ModBlocks.WHITE_GLASS_STONE);
                        entries.add(ModBlocks.YELLOW_GLASS_STONE);

                    }).build());



    public static void registerItemGroups() {
        TheSector.LOGGER.info("Registering Item Groups for " + TheSector.MOD_ID);
    }
}
