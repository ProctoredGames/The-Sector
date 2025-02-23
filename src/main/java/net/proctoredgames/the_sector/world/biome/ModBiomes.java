package net.proctoredgames.the_sector.world.biome;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.proctoredgames.the_sector.TheSector;

public class ModBiomes {
    public static final RegistryKey<Biome> CHARRED_WASTELANDS = register("charred_wastelands");
    public static final RegistryKey<Biome> CLOUD_FIELDS = register("cloud_fields");
    public static final RegistryKey<Biome> CRACKED_GLASSLANDS = register("cracked_glasslands");
    public static final RegistryKey<Biome> DRIPLEAF_JUNGLE = register("dripleaf_jungle");
    public static final RegistryKey<Biome> HYDROGEN_RIVER = register("hydrogen_river");
    public static final RegistryKey<Biome> HYDROGEN_SEA = register("hydrogen_sea");
    public static final RegistryKey<Biome> HYDROGEN_SWAMP = register("hydrogen_swamp");
    public static final RegistryKey<Biome> PISTACHIO_FOREST = register("pistachio_forest");
    public static final RegistryKey<Biome> SECTOR_PLAINS = register("sector_plains");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, Identifier.of(TheSector.MOD_ID, name));
    }
}
