package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.EnragedTNTEntity;
import net.mcreator.allaboutengie.entity.EnragedSpeedEntity;
import net.mcreator.allaboutengie.entity.EnragedNormalEntity;

public class MutationchanceProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() >= 0.1) {
			if (entity instanceof EnragedNormalEntity) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_NORMAL_2.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_NORMAL_3.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_NORMAL_4.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_NORMAL_5.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_NORMAL_6.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_NORMAL_7.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_NORMAL_8.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_NORMAL_9.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				}
			} else if (entity instanceof EnragedTNTEntity) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_TNT_2.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_TNT_3.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_TNT_4.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_TNT_5.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_TNT_6.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_TNT_7.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_TNT_8.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_TNT_9.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				}
			} else if (entity instanceof EnragedSpeedEntity) {
				if (Mth.nextInt(RandomSource.create(), 1, 8) == 1) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_SPEED_2.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 2) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_SPEED_3.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_SPEED_4.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 4) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_SPEED_5.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 5) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_SPEED_6.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 6) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_SPEED_7.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 7) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_SPEED_8.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				} else if (Mth.nextInt(RandomSource.create(), 1, 8) == 8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = AllaboutengieModEntities.ENRAGED_SPEED_9.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					if (!entity.level().isClientSide())
						entity.discard();
				}
			}
		}
	}
}
