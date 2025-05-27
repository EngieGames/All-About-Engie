package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
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
import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.YellowLightningEntity;
import net.mcreator.allaboutengie.entity.NormalEntity;
import net.mcreator.allaboutengie.entity.MOABEntity;
import net.mcreator.allaboutengie.entity.BlueBurstEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class DoomsdayChaosProcedure {
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
		if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
			entity.getPersistentData().putDouble("doomsdaymainsongtimer", (entity.getPersistentData().getDouble("doomsdaymainsongtimer") + 0.05));
			if (entity.getPersistentData().getDouble("doomsdaymainsongtimer") >= 140) {
				entity.getPersistentData().putDouble("doomsdaymainsongtimer", 0);
				AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieMod.queueServerWork(1, () -> {
					if (AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart == false) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_start")), SoundSource.AMBIENT, (float) 0.5, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_start")), SoundSource.AMBIENT, (float) 0.5, 1, false);
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				});
			}
		}
		if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true && AllaboutengieModVariables.MapVariables.get(world).SDDAY == false) {
			entity.getPersistentData().putDouble("doomsdaytimer", (entity.getPersistentData().getDouble("doomsdaytimer") + 0.05));
			if (entity.getPersistentData().getDouble("doomsdaytimer") >= 720) {
				entity.getPersistentData().putDouble("doomsdaytimer", 0);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "weather clear");
					}
				}
				AllaboutengieModVariables.MapVariables.get(world).waittildoomsday = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
				if (world instanceof Level _level)
					_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
				AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayAlive == true) {
					if (!(entity instanceof ServerPlayer _plr13 && _plr13.level instanceof ServerLevel
							&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:conqueror"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
				}
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true && AllaboutengieModVariables.MapVariables.get(world).SDDAY == true) {
			entity.getPersistentData().putDouble("sdoomsdaytimer", (entity.getPersistentData().getDouble("sdoomsdaytimer") + 0.05));
			if (entity.getPersistentData().getDouble("sdoomsdaytimer") >= 900) {
				entity.getPersistentData().putDouble("sdoomsdaytimer", 0);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "weather clear");
					}
				}
				AllaboutengieModVariables.MapVariables.get(world).waittildoomsday = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).doomsdaymainsongstart = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
				if (world instanceof Level _level)
					_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayAlive == true) {
					if (!(entity instanceof ServerPlayer _plr22 && _plr22.level instanceof ServerLevel
							&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:conqueror"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
					if (!(entity instanceof ServerPlayer _plr24 && _plr24.level instanceof ServerLevel
							&& _plr24.getAdvancements().getOrStartProgress(_plr24.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:sdday_conqueror"))).isDone())) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:sdday_conqueror"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
				}
			}
		}
		if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true && AllaboutengieModVariables.MapVariables.get(world).SDDAY == false) {
			if (AllaboutengieModVariables.MapVariables.get(world).darknesscooldown == true) {
				entity.getPersistentData().putDouble("darknesscooldown", (entity.getPersistentData().getDouble("darknesscooldown") + 0.05));
				if (entity.getPersistentData().getDouble("darknesscooldown") >= 32) {
					entity.getPersistentData().putDouble("darknesscooldown", 0);
					AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 18 1 true");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					});
				}
			} else {
				AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "weather thunder");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set midnight");
				}
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true && AllaboutengieModVariables.MapVariables.get(world).SDDAY == true) {
			if (AllaboutengieModVariables.MapVariables.get(world).darknesscooldown == true) {
				entity.getPersistentData().putDouble("darknesscooldown", (entity.getPersistentData().getDouble("darknesscooldown") + 0.05));
				if (entity.getPersistentData().getDouble("darknesscooldown") >= 19) {
					entity.getPersistentData().putDouble("darknesscooldown", 0);
					AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 18 1 true");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					});
				}
			} else {
				AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "weather thunder");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set midnight");
				}
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true && AllaboutengieModVariables.MapVariables.get(world).SDDAY == false && ModList.get().isLoaded("weather2") == true) {
			if (AllaboutengieModVariables.MapVariables.get(world).darknesscooldown == true) {
				entity.getPersistentData().putDouble("darknesscooldown", (entity.getPersistentData().getDouble("darknesscooldown") + 0.05));
				if (entity.getPersistentData().getDouble("darknesscooldown") >= 32) {
					entity.getPersistentData().putDouble("darknesscooldown", 0);
					AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 18 1 true");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					});
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set midnight");
				}
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true && AllaboutengieModVariables.MapVariables.get(world).SDDAY == true && ModList.get().isLoaded("weather2") == true) {
			if (AllaboutengieModVariables.MapVariables.get(world).darknesscooldown == true) {
				entity.getPersistentData().putDouble("darknesscooldown", (entity.getPersistentData().getDouble("darknesscooldown") + 0.05));
				if (entity.getPersistentData().getDouble("darknesscooldown") >= 19) {
					entity.getPersistentData().putDouble("darknesscooldown", 0);
					AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(1, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 18 1 true");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).darknesscooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					});
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set midnight");
				}
			}
		}
		if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true && AllaboutengieModVariables.MapVariables.get(world).SDDAY == false) {
			entity.getPersistentData().putDouble("missilecooldown", (entity.getPersistentData().getDouble("missilecooldown") + 0.05));
			if (entity.getPersistentData().getDouble("missilecooldown") >= 20) {
				entity.getPersistentData().putDouble("missilecooldown", 0);
				AllaboutengieMod.queueServerWork(1, () -> {
					if (Math.random() <= 0.25) {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new YellowLightningEntity(AllaboutengieModEntities.YELLOW_LIGHTNING.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() >= 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new YellowLightningEntity(AllaboutengieModEntities.YELLOW_LIGHTNING.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() <= 0.5 && Math.random() > 0.25) {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new BlueBurstEntity(AllaboutengieModEntities.BLUE_BURST.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() >= 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new BlueBurstEntity(AllaboutengieModEntities.BLUE_BURST.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() <= 0.75 && Math.random() > 0.5) {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NormalEntity(AllaboutengieModEntities.NORMAL.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() >= 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NormalEntity(AllaboutengieModEntities.NORMAL.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() <= 1 && Math.random() > 0.75) {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MOABEntity(AllaboutengieModEntities.MOAB.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() >= 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MOABEntity(AllaboutengieModEntities.MOAB.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true && AllaboutengieModVariables.MapVariables.get(world).SDDAY == true) {
			entity.getPersistentData().putDouble("missilecooldown", (entity.getPersistentData().getDouble("missilecooldown") + 0.05));
			if (entity.getPersistentData().getDouble("missilecooldown") >= 17) {
				entity.getPersistentData().putDouble("missilecooldown", 0);
				AllaboutengieMod.queueServerWork(1, () -> {
					if (Math.random() <= 0.25) {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new YellowLightningEntity(AllaboutengieModEntities.YELLOW_LIGHTNING.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() >= 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new YellowLightningEntity(AllaboutengieModEntities.YELLOW_LIGHTNING.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() <= 0.5 && Math.random() > 0.25) {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new BlueBurstEntity(AllaboutengieModEntities.BLUE_BURST.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() >= 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new BlueBurstEntity(AllaboutengieModEntities.BLUE_BURST.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() <= 0.75 && Math.random() > 0.5) {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NormalEntity(AllaboutengieModEntities.NORMAL.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() >= 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NormalEntity(AllaboutengieModEntities.NORMAL.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() <= 1 && Math.random() > 0.75) {
						if (Math.random() < 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MOABEntity(AllaboutengieModEntities.MOAB.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() >= 0.5) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new MOABEntity(AllaboutengieModEntities.MOAB.get(), _level);
								entityToSpawn.moveTo(
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 1, 128)),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 1, 128)),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
				});
			}
		}
		if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
			entity.getPersistentData().putDouble("Nlightningcooldown", (entity.getPersistentData().getDouble("Nlightningcooldown") + 0.05));
			if (entity.getPersistentData().getDouble("Nlightningcooldown") >= 1) {
				entity.getPersistentData().putDouble("Nlightningcooldown", 0);
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 128)), (-64),
								((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 128)),
								world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 128)), (-64),
								((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 128)),
								world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		} else if (AllaboutengieModVariables.MapVariables.get(world).ddaystart == true && world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMSDAY) == true) {
			entity.getPersistentData().putDouble("Slightningcooldown", (entity.getPersistentData().getDouble("Slightningcooldown") + 0.05));
			if (entity.getPersistentData().getDouble("Slightningcooldown") >= 0.5) {
				entity.getPersistentData().putDouble("Slightningcooldown", 0);
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 128)), (-64),
								((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 128)),
								world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 128)), (-64),
								((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 128)),
								world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX + Mth.nextDouble(RandomSource.create(), 0, 128)), (-64),
								((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ + Mth.nextDouble(RandomSource.create(), 0, 128)),
								world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LightningBolt(EntityType.LIGHTNING_BOLT, _level);
						entityToSpawn.moveTo(((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX - Mth.nextDouble(RandomSource.create(), 0, 128)), (-64),
								((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ - Mth.nextDouble(RandomSource.create(), 0, 128)),
								world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
	}
}
