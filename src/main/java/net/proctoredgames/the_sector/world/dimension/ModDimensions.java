package net.proctoredgames.the_sector.world.dimension;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.proctoredgames.the_sector.TheSector;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> THE_SECTOR = RegistryKey.of(RegistryKeys.DIMENSION,
            Identifier.of(TheSector.MOD_ID,"the_sector"));
    public static final RegistryKey<World> THE_SECTOR_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(TheSector.MOD_ID, "the_sector"));

    public static final RegistryKey<DimensionType> THE_SECTOR_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            Identifier.of(TheSector.MOD_ID, "the_sector_type"));
}
