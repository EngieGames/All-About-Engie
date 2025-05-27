package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TimeCheckProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == false || AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == false) {
			AllaboutengieModVariables.MapVariables.get(world).timebeforespecial = world.dayTime();
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
