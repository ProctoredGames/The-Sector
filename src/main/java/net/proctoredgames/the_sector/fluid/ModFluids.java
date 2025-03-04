package net.proctoredgames.the_sector.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.proctoredgames.the_sector.TheSector;

public class ModFluids {
    public static final FlowableFluid LIQUID_HYDROGEN = register("liquid_hydrogen_still", new LiquidHydrogenFluid.Still());
    public static final FlowableFluid FLOWING_LIQUID_HYDROGEN = register("liquid_hydrogen_flow", new LiquidHydrogenFluid.Flowing());


    private static FlowableFluid register(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registries.FLUID, Identifier.of(TheSector.MOD_ID, name), flowableFluid);
    }
}
