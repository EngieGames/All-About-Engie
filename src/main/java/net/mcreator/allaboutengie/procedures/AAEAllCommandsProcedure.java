package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class AAEAllCommandsProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "MainType")).equals("Gear")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Operator")) {
				OperatorItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Starter")) {
				StarterItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Developer")) {
				DeveloperCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("IdeaGiver")) {
				IdeaGiverCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Tester")) {
				TesterGiverCommandProProcedure.execute(world, entity);
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("gear")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("operator")) {
				OperatorItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("starter")) {
				StarterItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("developer")) {
				DeveloperCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ideagiver")) {
				IdeaGiverCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("tester")) {
				TesterGiverCommandProProcedure.execute(world, entity);
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Pixelify")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Toggle")) {
				if (BoolArgumentType.getBool(arguments, "logic") == true) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items on."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = true;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				} else if (BoolArgumentType.getBool(arguments, "logic") == false) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items off."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = false;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("pixelify")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("toggle")) {
				if (BoolArgumentType.getBool(arguments, "logic") == true) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items on."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = true;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				} else if (BoolArgumentType.getBool(arguments, "logic") == false) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items off."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = false;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				}
			}
		}
	}
}
