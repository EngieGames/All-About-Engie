package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class DoomsdayAliveCountUICheckProcedure {
	public static String execute(LevelAccessor world) {
		return new java.text.DecimalFormat("##").format(AllaboutengieModVariables.MapVariables.get(world).DoomsDayAliveCount);
	}
}
