package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

public class DDayLightningSpawnerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == false) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:customlightning")), SoundSource.AMBIENT, (float) 0.25, (float) 0.75);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:customlightning")), SoundSource.AMBIENT, (float) 0.25, (float) 0.75, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.EXTREME_DOOMSDAY_LIGHTNING) == true) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:customlightning")), SoundSource.AMBIENT, (float) 0.25, (float) 0.5);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:customlightning")), SoundSource.AMBIENT, (float) 0.25, (float) 0.5, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:customlightning2")), SoundSource.AMBIENT, (float) 0.25, (float) 0.75);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:customlightning2")), SoundSource.AMBIENT, (float) 0.25, (float) 0.75, false);
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z - Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
				entityToSpawn.moveTo((x - Mth.nextDouble(RandomSource.create(), 1, 4)), y, (z + Mth.nextDouble(RandomSource.create(), 1, 4)), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
