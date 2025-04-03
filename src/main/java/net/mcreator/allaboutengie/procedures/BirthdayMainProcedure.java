package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class BirthdayMainProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		if (Calendar.getInstance().get(Calendar.MONTH) == 2 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 20) {
			AllaboutengieModVariables.seasonspring = true;
			AllaboutengieModVariables.seasonsummer = false;
			AllaboutengieModVariables.seasonautumn = false;
			AllaboutengieModVariables.seasonwinter = false;
		} else if (Calendar.getInstance().get(Calendar.MONTH) == 5 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 20) {
			AllaboutengieModVariables.seasonspring = false;
			AllaboutengieModVariables.seasonsummer = true;
			AllaboutengieModVariables.seasonautumn = false;
			AllaboutengieModVariables.seasonwinter = false;
		} else if (Calendar.getInstance().get(Calendar.MONTH) == 8 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 20) {
			AllaboutengieModVariables.seasonspring = false;
			AllaboutengieModVariables.seasonsummer = false;
			AllaboutengieModVariables.seasonautumn = true;
			AllaboutengieModVariables.seasonwinter = false;
		} else if (Calendar.getInstance().get(Calendar.MONTH) == 11 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 20) {
			AllaboutengieModVariables.decembercodeblock = false;
			AllaboutengieModVariables.seasonspring = false;
			AllaboutengieModVariables.seasonsummer = false;
			AllaboutengieModVariables.seasonautumn = false;
			AllaboutengieModVariables.seasonwinter = true;
		} else if (Calendar.getInstance().get(Calendar.MONTH) == 0 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1) {
			AllaboutengieModVariables.decembercodeblock = false;
		} else if (!(Calendar.getInstance().get(Calendar.MONTH) == 11 && Calendar.getInstance().get(Calendar.MONTH) == 0 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1)) {
			AllaboutengieModVariables.decembercodeblock = true;
		}
	}
}
