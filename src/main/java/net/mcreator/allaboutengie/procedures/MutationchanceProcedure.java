package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.EnragedTNTEntity;
import net.mcreator.allaboutengie.entity.EnragedTNT9Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT8Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT7Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT6Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT5Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT4Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT3Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT2Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeedEntity;
import net.mcreator.allaboutengie.entity.EnragedSpeed9Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed8Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed7Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed6Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed5Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed4Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed3Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed2Entity;
import net.mcreator.allaboutengie.entity.EnragedNormalEntity;
import net.mcreator.allaboutengie.entity.EnragedNormal9Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal8Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal7Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal6Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal5Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal4Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal3Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal2Entity;

public class MutationchanceProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() >= 0.1) {
			if (entity instanceof EnragedNormalEntity) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal2Entity(AllaboutengieModEntities.ENRAGED_NORMAL_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal3Entity(AllaboutengieModEntities.ENRAGED_NORMAL_3.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal4Entity(AllaboutengieModEntities.ENRAGED_NORMAL_4.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal5Entity(AllaboutengieModEntities.ENRAGED_NORMAL_5.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal6Entity(AllaboutengieModEntities.ENRAGED_NORMAL_6.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal7Entity(AllaboutengieModEntities.ENRAGED_NORMAL_7.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal8Entity(AllaboutengieModEntities.ENRAGED_NORMAL_8.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedNormal9Entity(AllaboutengieModEntities.ENRAGED_NORMAL_9.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				}
			} else if (entity instanceof EnragedTNTEntity) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT2Entity(AllaboutengieModEntities.ENRAGED_TNT_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT3Entity(AllaboutengieModEntities.ENRAGED_TNT_3.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT4Entity(AllaboutengieModEntities.ENRAGED_TNT_4.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT5Entity(AllaboutengieModEntities.ENRAGED_TNT_5.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT6Entity(AllaboutengieModEntities.ENRAGED_TNT_6.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT7Entity(AllaboutengieModEntities.ENRAGED_TNT_7.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT8Entity(AllaboutengieModEntities.ENRAGED_TNT_8.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedTNT9Entity(AllaboutengieModEntities.ENRAGED_TNT_9.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				}
			} else if (entity instanceof EnragedSpeedEntity) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed2Entity(AllaboutengieModEntities.ENRAGED_SPEED_2.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed3Entity(AllaboutengieModEntities.ENRAGED_SPEED_3.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed4Entity(AllaboutengieModEntities.ENRAGED_SPEED_4.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed5Entity(AllaboutengieModEntities.ENRAGED_SPEED_5.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed6Entity(AllaboutengieModEntities.ENRAGED_SPEED_6.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed7Entity(AllaboutengieModEntities.ENRAGED_SPEED_7.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed8Entity(AllaboutengieModEntities.ENRAGED_SPEED_8.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EnragedSpeed9Entity(AllaboutengieModEntities.ENRAGED_SPEED_9.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
				}
			}
		}
	}
}
