package net.proctoredgames.the_sector;

import net.fabricmc.api.ModInitializer;

import net.proctoredgames.the_sector.block.ModBlocks;
import net.proctoredgames.the_sector.item.ModItemGroups;
import net.proctoredgames.the_sector.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheSector implements ModInitializer {
	public static final String MOD_ID = "the_sector";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}