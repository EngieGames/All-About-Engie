package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.TobySleepEntity;
import net.mcreator.allaboutengie.entity.TigerSleepEntity;
import net.mcreator.allaboutengie.entity.SharkoSleepEntity;
import net.mcreator.allaboutengie.entity.SharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.PBESleepEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MarshalSleepEntity;
import net.mcreator.allaboutengie.entity.LouisSleepEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.CosmoSleepEntity;
import net.mcreator.allaboutengie.entity.CBESleepEntity;
import net.mcreator.allaboutengie.entity.BuddySleepEntity;
import net.mcreator.allaboutengie.entity.Bothan2netSleepEntity;
import net.mcreator.allaboutengie.entity.BigSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareSleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.AtlasSleepEntity;
import net.mcreator.allaboutengie.entity.ApolloSleepEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class SharkoChanceForLayProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
			if (Math.random() <= 0.15) {
				if (entity instanceof BigSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigAlbinoSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_albino_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigRareSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEpicSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigLegendarySharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_legendary_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigMythicSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_mythic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigExoticSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_exotic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoRareSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoRare2SleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_2_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof CosmoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof SharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AlbinoSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RareSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EpicSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LegendarySharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MythicSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ExoticSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRareSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRare2SleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof SharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AlbinoSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RareSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EpicSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LegendarySharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MythicSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ExoticSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRareSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRare2SleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TobySleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MarshalSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TigerSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LouisSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BuddySleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ApolloSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AtlasSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof CBESleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof PBESleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof Bothan2netSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:bothan_2net_lay ~ ~ ~");
							}
						}
					});
				}
			}
		} else if (world instanceof Level _lvl165 && _lvl165.isDay()) {
			if (Math.random() <= 0.5) {
				if (entity instanceof BigSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigAlbinoSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_albino_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigRareSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEpicSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_rare_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigLegendarySharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_legendary_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigMythicSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_mythic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigExoticSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_exotic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoRareSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BigEngieSharkoRare2SleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:big_engie_sharko_rare_2_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof CosmoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cosmo_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof SharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AlbinoSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RareSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EpicSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LegendarySharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MythicSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ExoticSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRareSleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRare2SleepAprilFoolsEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_lay_april_fools ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof SharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AlbinoSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof RareSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EpicSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LegendarySharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MythicSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ExoticSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRareSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof EngieSharkoRare2SleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TobySleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof MarshalSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof TigerSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof LouisSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof BuddySleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof ApolloSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof AtlasSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof CBESleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof PBESleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_lay ~ ~ ~");
							}
						}
					});
				}
				if (entity instanceof Bothan2netSleepEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:bothan_2net_lay ~ ~ ~");
							}
						}
					});
				}
			}
		}
	}
}
