package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.TobyLayEntity;
import net.mcreator.allaboutengie.entity.TigerLayEntity;
import net.mcreator.allaboutengie.entity.MarshalLayEntity;
import net.mcreator.allaboutengie.entity.LouisLayEntity;

public class RareEngieTameLayTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("Toby")) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new TobyLayEntity(AllaboutengieModEntities.TOBY_LAY.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MarshalLayEntity(AllaboutengieModEntities.MARSHAL_LAY.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new TigerLayEntity(AllaboutengieModEntities.TIGER_LAY.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if ((entity.getDisplayName().getString()).equals("Louis")) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LouisLayEntity(AllaboutengieModEntities.LOUIS_LAY.get(), _level);
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
