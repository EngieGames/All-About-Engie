package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.SharkoEntity;
import net.mcreator.allaboutengie.entity.RareSharkoEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.EngieSharkoEntity;
import net.mcreator.allaboutengie.entity.BigSharkoEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoEntity;

public class ChanceForBigSharkoProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.25) {
			if (entity instanceof SharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigSharkoEntity(AllaboutengieModEntities.BIG_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof AlbinoSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigAlbinoSharkoEntity(AllaboutengieModEntities.BIG_ALBINO_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof RareSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigRareSharkoEntity(AllaboutengieModEntities.BIG_RARE_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EpicSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigEpicSharkoEntity(AllaboutengieModEntities.BIG_EPIC_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof LegendarySharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigLegendarySharkoEntity(AllaboutengieModEntities.BIG_LEGENDARY_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof MythicSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigMythicSharkoEntity(AllaboutengieModEntities.BIG_MYTHIC_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof ExoticSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigExoticSharkoEntity(AllaboutengieModEntities.BIG_EXOTIC_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigEngieSharkoEntity(AllaboutengieModEntities.BIG_ENGIE_SHARKO.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoRareEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigEngieSharkoRareEntity(AllaboutengieModEntities.BIG_ENGIE_SHARKO_RARE.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoRare2Entity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BigEngieSharkoRare2Entity(AllaboutengieModEntities.BIG_TIGER_SHARKO.get(), _level);
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
