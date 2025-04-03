package net.mcreator.allaboutengie.procedures;

import java.util.Calendar;

public class AprilFoolsDespawningProcedure {
	public static boolean execute() {
		if (Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 15) {
			return false;
		}
		return true;
	}
}
