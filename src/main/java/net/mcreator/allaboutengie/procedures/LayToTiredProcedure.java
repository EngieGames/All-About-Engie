package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.TobySleepEntity;
import net.mcreator.allaboutengie.entity.TobyLayEntity;
import net.mcreator.allaboutengie.entity.TigerSleepEntity;
import net.mcreator.allaboutengie.entity.TigerLayEntity;
import net.mcreator.allaboutengie.entity.SharkoSleepEntity;
import net.mcreator.allaboutengie.entity.SharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.SharkoLayEntity;
import net.mcreator.allaboutengie.entity.SharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.PBESleepEntity;
import net.mcreator.allaboutengie.entity.PBELayEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MarshalSleepEntity;
import net.mcreator.allaboutengie.entity.MarshalLayEntity;
import net.mcreator.allaboutengie.entity.LouisSleepEntity;
import net.mcreator.allaboutengie.entity.LouisLayEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.CBESleepEntity;
import net.mcreator.allaboutengie.entity.CBELayEntity;
import net.mcreator.allaboutengie.entity.BuddySleepEntity;
import net.mcreator.allaboutengie.entity.BuddyLayEntity;
import net.mcreator.allaboutengie.entity.Bothan2netSleepEntity;
import net.mcreator.allaboutengie.entity.Bothan2netLayEntity;
import net.mcreator.allaboutengie.entity.AtlasSleepEntity;
import net.mcreator.allaboutengie.entity.AtlasLayEntity;
import net.mcreator.allaboutengie.entity.ApolloSleepEntity;
import net.mcreator.allaboutengie.entity.ApolloLayEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LayToTiredProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
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
			if (entity instanceof MythicSharkoLayAprilFoolsEntity) {
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
		} else if (world instanceof Level _lvl113 && _lvl113.isDay()) {
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
