package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import java.util.Calendar;

public class AprilFoolsMonstrositySpawningProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.OVERWORLD) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 3) {
				if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 15) {
					return true;
				}
			}
		}
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.NETHER) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 3) {
				if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 15) {
					return true;
				}
			}
		}
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.END) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 3) {
				if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 15) {
					return false;
				}
			}
		}
		return true;
	}
}
