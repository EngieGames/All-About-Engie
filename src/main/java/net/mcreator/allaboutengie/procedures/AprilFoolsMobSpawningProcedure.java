package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import java.util.Calendar;

public class AprilFoolsMobSpawningProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.OVERWORLD) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 3 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 16) {
				return true;
			} else {
				return false;
			}
		} else if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.NETHER) {
			return false;
		} else if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.END) {
			return false;
		}
		return true;
	}
}
