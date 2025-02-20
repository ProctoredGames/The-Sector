package net.proctoredgames.the_sector.fluid;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.proctoredgames.the_sector.block.ModBlocks;
import net.proctoredgames.the_sector.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public abstract class LiquidHydrogenFluid extends FlowableFluid {
    public static final IntProperty LEVEL = Properties.LEVEL_1_8;

    public LiquidHydrogenFluid() {
    }

    public Fluid getFlowing() {
        return ModFluids.LIQUID_HYDROGEN_FLOWING;
    }

    public Fluid getStill() {
        return ModFluids.LIQUID_HYDROGEN_STILL;
    }

    public Item getBucketItem() {
        return ModItems.LIQUID_HYDROGEN_BUCKET;
    }

    @Override
    public void randomDisplayTick(World world, BlockPos pos, FluidState state, Random random) {

    }

    @Override
    @Nullable
    public ParticleEffect getParticle() {
        return ParticleTypes.SCULK_CHARGE_POP;
    }

    protected boolean isInfinite(World world) {
        return false;
    }

    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
        BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropStacks(state, world, pos, blockEntity);
    }

    public int getFlowSpeed(WorldView world) {
        return 10;
    }

    public BlockState toBlockState(FluidState state) {
        return ModBlocks.LIQUID_HYDROGEN.getDefaultState().with(FluidBlock.LEVEL, getBlockStateLevel(state));
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

    public boolean matchesType(Fluid fluid) {
        return fluid == ModFluids.LIQUID_HYDROGEN_STILL || fluid == ModFluids.LIQUID_HYDROGEN_FLOWING;
    }

    public int getLevelDecreasePerBlock(WorldView world) {
        return 1;
    }


    public int getTickRate(WorldView world) {
        return 40;
    }

    public boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        //noinspection deprecation
        return direction == Direction.DOWN && !fluid.isIn(FluidTags.WATER);
    }

    protected float getBlastResistance() {
        return 100.0F;
    }

    public Optional<SoundEvent> getBucketFillSound() {
        return Optional.of(SoundEvents.ITEM_BUCKET_FILL);
    }

    public static class Flowing extends LiquidHydrogenFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        protected int getMaxFlowDistance(WorldView world) {
            return 4;
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }

    }

    public static class Still extends LiquidHydrogenFluid {
        @Override
        protected int getMaxFlowDistance(WorldView world) {
            return 4;
        }

        @Override
        public int getLevel(FluidState state) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState state) {
            return true;
        }
    }
}

