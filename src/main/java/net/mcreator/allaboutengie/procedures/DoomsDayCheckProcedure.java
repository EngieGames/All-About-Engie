package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class DoomsDayCheckProcedure {
	public static boolean execute(LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
			return true;
		}
		return false;
	}
}
