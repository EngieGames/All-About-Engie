package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.TobyLayEntity;
import net.mcreator.allaboutengie.entity.TigerLayEntity;
import net.mcreator.allaboutengie.entity.SharkoLayEntity;
import net.mcreator.allaboutengie.entity.SharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.PBELayEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MarshalLayEntity;
import net.mcreator.allaboutengie.entity.LouisLayEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.CosmoLayEntity;
import net.mcreator.allaboutengie.entity.CBELayEntity;
import net.mcreator.allaboutengie.entity.BuddyLayEntity;
import net.mcreator.allaboutengie.entity.Bothan2netLayEntity;
import net.mcreator.allaboutengie.entity.BigSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoLayEntity;
import net.mcreator.allaboutengie.entity.AtlasLayEntity;
import net.mcreator.allaboutengie.entity.ApolloLayEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class SharkoChanceForSleepProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
			if (Math.random() <= 0.5) {
				if (entity instanceof BigSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigAlbinoSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_albino_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigRareSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEpicSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigLegendarySharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_legendary_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigMythicSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_mythic_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigExoticSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_exotic_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoRareLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoRare2LayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_2_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof CosmoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof SharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AlbinoSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RareSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EpicSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LegendarySharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MythicSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ExoticSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRareLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRare2LayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof SharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AlbinoSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RareSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EpicSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LegendarySharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MythicSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ExoticSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRareLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRare2LayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TobyLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MarshalLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TigerLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LouisLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BuddyLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ApolloLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AtlasLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof CBELayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof PBELayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof Bothan2netLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:bothan_2net_sleep ~ ~ ~");
							}
						}
					});
				}
			}
		} else if (world instanceof Level _lvl165 && _lvl165.isDay()) {
			if (Math.random() <= 0.15) {
				if (entity instanceof BigSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigAlbinoSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_albino_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigRareSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEpicSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigLegendarySharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_legendary_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigMythicSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_mythic_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigExoticSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_exotic_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoRareLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoRare2LayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_2_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof CosmoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof SharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AlbinoSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RareSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EpicSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LegendarySharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MythicSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ExoticSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRareLayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRare2LayAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_sleep_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof SharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AlbinoSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RareSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EpicSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LegendarySharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MythicSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ExoticSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRareLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRare2LayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TobyLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MarshalLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TigerLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LouisLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BuddyLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ApolloLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AtlasLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof CBELayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof PBELayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_sleep ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof Bothan2netLayEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:bothan_2net_sleep ~ ~ ~");
							}
						}
					});
				}
			}
		}
	}
}
