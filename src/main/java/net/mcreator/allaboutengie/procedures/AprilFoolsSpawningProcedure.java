package net.mcreator.allaboutengie.procedures;

import java.util.Calendar;

public class AprilFoolsSpawningProcedure {
	public static boolean execute() {
		if (Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 16) {
			return true;
		} else if (!(Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 16)) {
			return false;
		}
		return false;
	}
}
