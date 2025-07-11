package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

public class TheEndNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
			return true;
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && !(AllaboutengieModVariables.MapVariables.get(world).thestart == false)) {
			return false;
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
			if (Math.random() <= 0.25) {
				return true;
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && !(world.getLevelData().isRaining() && world.getLevelData().isThundering())) {
			return false;
		}
		return false;
	}
}
