
package net.mcreator.allaboutengie.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.allaboutengie.procedures.MonsterNaturalEntitySpawningConditionProcedure;
import net.mcreator.allaboutengie.procedures.DoomsDayMobsFightEachotherToggleProcedure;
import net.mcreator.allaboutengie.procedures.DamageonspawnProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.init.AllaboutengieModEntities;

import javax.annotation.Nullable;

public class AngryEngieStyle2Entity extends Monster {
	public AngryEngieStyle2Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(AllaboutengieModEntities.ANGRY_ENGIE_STYLE_2.get(), world);
	}

	public AngryEngieStyle2Entity(EntityType<AngryEngieStyle2Entity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 15;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, true, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Monster.class, true, false) {
			@Override
			public boolean canUse() {
				double x = AngryEngieStyle2Entity.this.getX();
				double y = AngryEngieStyle2Entity.this.getY();
				double z = AngryEngieStyle2Entity.this.getZ();
				Entity entity = AngryEngieStyle2Entity.this;
				Level world = AngryEngieStyle2Entity.this.level;
				return super.canUse() && DoomsDayMobsFightEachotherToggleProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = AngryEngieStyle2Entity.this.getX();
				double y = AngryEngieStyle2Entity.this.getY();
				double z = AngryEngieStyle2Entity.this.getZ();
				Entity entity = AngryEngieStyle2Entity.this;
				Level world = AngryEngieStyle2Entity.this.level;
				return super.canContinueToUse() && DoomsDayMobsFightEachotherToggleProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, (float) 6));
		this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 6));
		this.targetSelector.addGoal(8, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(10, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get()));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		DamageonspawnProcedure.execute(world, this);
		return retval;
	}

	public static void init() {
		SpawnPlacements.register(AllaboutengieModEntities.ANGRY_ENGIE_STYLE_2.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return MonsterNaturalEntitySpawningConditionProcedure.execute(world);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
		builder = builder.add(Attributes.MAX_HEALTH, 200);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 15);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
