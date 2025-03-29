package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SharkoRetryTimerProcedure {
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
		if (AllaboutengieModVariables.MapVariables.get(world).SharkoRetryState == true) {
			entity.getPersistentData().putDouble("SharkoRCTameRetry", (entity.getPersistentData().getDouble("SharkoRCTameRetry") + 0.05));
			if (entity.getPersistentData().getDouble("SharkoRCTameRetry") >= 60) {
				AllaboutengieModVariables.MapVariables.get(world).SharkoRetryState = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
