package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class DoomsDayAliveDeathCountDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
			return true;
		} else if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
			return true;
		}
		return false;
	}
}
