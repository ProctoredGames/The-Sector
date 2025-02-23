package net.proctoredgames.the_sector.block;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;
import net.proctoredgames.the_sector.TheSector;

public class ModWoodType {
    public static final WoodType DRIPLEAF = WoodTypeBuilder.copyOf(WoodType.OAK).register(
            Identifier.of(TheSector.MOD_ID, "dripleaf"), ModBlockSetType.DRIPLEAF);
    public static final WoodType PISTACHIO = WoodTypeBuilder.copyOf(WoodType.OAK).register(
            Identifier.of(TheSector.MOD_ID, "pistachio"), ModBlockSetType.PISTACHIO);
    public static final WoodType HYDERIN = WoodTypeBuilder.copyOf(WoodType.OAK).register(
            Identifier.of(TheSector.MOD_ID, "hyderin"), ModBlockSetType.HYDERIN);

    public void init() {
    }
}