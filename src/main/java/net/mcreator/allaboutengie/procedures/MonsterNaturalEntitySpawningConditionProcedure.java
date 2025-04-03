package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import java.util.Calendar;

public class MonsterNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.OVERWORLD) {
			if (Calendar.getInstance().get(Calendar.MONTH) == 3) {
				if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 15) {
					return false;
				}
			} else {
				return true;
			}
		}
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.NETHER) {
			return false;
		}
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == Level.END) {
			return false;
		}
		return true;
	}
}
