package net.proctoredgames.the_sector.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;

public class NonDecayableLeavesBlock extends LeavesBlock {
    public NonDecayableLeavesBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(DISTANCE, 7)).with(PERSISTENT, false)).with(WATERLOGGED, false));
    }
    @Override
    protected boolean shouldDecay(BlockState state) {
        return false;
    }
}
