package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.entity.BiblicallyAccurateEngieEntity;

public class BiblicallyAccurateEngieOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(BiblicallyAccurateEngieEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty()) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else if (!(!world.getEntitiesOfClass(BiblicallyAccurateEngieEntity.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty())) {
			if (Math.random() > 0.25) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
