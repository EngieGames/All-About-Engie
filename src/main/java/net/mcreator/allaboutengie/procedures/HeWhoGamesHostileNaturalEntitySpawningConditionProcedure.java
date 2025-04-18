package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.HeWhoGamesHostileEntity;

public class HeWhoGamesHostileNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!(!world.getEntitiesOfClass(HeWhoGamesHostileEntity.class, AABB.ofSize(new Vec3(x, y, z), 100000, 100000, 100000), e -> true).isEmpty()) && AllaboutengieModVariables.MapVariables.get(world).nightmare >= 25
				&& AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true) {
			return true;
		} else if (!(AllaboutengieModVariables.MapVariables.get(world).nightmare >= 25 && AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true)) {
			return false;
		} else if (!(AllaboutengieModVariables.MapVariables.get(world).nightmare < 25)) {
			return false;
		} else if (!(AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true)) {
			return false;
		}
		return true;
	}
}
