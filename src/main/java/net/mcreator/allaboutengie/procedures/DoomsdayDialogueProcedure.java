package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class DoomsdayDialogueProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart == true) {
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
					AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).DoomsDayAliveCount = AllaboutengieModVariables.MapVariables.get(world).PlayerWorldCount;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).DoomsdayDeathCount = 0;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
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
					if (world instanceof Level _lvl6 && _lvl6.isDay()) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set midnight");
							}
						}
					}
				}
			}
			if (AllaboutengieModVariables.MapVariables.get(world).SDDAY == false) {
				if (AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock == false) {
					AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					entity.getPersistentData().putDouble("DialogueCooldownStart", (entity.getPersistentData().getDouble("DialogueCooldownStart") + 0.05));
					if (entity.getPersistentData().getDouble("DialogueCooldownStart") >= 36) {
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"text\":\" \\u0020 \\u0020 \\u0020 \\u0020 \\u0020 \\u26a0 NEW OBJECTIVE: \\u26a0\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"\\nThe end is near. Survive the end of the world.\"}]");
							}
						}
						AllaboutengieMod.queueServerWork(160, () -> {
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
														.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
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
										AllaboutengieModVariables.MapVariables.get(world).NDoomsdayStartMusicBlock = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
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
			} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAY == true && world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMSDAY) == true) {
				if (AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock == false) {
					AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					entity.getPersistentData().putDouble("SDialogueCooldownStart", (entity.getPersistentData().getDouble("SDialogueCooldownStart") + 0.05));
					if (entity.getPersistentData().getDouble("SDialogueCooldownStart") >= 36) {
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"text\":\" \\u0020 \\u0020 \\u0020 \\u0020 \\u0020 \\u0020 \\u0020 \\u0020\\u26a0 NEW OBJECTIVE: \\u26a0\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"\\nThe end is near. The full wrath of Mother Nature is arriving.\\n \\u0020 \\u0020 \\u0020 \\u0020 \\u0020 \\u0020The ultimate disaster. SUPER DOOMSDAY.\"}]");
							}
						}
						if ((entity instanceof ServerPlayer _plr28 && _plr28.level instanceof ServerLevel
								&& _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:rise"))).isDone()) == false) {
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:rise"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									Iterator _iterator = _ap.getRemainingCriteria().iterator();
									while (_iterator.hasNext())
										_player.getAdvancements().award(_adv, (String) _iterator.next());
								}
							}
						}
						AllaboutengieMod.queueServerWork(160, () -> {
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
														.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
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
										AllaboutengieModVariables.MapVariables.get(world).SDoomsdayStartMusicBlock2 = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieMod.queueServerWork(240, () -> {
											{
												Entity _ent = entity;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
																	_ent.getDisplayName(), _ent.level.getServer(), _ent),
															"tellraw @a [\"\",{\"text\":\"SUPER DOOMSDAY\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\" The world will come to an end. No one will survive. \",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"SUPER DOOMSDAY\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"}]");
												}
											}
											AllaboutengieMod.queueServerWork(200, () -> {
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
																		_ent.getDisplayName(), _ent.level.getServer(), _ent),
																"tellraw @a [\"\",{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"S\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"U\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"P\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"E\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"R\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\" e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"D\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"O\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"O\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"M\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"S\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"D\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"A\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\"Y\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"e\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"}]");
													}
												}
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																"stopsound @a ambient allaboutengie:doomsday_eerie_2");
													}
												}
												AllaboutengieModVariables.MapVariables.get(world).SDoomsdayStartMusicBlock = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieMod.queueServerWork(290, () -> {
													AllaboutengieModVariables.MapVariables.get(world).ddaystart = true;
													AllaboutengieModVariables.MapVariables.get(world).syncData(world);
													if (world instanceof Level _level)
														_level.getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(true, _level.getServer());
													AllaboutengieModVariables.MapVariables.get(world).BYEBYE = true;
													AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												});
											});
										});
									});
								});
							});
						});
					}
				}
			}
			if (AllaboutengieModVariables.MapVariables.get(world).NDoomsdayStartMusicBlock == false || AllaboutengieModVariables.MapVariables.get(world).SDoomsdayStartMusicBlock == false) {
				AllaboutengieModVariables.MapVariables.get(world).NDoomsdayStartMusicBlock = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).SDoomsdayStartMusicBlock = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_start")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_start")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			}
			if (AllaboutengieModVariables.MapVariables.get(world).SDoomsdayStartMusicBlock2 == false) {
				AllaboutengieModVariables.MapVariables.get(world).SDoomsdayStartMusicBlock2 = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_eerie_2")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_eerie_2")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			}
		}
		if (AllaboutengieModVariables.MapVariables.get(world).waittildoomsday == true) {
			entity.getPersistentData().putDouble("waittoreset", (entity.getPersistentData().getDouble("waittoreset") + 0.05));
			if (entity.getPersistentData().getDouble("waittoreset") >= 0.5) {
				entity.getPersistentData().putDouble("waittoreset", 0);
				entity.getPersistentData().putDouble("SDialogueCooldownStart", 0);
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
				AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
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
