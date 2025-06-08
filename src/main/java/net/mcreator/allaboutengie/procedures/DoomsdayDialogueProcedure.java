package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DoomsdayDialogueProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true && AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
			AllaboutengieModVariables.MapVariables.get(world).timecheckstop = true;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			AllaboutengieMod.queueServerWork(1, () -> {
				if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce == false) {
					AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_eerie")), SoundSource.AMBIENT, (float) 0.5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_eerie")), SoundSource.AMBIENT, (float) 0.5, 1, false);
						}
					}
				}
				if (AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock == false) {
					entity.getPersistentData().putDouble("TimeUntilNightDDAY", (entity.getPersistentData().getDouble("TimeUntilNightDDAY") + 0.05));
					if (entity.getPersistentData().getDouble("TimeUntilNightDDAY") >= 42) {
						{
							boolean _setval = true;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DoomsdayAlive = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, _level.getServer());
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(false, _level.getServer());
						{
							boolean _setval = false;
							entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.BlockDeathAliveCOunt = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _lvl6 && _lvl6.isDay()) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set midnight");
								}
							}
						}
						if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_HARDCORE) == true) {
							{
								boolean _setval = true;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.healthreductiondday = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @p instant_health 1 28 true");
								}
							}
						}
					}
				}
				if (AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock == false) {
					entity.getPersistentData().putDouble("DialogueCooldownStart", (entity.getPersistentData().getDouble("DialogueCooldownStart") + 0.05));
					if (AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock == false) {
						if (entity.getPersistentData().getDouble("DialogueCooldownStart") >= 36) {
							AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							{
								boolean _setval = true;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.ShowObjectiveOverlay = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							AllaboutengieMod.queueServerWork(200, () -> {
								{
									boolean _setval = false;
									entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.ShowObjectiveOverlay = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
							AllaboutengieMod.queueServerWork(140, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands()
												.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
														_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"tellraw @a {\"text\":\"We never thought this day would come. But it is finally here.\",\"bold\":true,\"color\":\"yellow\"}");
									}
								}
								AllaboutengieMod.queueServerWork(200, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
															_ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"The end of humanity has arrived. Earth as we know it... is to come to an end.\",\"bold\":true,\"color\":\"yellow\"}");
										}
									}
									AllaboutengieMod.queueServerWork(220, () -> {
										{
											Entity _ent = entity;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(
														new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
																_ent.getDisplayName(), _ent.level.getServer(), _ent),
														"tellraw @a {\"text\":\"You must withstand this chaos for a long time in order to survive the end of the world.\",\"bold\":true,\"color\":\"yellow\"}");
											}
										}
										AllaboutengieMod.queueServerWork(240, () -> {
											{
												Entity _ent = entity;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands()
															.performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
																			_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																	"tellraw @a {\"text\":\"May Mother Nature have mercy on our souls.\",\"bold\":true,\"color\":\"yellow\"}");
												}
											}
											{
												Entity _ent = entity;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
															_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"stopsound @a ambient allaboutengie:doomsday_eerie");
												}
											}
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_start")), SoundSource.AMBIENT, (float) 0.5, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_start")), SoundSource.AMBIENT, (float) 0.5, 1, false);
												}
											}
											AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart = true;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											entity.getPersistentData().putDouble("doomsdaymainsongtimer", 0);
											AllaboutengieMod.queueServerWork(290, () -> {
												AllaboutengieModVariables.MapVariables.get(world).ddaystart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												if (world instanceof Level _level)
													_level.getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(true, _level.getServer());
											});
										});
									});
								});
							});
						}
					}
				}
			});
		} else {
			if (AllaboutengieModVariables.MapVariables.get(world).waittildoomsday == true) {
				entity.getPersistentData().putDouble("waittoreset", (entity.getPersistentData().getDouble("waittoreset") + 0.05));
				if (entity.getPersistentData().getDouble("waittoreset") >= 0.5) {
					entity.getPersistentData().putDouble("waittoreset", 0);
					entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
					entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
					AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).waittildoomsday = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).waittildoomsday == false) {
				entity.getPersistentData().putDouble("waittoreset2", (entity.getPersistentData().getDouble("waittoreset2") + 0.05));
				if (entity.getPersistentData().getDouble("waittoreset2") >= 0.5) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						AllaboutengieModVariables.MapVariables.get(world).waittildoomsday = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}
