package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class DoomsDayMobsFightEachotherToggleProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
			return true;
		} else if (AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
			return true;
		}
		return false;
	}
}
