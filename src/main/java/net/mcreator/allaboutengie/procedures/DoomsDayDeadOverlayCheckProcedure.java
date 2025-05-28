package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class DoomsDayDeadOverlayCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayAlive == false) {
			return true;
		}
		return false;
	}
}
