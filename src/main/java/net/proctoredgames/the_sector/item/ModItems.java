package net.proctoredgames.the_sector.item;

import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.proctoredgames.the_sector.TheSector;
import net.proctoredgames.the_sector.fluid.ModFluids;
import net.proctoredgames.the_sector.item.custom.PistachioItem;

public class ModItems {
    public static final Item SECTOR_FOCUSING_CRYSTAL = registerItem("sector_focusing_crystal", new Item(new Item.Settings()));

    public static final Item RAW_PISTACHIO = registerItem("raw_pistachio", new Item(new Item.Settings()));
    public static final Item PISTACHIO = registerItem("pistachio", new PistachioItem(new Item.Settings()));
    public static final Item PISTACHIO_SHELL = registerItem("pistachio_shell", new Item(new Item.Settings()));
    public static final Item SHELLED_PISTACHIO = registerItem("shelled_pistachio", new Item(new Item.Settings()));

    public static final Item LIQUID_HYDROGEN_BUCKET = registerItem("liquid_hydrogen_bucket", new BucketItem(ModFluids.LIQUID_HYDROGEN,
            new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TheSector.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TheSector.LOGGER.info("Registering Mod Items For " + TheSector.MOD_ID);
    }
}
