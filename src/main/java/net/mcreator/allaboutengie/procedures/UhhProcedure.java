package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class UhhProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if (DoubleArgumentType.getDouble(arguments, "number") == 0) {
			AllaboutengieModVariables.WorldVariables.get(world).yeah = false;
			AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
		} else if (DoubleArgumentType.getDouble(arguments, "number") == 1) {
			AllaboutengieModVariables.WorldVariables.get(world).yeah = true;
			AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
