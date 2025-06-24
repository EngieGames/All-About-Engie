package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

public class SuperDoomsDayNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
			return true;
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
			return true;
		}
		return false;
	}
}
