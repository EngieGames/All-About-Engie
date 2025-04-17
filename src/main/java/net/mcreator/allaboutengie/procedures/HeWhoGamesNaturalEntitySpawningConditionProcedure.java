package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class HeWhoGamesNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true) {
			if (Math.random() <= 0.005) {
				return true;
			} else if (AllaboutengieModVariables.MapVariables.get(world).nightmare >= 25) {
				return false;
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == false) {
			return true;
		}
		return false;
	}
}
