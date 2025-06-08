package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class TheEndNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
			return true;
		}
		return false;
	}
}
