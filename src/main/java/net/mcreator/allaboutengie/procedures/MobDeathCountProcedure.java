package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.entity.InsanityEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieEntity;
import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorEntity;

public class MobDeathCountProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof MadEngieEntity && sourceentity instanceof Player) {
			{
				double _setval = (entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount + 1;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AngryEngieKillCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof AngryEngieEntity && sourceentity instanceof Player) {
			{
				double _setval = (entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount + 1;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AngryEngieKillCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof EnragedEngieEntity && sourceentity instanceof Player) {
			{
				double _setval = (entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount + 1;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EnragedEngieKillCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof AngryCreatorEntity && sourceentity instanceof Player) {
			{
				double _setval = (entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount + 1;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.OutragedEngieKillCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity instanceof InsanityEntity && sourceentity instanceof Player) {
			{
				double _setval = (entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount + 1;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.InsanityKillCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
