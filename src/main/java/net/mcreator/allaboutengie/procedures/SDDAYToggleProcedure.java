package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SDDAYToggleProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level);
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMSDAY) == true) {
			AllaboutengieModVariables.MapVariables.get(world).SDDAY = true;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			if (AllaboutengieModVariables.MapVariables.get(world).SDDAYtypetoggle == false) {
				AllaboutengieModVariables.MapVariables.get(world).SDDAYtypetoggle = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			if (AllaboutengieModVariables.MapVariables.get(world).DDAYtypetoggle == true) {
				AllaboutengieModVariables.MapVariables.get(world).DDAYtypetoggle = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMSDAY) == false) {
			AllaboutengieModVariables.MapVariables.get(world).SDDAY = false;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			if (AllaboutengieModVariables.MapVariables.get(world).SDDAYtypetoggle == true) {
				AllaboutengieModVariables.MapVariables.get(world).SDDAYtypetoggle = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			if (AllaboutengieModVariables.MapVariables.get(world).DDAYtypetoggle == false) {
				AllaboutengieModVariables.MapVariables.get(world).DDAYtypetoggle = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
