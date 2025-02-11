package net.proctoredgames.thesector.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.proctoredgames.thesector.TheSector;
import net.proctoredgames.thesector.item.custom.PistachioItem;

public class ModItems {
    public static final Item RAW_PISTACHIO = registerItem("raw_pistachio", new Item(new Item.Settings()));
    public static final Item PISTACHIO = registerItem("pistachio", new PistachioItem(new Item.Settings()));
    public static final Item PISTACHIO_SHELL = registerItem("pistachio_shell", new Item(new Item.Settings()));
    public static final Item SHELLED_PISTACHIO = registerItem("shelled_pistachio", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TheSector.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TheSector.LOGGER.info("Registering Mod Items For " + TheSector.MOD_ID);
    }
}
