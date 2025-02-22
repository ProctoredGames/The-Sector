package net.proctoredgames.the_sector.mixin;

import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.tag.TagKey;
import net.proctoredgames.the_sector.tags.ModFluidTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public class LiquidHydrogenEntityMixin {
    @Shadow public boolean inPowderSnow;
    boolean firstUpdate = true;
    protected Object2DoubleMap<TagKey<Fluid>> fluidHeight;
    public boolean isInLiquidHydrogen() {
        return !this.firstUpdate && this.fluidHeight.getDouble(ModFluidTags.LIQUID_HYDROGEN) > 0.0;
    }

    @Inject(method = "baseTick", at = @At("HEAD"), cancellable = true)
    public void customBaseTick(CallbackInfo ci) {
        if(this.isInLiquidHydrogen()){
            this.inPowderSnow = true;
        }
    }
}
