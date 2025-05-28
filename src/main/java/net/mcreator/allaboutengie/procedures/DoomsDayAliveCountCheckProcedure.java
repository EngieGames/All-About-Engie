package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class DoomsDayAliveCountCheckProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayAlive == true) {
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DDAYAliveNoSpam == false) {
					{
						boolean _setval = true;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DDAYAliveNoSpam = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					AllaboutengieModVariables.MapVariables.get(world).DoomsDayAliveCount = AllaboutengieModVariables.MapVariables.get(world).DoomsDayAliveCount + 1;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
		if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayAliveCount > world.players().size()) {
			AllaboutengieModVariables.MapVariables.get(world).DoomsDayAliveCount = world.players().size();
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
