package net.proctoredgames.the_sector.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.HashSet;
import java.util.Set;

public class DenseCloudBlock extends TransparentBlock {
    public static final BooleanProperty ACTIVE = BooleanProperty.of("active");
    private static final VoxelShape COLLISION_SHAPE = Block.createCuboidShape(0, 0, 0, 16, 12, 16);
    private static final int ACTIVATION_TIME = 60; // 3 seconds (60 ticks)
    private final Set<Entity> collidingEntities = new HashSet<>();

    public DenseCloudBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(ACTIVE, true));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ACTIVE);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return state.get(ACTIVE) ? COLLISION_SHAPE : VoxelShapes.empty();
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (world.isClient) return;

        collidingEntities.add(entity);

        if (state.get(ACTIVE)) {
            // Check for activation conditions
            if (entity instanceof LivingEntity && (entity.fallDistance > 5)) {
                world.setBlockState(pos, state.with(ACTIVE, false));
                world.scheduleBlockTick(pos, this, ACTIVATION_TIME);
            }
        } else {
            handleEntityMovement(world, pos, entity);
        }
    }

//    private boolean hasStoodOnBlock(World world, BlockPos pos, Entity entity) {
//        // Check if entity has been on the block for at least 1 second
//        return world.getTime() - entity.getBlockPosAtPos().asLong() > 20;
//    }

    private void handleEntityMovement(World world, BlockPos pos, Entity entity) {
        Vec3d velocity = entity.getVelocity();
        double horizontalMovement = Math.hypot(velocity.x, velocity.z);

        if (horizontalMovement > 0.1) {
            // Move upward when moving horizontally
            entity.setVelocity(velocity.x, 0.3, velocity.z);
        } else {
            // Sink slowly when stationary
            entity.setVelocity(velocity.x, Math.max(velocity.y, -0.02), velocity.z);
        }

        entity.velocityModified = true;
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!world.getBlockState(pos).get(ACTIVE)){
            if (!(collidingEntities.stream().anyMatch(e -> e.getBlockPos().equals(pos)))) {
                world.setBlockState(pos, state.with(ACTIVE, true));
            }
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.get(DenseCloudBlock.ACTIVE)) {
            world.scheduleBlockTick(pos, this, DenseCloudBlock.ACTIVATION_TIME);
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1.0f;
    }
}