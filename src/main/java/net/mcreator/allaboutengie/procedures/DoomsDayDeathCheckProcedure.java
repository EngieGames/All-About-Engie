package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DoomsDayDeathCheckProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
			if (entity instanceof Player) {
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayAlive == false) {
					AllaboutengieModVariables.MapVariables.get(world).DoomsDayAliveCount = AllaboutengieModVariables.MapVariables.get(world).DoomsDayAliveCount - 1;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsDayDead == true) {
					AllaboutengieModVariables.MapVariables.get(world).DoomsdayDeathCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayDeathCount + 1;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
