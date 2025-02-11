package net.proctoredgames.thesector;

import net.fabricmc.api.ModInitializer;

import net.proctoredgames.thesector.block.ModBlocks;
import net.proctoredgames.thesector.item.ModItemGroups;
import net.proctoredgames.thesector.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheSector implements ModInitializer {
	public static final String MOD_ID = "thesector";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}