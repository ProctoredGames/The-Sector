package net.proctoredgames.the_sector.world.gen.feature;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class GiantDripleafTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<net.minecraft.world.gen.trunk.GiantTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return fillTrunkPlacerFields(instance).apply(instance, net.minecraft.world.gen.trunk.GiantTrunkPlacer::new);
    });

    public GiantDripleafTrunkPlacer(int i, int j, int k) {
        super(i, j, k);
    }

    protected TrunkPlacerType<?> getType() {
        return TrunkPlacerType.GIANT_TRUNK_PLACER;
    }

    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        BlockPos blockPos = startPos.down();
        setToDirt(world, replacer, random, blockPos, config);
        setToDirt(world, replacer, random, blockPos.east(), config);
        setToDirt(world, replacer, random, blockPos.south(), config);
        setToDirt(world, replacer, random, blockPos.south().east(), config);
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        boolean[] placeBlockAtBlock = {true,true,true,true,true,true,true,true};

        for(int i = 0; i < height; ++i) {
            if(placeBlockAtBlock[1]) {
                this.setLog(world, replacer, random, mutable, config, startPos, 0, i, 1);
                if (i >= height - 5) {
                    if(random.nextInt(5)==1){
                        placeBlockAtBlock[1] = false;
                    }
                }
            }
            if(placeBlockAtBlock[3]) {
                this.setLog(world, replacer, random, mutable, config, startPos, -1, i, 0);
                if (i >= height - 5) {
                    if(random.nextInt(5)==1){
                        placeBlockAtBlock[3] = false;
                    }
                }
            }
            if(placeBlockAtBlock[5]) {
                this.setLog(world, replacer, random, mutable, config, startPos, 0, i, -1);
                if (i >= height - 5) {
                    if(random.nextInt(5)==1){
                        placeBlockAtBlock[5] = false;
                    }
                }
            }
            if(placeBlockAtBlock[7]) {
                this.setLog(world, replacer, random, mutable, config, startPos, 1, i, 0);
                if (i >= height - 5) {
                    if(random.nextInt(5)==1){
                        placeBlockAtBlock[7] = false;
                    }
                }
            }

            if(placeBlockAtBlock[0]){
                this.setLog(world, replacer, random, mutable, config, startPos, 1, i, 1);
                if(random.nextInt(8)==1){
                    placeBlockAtBlock[0] = false;
                }
            }
            if(placeBlockAtBlock[2]){
                this.setLog(world, replacer, random, mutable, config, startPos, 1, i, -1);
                if(random.nextInt(8)==1){
                    placeBlockAtBlock[2] = false;
                }
            }
            if(placeBlockAtBlock[4]){
                this.setLog(world, replacer, random, mutable, config, startPos, -1, i, -1);
                if(random.nextInt(8)==1){
                    placeBlockAtBlock[4] = false;
                }
            }
            if(placeBlockAtBlock[6]){
                this.setLog(world, replacer, random, mutable, config, startPos, -1, i, 1);
                if(random.nextInt(8)==1){
                    placeBlockAtBlock[6] = false;
                }
            }
        }

        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(height), 0, true));
    }

    private void setLog(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos.Mutable tmpPos, TreeFeatureConfig config, BlockPos startPos, int dx, int dy, int dz) {
        tmpPos.set(startPos, dx, dy, dz);
        this.trySetState(world, replacer, random, tmpPos, config);
    }
}
