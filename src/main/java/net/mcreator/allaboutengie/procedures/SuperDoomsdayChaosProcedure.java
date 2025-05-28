package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
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
public class SuperDoomsdayChaosProcedure {
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
		if (AllaboutengieModVariables.MapVariables.get(world).sddaystart == true && AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart == true) {
			entity.getPersistentData().putDouble("sdoomsdaymainsongtimer", (entity.getPersistentData().getDouble("sdoomsdaymainsongtimer") + 0.05));
			if (entity.getPersistentData().getDouble("sdoomsdaymainsongtimer") >= 140) {
				entity.getPersistentData().putDouble("sdoomsdaymainsongtimer", 0);
				AllaboutengieModVariables.MapVariables.get(world).sdoomsdaymainsongstart = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieMod.queueServerWork(1, () -> {
					if (AllaboutengieModVariables.MapVariables.get(world).sdoomsdaymainsongstart == false) {
						AllaboutengieModVariables.MapVariables.get(world).sdoomsdaymainsongstart = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_start")), SoundSource.AMBIENT, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("allaboutengie:doomsday_start")), SoundSource.AMBIENT, 1, 1, false);
							}
						}
					}
				});
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
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect clear @a");
					}
				}
				AllaboutengieModVariables.MapVariables.get(world).waittilsdoomsday = true;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).sdoomsdaymainsongstart = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				AllaboutengieModVariables.MapVariables.get(world).Risk = 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof Level _level)
					_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
				{
					boolean _setval = false;
					entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.healthreductiondday = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
					AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.queueServerWork(5, () -> {
						if (world instanceof ServerLevel _level)
							_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
					});
				}
				if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_HARDCORE) == false) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @p instant_health 1 28 true");
						}
					}
				}
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).DoomsdayAlive == true) {
					if (!(entity instanceof ServerPlayer _plr19 && _plr19.level instanceof ServerLevel
							&& _plr19.getAdvancements().getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:conqueror"))).isDone())) {
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
					if (!(entity instanceof ServerPlayer _plr21 && _plr21.level instanceof ServerLevel
							&& _plr21.getAdvancements().getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:sdday_conqueror"))).isDone())) {
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
			if (AllaboutengieModVariables.MapVariables.get(world).darknesscooldown == true) {
				entity.getPersistentData().putDouble("sddaydarknesscooldown", (entity.getPersistentData().getDouble("sddaydarknesscooldown") + 0.05));
				if (entity.getPersistentData().getDouble("sddaydarknesscooldown") >= 19) {
					entity.getPersistentData().putDouble("sddaydarknesscooldown", 0);
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
			entity.getPersistentData().putDouble("sddaymissilecooldown", (entity.getPersistentData().getDouble("sddaymissilecooldown") + 0.05));
			if (entity.getPersistentData().getDouble("sddaymissilecooldown") >= 17) {
				entity.getPersistentData().putDouble("sddaymissilecooldown", 0);
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
