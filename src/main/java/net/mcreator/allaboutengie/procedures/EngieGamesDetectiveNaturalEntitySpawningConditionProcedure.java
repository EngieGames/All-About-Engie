package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

public class EngieGamesDetectiveNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE) == true) {
			return true;
		}
		return false;
	}
}
