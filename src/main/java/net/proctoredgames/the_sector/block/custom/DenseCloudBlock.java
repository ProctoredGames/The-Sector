package net.proctoredgames.the_sector.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import static net.minecraft.entity.LivingEntity.GRAVITY;

public class DenseCloudBlock extends TransparentBlock {
    private boolean isSolid;

    private Entity lastCollidingEntity;

    public DenseCloudBlock(Settings settings) {
        super(settings);
        this.isSolid = true;
        this.lastCollidingEntity = null;
    }

    protected boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) ? true : super.isSideInvisible(state, stateFrom, direction);
    }

    protected VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!(entity instanceof LivingEntity) || entity.getBlockStateAtPos().isOf(this)) {
            this.lastCollidingEntity = entity;
            if (world.isClient) {
                Random random = world.getRandom();
                if (random.nextBoolean()) {
                    world.addParticle(ParticleTypes.RAIN, entity.getX()+random.nextDouble()-0.5, entity.getY()+random.nextDouble()*2, entity.getZ()+random.nextDouble()-0.5,0,0,0);
                }
            }
            if(Math.abs(entity.getMovement().x)>0.05 || Math.abs(entity.getMovement().z)>0.05){
                System.out.println("entity moved");
                entity.setVelocity(new Vec3d(entity.getVelocity().x, 0.2, entity.getVelocity().z));
            } else{
                entity.setVelocity(new Vec3d(entity.getVelocity().x, entity.getVelocity().y*0.2, entity.getVelocity().z));
            }
        }

        if (!world.isClient) {
            entity.setOnFire(false);
        }

    }

    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if(fallDistance>5.0){
            this.isSolid = false;
        }else{
            this.isSolid = true;
            world.scheduleBlockTick(pos, this, 100);
        }
    }

    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (context instanceof EntityShapeContext entityShapeContext) {
            Entity entity = entityShapeContext.getEntity();
            if(entity != null){
                if (canWalkOnDenseCloud(entity)) {
                    return super.getCollisionShape(state, world, pos, context);
                } else {
                    return VoxelShapes.empty();
                }
            }
        }
        return super.getCollisionShape(state, world, pos, context);
    }

    public boolean canWalkOnDenseCloud(Entity entity) {
        if (entity.getType().isIn(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS)) {
            return true;
        } else {
            return entity instanceof LivingEntity ? this.isSolid : false;
        }
    }

    protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty();
    }

    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.isSolid = false;
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if(this.lastCollidingEntity != null){
            if(!(this.isSolid) && !(this.lastCollidingEntity.getBlockStateAtPos().isOf(this))){
                this.isSolid = true;
            }
        }
    }
}
