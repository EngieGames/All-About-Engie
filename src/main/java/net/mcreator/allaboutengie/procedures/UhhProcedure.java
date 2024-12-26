package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class UhhProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (BoolArgumentType.getBool(arguments, "Statement") == false) {
			AllaboutengieModVariables.WorldVariables.get(world).yeah = false;
			AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
		} else if (BoolArgumentType.getBool(arguments, "Statement") == true) {
			AllaboutengieModVariables.WorldVariables.get(world).yeah = true;
			AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
