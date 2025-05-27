package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OhNoProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (AllaboutengieModVariables.MapVariables.get(world).OHNO == false) {
			if (Math.random() >= 0.25) {
				AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).OHNO = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (Math.random() >= 0.5 && Math.random() < 0.25) {
				AllaboutengieModVariables.MapVariables.get(world).Risk = 2;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).OHNO = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (Math.random() >= 0.75 && Math.random() < 0.5) {
				AllaboutengieModVariables.MapVariables.get(world).Risk = 3;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).OHNO = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			} else if (Math.random() >= 1 && Math.random() < 0.75) {
				AllaboutengieModVariables.MapVariables.get(world).Risk = 4;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).OHNO = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
