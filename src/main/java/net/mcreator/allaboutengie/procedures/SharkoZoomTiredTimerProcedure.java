package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.SharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.SharkoEntity;
import net.mcreator.allaboutengie.entity.RareSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.RareSharkoEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.EngieSharkoEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoEntity;

public class SharkoZoomTiredTimerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("sharkoZoomiesTiredTimer", (entity.getPersistentData().getDouble("sharkoZoomiesTiredTimer") + 0.05));
		if (entity.getPersistentData().getDouble("sharkoZoomiesTiredTimer") >= 150) {
			if (entity instanceof SharkoZoomiesTiredEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new SharkoEntity(AllaboutengieModEntities.SHARKO.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof AlbinoSharkoZoomiesTiredEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new AlbinoSharkoEntity(AllaboutengieModEntities.ALBINO_SHARKO.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof RareSharkoZoomiesTiredEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new RareSharkoEntity(AllaboutengieModEntities.RARE_SHARKO.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof LegendarySharkoZoomiesTiredEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LegendarySharkoEntity(AllaboutengieModEntities.LEGENDARY_SHARKO.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof MythicSharkoZoomiesTiredEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MythicSharkoEntity(AllaboutengieModEntities.MYTHIC_SHARKO.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof ExoticSharkoZoomiesTiredEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ExoticSharkoEntity(AllaboutengieModEntities.EXOTIC_SHARKO.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoZoomiesTiredEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EngieSharkoEntity(AllaboutengieModEntities.ENGIE_SHARKO.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoRareZoomiesTiredEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EngieSharkoRareEntity(AllaboutengieModEntities.ENGIE_SHARKO_RARE.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if (entity instanceof EngieSharkoRare2ZoomiesTiredEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EngieSharkoRare2Entity(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
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
