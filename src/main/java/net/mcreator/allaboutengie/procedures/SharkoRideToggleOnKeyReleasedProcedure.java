package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

public class SharkoRideToggleOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoRideToggle == true) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Toggled Big Sharko riding off."), true);
			{
				boolean _setval = false;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SharkoRideToggle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).SharkoRideToggle == false) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Toggled Big Sharko riding on."), true);
			{
				boolean _setval = true;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SharkoRideToggle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
