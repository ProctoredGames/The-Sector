package net.proctoredgames.the_sector.block;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.util.Identifier;
import net.proctoredgames.the_sector.TheSector;

public class ModBlockSetType {
    public static final BlockSetType DRIPLEAF = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(
            Identifier.of(TheSector.MOD_ID, "dripleaf"));
    public static final BlockSetType PISTACHIO = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(
            Identifier.of(TheSector.MOD_ID, "pistachio"));
    public static final BlockSetType HYDERIN = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(
            Identifier.of(TheSector.MOD_ID, "hyderin"));

    public static final BlockSetType STEEL = BlockSetTypeBuilder.copyOf(BlockSetType.OAK).register(
            Identifier.of(TheSector.MOD_ID, "steel"));

    public void init() {
    }
}