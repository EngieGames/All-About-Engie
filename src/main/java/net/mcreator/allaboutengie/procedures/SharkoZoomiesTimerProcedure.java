package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.SharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.SharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.RareSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoZoomiesEntity;

public class SharkoZoomiesTimerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("sharkoZoomiesTimer", (entity.getPersistentData().getDouble("sharkoZoomiesTimer") + 0.05));
		if (entity.getPersistentData().getDouble("sharkoZoomiesTimer") >= 150) {
			if (entity instanceof SharkoZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new SharkoZoomiesTiredEntity(AllaboutengieModEntities.SHARKO_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (entity instanceof AlbinoSharkoZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new AlbinoSharkoZoomiesTiredEntity(AllaboutengieModEntities.ALBINO_SHARKO_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (entity instanceof RareSharkoZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new RareSharkoZoomiesTiredEntity(AllaboutengieModEntities.RARE_SHARKO_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (entity instanceof LegendarySharkoZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LegendarySharkoZoomiesTiredEntity(AllaboutengieModEntities.LEGENDARY_SHARKO_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (entity instanceof MythicSharkoZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MythicSharkoZoomiesTiredEntity(AllaboutengieModEntities.MYTHIC_SHARKO_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (entity instanceof ExoticSharkoZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ExoticSharkoZoomiesTiredEntity(AllaboutengieModEntities.EXOTIC_SHARKO_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (entity instanceof EngieSharkoZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EngieSharkoZoomiesTiredEntity(AllaboutengieModEntities.ENGIE_SHARKO_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (entity instanceof EngieSharkoRareZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EngieSharkoRareZoomiesTiredEntity(AllaboutengieModEntities.ENGIE_SHARKO_RARE_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (entity instanceof EngieSharkoRare2ZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EngieSharkoRare2ZoomiesTiredEntity(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
