package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.entity.BiblicallyAccurateEngieEntity;

public class BiblicallyAccurateEngieNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(BiblicallyAccurateEngieEntity.class, AABB.ofSize(new Vec3(x, y, z), 500, 500, 500), e -> true).isEmpty()) {
			return false;
		} else if (!(!world.getEntitiesOfClass(BiblicallyAccurateEngieEntity.class, AABB.ofSize(new Vec3(x, y, z), 500, 500, 500), e -> true).isEmpty())) {
			return true;
		}
		return false;
	}
}
