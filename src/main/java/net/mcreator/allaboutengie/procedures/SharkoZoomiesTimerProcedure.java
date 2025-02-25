package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.SharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoZoomiesEntity;

public class SharkoZoomiesTimerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("sharkoZoomiesTimer", (entity.getPersistentData().getDouble("sharkoZoomiesTimer") + 0.05));
		if (entity.getPersistentData().getDouble("sharkoZoomiesTimer") >= 150) {
			if (entity instanceof SharkoZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:sharko_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof AlbinoSharkoZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:albino_sharko_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof RareSharkoZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:rare_sharko_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof LegendarySharkoZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:legendary_sharko_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof MythicSharkoZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:mythic_sharko_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof ExoticSharkoZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:exotic_sharko_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof EngieSharkoZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof EngieSharkoRareZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof EngieSharkoRare2ZoomiesEntity) {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_zoomies_tired ~ ~ ~");
					}
				}
			}
		}
	}
}
