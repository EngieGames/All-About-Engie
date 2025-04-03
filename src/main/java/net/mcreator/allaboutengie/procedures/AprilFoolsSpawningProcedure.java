package net.mcreator.allaboutengie.procedures;

import java.util.Calendar;

public class AprilFoolsSpawningProcedure {
	public static boolean execute() {
		if (Calendar.getInstance().get(Calendar.MONTH) == 3) {
			if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 15) {
				return true;
			}
		}
		return true;
	}
}
