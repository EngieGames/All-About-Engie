package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class CoinammountcountProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coincount);
	}
}
