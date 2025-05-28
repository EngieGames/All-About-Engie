package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class DoomsDayAliveCheckProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayAlive == true) {
			return "Currently Alive";
		}
		return "dday.overlay.alivestate=true";
	}
}
