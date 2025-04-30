package net.mcreator.allaboutengie.procedures;

import java.util.Calendar;

public class AprilFoolsDespawningProcedure {
	public static boolean execute() {
		if (Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 16) {
			return false;
		} else if (!(Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 16)) {
			return true;
		}
		return true;
	}
}
