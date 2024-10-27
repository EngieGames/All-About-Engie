package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.EngieGamesGUIEntity;

public class GUIRenderProcedure {
	public static Entity execute(LevelAccessor world) {
		return world instanceof Level _level ? new EngieGamesGUIEntity(AllaboutengieModEntities.ENGIE_GAMES_GUI.get(), _level) : null;
	}
}
