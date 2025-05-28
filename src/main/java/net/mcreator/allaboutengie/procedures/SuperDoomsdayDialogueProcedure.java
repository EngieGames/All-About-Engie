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
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class SuperDoomsdayDialogueProcedure {
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
		if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false && AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
			AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			AllaboutengieMod.queueServerWork(1, () -> {
				if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
					if (AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce == false) {
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_eerie")), SoundSource.AMBIENT, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_eerie")), SoundSource.AMBIENT, 1, 1, false);
							}
						}
					}
					if (AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock == false) {
						entity.getPersistentData().putDouble("TimeUntilNightSDDAY", (entity.getPersistentData().getDouble("TimeUntilNightSDDAY") + 0.05));
						if (entity.getPersistentData().getDouble("TimeUntilNightSDDAY") >= 42) {
							{
								boolean _setval = false;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.DDAYDeathNoSpam = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.DDAYAliveNoSpam = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = true;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.DoomsdayAlive = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.DoomsDayDead = _setval;
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
							AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof Level _lvl6 && _lvl6.isDay()) {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set midnight");
									}
								}
							}
						}
					}
					if (AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock == false) {
						entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", (entity.getPersistentData().getDouble("SDDAYDialogueCooldownStart") + 0.05));
						if (AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock == false) {
							if (entity.getPersistentData().getDouble("SDDAYDialogueCooldownStart") >= 36) {
								AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @a [\"\",{\"text\":\" \\u0020 \\u0020 \\u0020 \\u0020 \\u0020 \\u0020 \\u0020 \\u0020\\u26a0 NEW OBJECTIVE: \\u26a0\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"\\nThe end is near. The full wrath of Mother Nature is arriving.\\n \\u0020 \\u0020 \\u0020 \\u0020 \\u0020 \\u0020The ultimate disaster. SUPER DOOMSDAY.\"}]");
									}
								}
								if (!(entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel
										&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:rise"))).isDone())) {
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
														_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_eerie_2")), SoundSource.AMBIENT, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_eerie_2")), SoundSource.AMBIENT, 1, 1, false);
													}
												}
												AllaboutengieMod.queueServerWork(240, () -> {
													{
														Entity _ent = entity;
														if (!_ent.level.isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
																			_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																	"tellraw @a [\"\",{\"text\":\"SUPER DOOMSDAY\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"},{\"text\":\" The world will come to an end. No one will survive. \",\"bold\":true,\"color\":\"yellow\"},{\"text\":\"SUPER DOOMSDAY\",\"bold\":true,\"obfuscated\":true,\"color\":\"yellow\"}]");
														}
													}
													AllaboutengieMod.queueServerWork(200, () -> {
														{
															Entity _ent = entity;
															if (!_ent.level.isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands().performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
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
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_start")), SoundSource.AMBIENT, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_start")), SoundSource.AMBIENT, 1, 1, false);
															}
														}
														AllaboutengieModVariables.MapVariables.get(world).sdoomsdaymainsongstart = true;
														AllaboutengieModVariables.MapVariables.get(world).syncData(world);
														entity.getPersistentData().putDouble("sdoomsdaymainsongtimer", 0);
														AllaboutengieMod.queueServerWork(290, () -> {
															AllaboutengieModVariables.MapVariables.get(world).sddaystart = true;
															AllaboutengieModVariables.MapVariables.get(world).syncData(world);
															AllaboutengieModVariables.MapVariables.get(world).BYEBYE = true;
															AllaboutengieModVariables.MapVariables.get(world).syncData(world);
															if (world instanceof Level _level)
																_level.getGameRules().getRule(GameRules.RULE_DOMOBSPAWNING).set(true, _level.getServer());
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
				}
			});
		} else {
			if (AllaboutengieModVariables.MapVariables.get(world).waittilsdoomsday == true) {
				entity.getPersistentData().putDouble("sddaywaittoreset", (entity.getPersistentData().getDouble("sddaywaittoreset") + 0.05));
				if (entity.getPersistentData().getDouble("sddaywaittoreset") >= 0.5) {
					entity.getPersistentData().putDouble("sddaywaittoreset", 0);
					entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
					entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
					AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).waittilsdoomsday = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).waittildoomsday == false) {
				entity.getPersistentData().putDouble("sddaywaittoreset2", (entity.getPersistentData().getDouble("sddaywaittoreset2") + 0.05));
				if (entity.getPersistentData().getDouble("sddaywaittoreset2") >= 0.5) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true && AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						AllaboutengieModVariables.MapVariables.get(world).waittilsdoomsday = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}
