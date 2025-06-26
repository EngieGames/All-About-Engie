package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayAprilFoolsEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RareEngieSharkoNameCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EngieSharkoRareTamedAprilFoolsEntity) {
			if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 30, 30, 30), e -> true).isEmpty())) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							{
								Entity _ent = entity;
								_ent.teleportTo(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
										((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ), _ent.getYRot(), _ent.getXRot());
							}
						}
					}
				}
			} else if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 30, 30, 30), e -> true).isEmpty()) {
				if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty())) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player) {
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ), 1);
							}
						}
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareLayAprilFoolsEntity) {
			if (!(world instanceof Level _lvl14 && _lvl14.isDay())) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
					entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.5) {
						if (entity instanceof EngieSharkoRareLayAprilFoolsEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep_april_fools ~ ~ ~");
									}
								}
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else if (world instanceof Level _lvl22 && _lvl22.isDay()) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
					entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.0005) {
						if (entity instanceof EngieSharkoRareLayAprilFoolsEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep_april_fools ~ ~ ~");
									}
								}
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_lay ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareSleepAprilFoolsEntity) {
			if (!(world instanceof Level _lvl34 && _lvl34.isDay())) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
					entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.0005) {
						if (entity instanceof EngieSharkoRareSleepAprilFoolsEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay_april_fools ~ ~ ~");
									}
								}
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else if (world instanceof Level _lvl42 && _lvl42.isDay()) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
					entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.5) {
						if (entity instanceof EngieSharkoRareSleepAprilFoolsEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay_april_fools ~ ~ ~");
									}
								}
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_sleep ~ ~ ~");
					}
				}
			}
		}
		if (entity instanceof EngieSharkoRareTamedEntity) {
			if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 30, 30, 30), e -> true).isEmpty())) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							{
								Entity _ent = entity;
								_ent.teleportTo(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
										((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ), _ent.getYRot(), _ent.getXRot());
							}
						}
					}
				}
			} else if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 30, 30, 30), e -> true).isEmpty()) {
				if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty())) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player) {
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ), 1);
							}
						}
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareTamedZoomiesEntity) {
			if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 60, 60, 60), e -> true).isEmpty())) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							{
								Entity _ent = entity;
								_ent.teleportTo(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
										((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
										((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ), _ent.getYRot(), _ent.getXRot());
							}
						}
					}
				}
			} else if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 60, 60, 60), e -> true).isEmpty()) {
				if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).isEmpty())) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(60 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player) {
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo(((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerX),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerY),
											((entityiterator.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).PlayerZ), 1);
							}
						}
					}
				}
			}
			entity.getPersistentData().putDouble("sharkoZoomiesTimer", (entity.getPersistentData().getDouble("sharkoZoomiesTimer") + 0.05));
			if (entity.getPersistentData().getDouble("sharkoZoomiesTimer") >= 150) {
				if (entity instanceof EngieSharkoRareTamedZoomiesEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_tamed_zoomies_tired ~ ~ ~");
						}
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						if (((Entity) world.getEntitiesOfClass(EngieSharkoRareTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof EngieSharkoRareTamedZoomiesTiredEntity) {
							if (((Entity) world.getEntitiesOfClass(EngieSharkoRareTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
								_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
							if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Engie Sharko (Zoomies)")) {
								((Entity) world.getEntitiesOfClass(EngieSharkoRareTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
							}
						}
					});
				}
			}
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_zoomies ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareTamedZoomiesTiredEntity) {
			entity.getPersistentData().putDouble("sharkoZoomiesTiredTimer", (entity.getPersistentData().getDouble("sharkoZoomiesTiredTimer") + 0.05));
			if (entity.getPersistentData().getDouble("sharkoZoomiesTiredTimer") >= 150) {
				if (entity instanceof EngieSharkoRareTamedZoomiesTiredEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_tamed ~ ~ ~");
						}
					}
					AllaboutengieMod.queueServerWork(1, () -> {
						if (((Entity) world.getEntitiesOfClass(EngieSharkoRareTamedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof EngieSharkoRareTamedEntity) {
							if (((Entity) world.getEntitiesOfClass(EngieSharkoRareTamedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
								_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
							if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Engie Sharko (Worn Out)")) {
								((Entity) world.getEntitiesOfClass(EngieSharkoRareTamedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
							}
						}
					});
				}
			}
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_zoomies_tired ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareLayEntity) {
			if (!(world instanceof Level _lvl116 && _lvl116.isDay())) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
					entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.5) {
						if (entity instanceof EngieSharkoRareLayEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep ~ ~ ~");
									}
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if (((Entity) world.getEntitiesOfClass(EngieSharkoRareSleepEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof EngieSharkoRareSleepEntity) {
										if (((Entity) world.getEntitiesOfClass(EngieSharkoRareSleepEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
											_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
										if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Engie Sharko (Laying)")) {
											((Entity) world.getEntitiesOfClass(EngieSharkoRareSleepEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
										}
									}
								});
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else if (world instanceof Level _lvl134 && _lvl134.isDay()) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == true) {
					entity.getPersistentData().putDouble("SharkoLayCD", (entity.getPersistentData().getDouble("SharkoLayCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoLayCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.0005) {
						if (entity instanceof EngieSharkoRareLayEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_sleep ~ ~ ~");
									}
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if (((Entity) world.getEntitiesOfClass(EngieSharkoRareSleepEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof EngieSharkoRareSleepEntity) {
										if (((Entity) world.getEntitiesOfClass(EngieSharkoRareSleepEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
											_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
										if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Engie Sharko (Laying)")) {
											((Entity) world.getEntitiesOfClass(EngieSharkoRareSleepEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
										}
									}
								});
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_lay ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRareSleepEntity) {
			if (!(world instanceof Level _lvl156 && _lvl156.isDay())) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD == true) {
					entity.getPersistentData().putDouble("SharkoSleepCD", (entity.getPersistentData().getDouble("SharkoSleepCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoSleepCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.0005) {
						if (entity instanceof EngieSharkoRareSleepEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay ~ ~ ~");
									}
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if (((Entity) world.getEntitiesOfClass(EngieSharkoRareLayEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof EngieSharkoRareLayEntity) {
										if (((Entity) world.getEntitiesOfClass(EngieSharkoRareLayEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
											_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
										if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Engie Sharko (Sleeping)")) {
											((Entity) world.getEntitiesOfClass(EngieSharkoRareLayEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
										}
									}
								});
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			} else if (world instanceof Level _lvl174 && _lvl174.isDay()) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD == true) {
					entity.getPersistentData().putDouble("SharkoSleepCD", (entity.getPersistentData().getDouble("SharkoSleepCD") + 0.05));
					if (entity.getPersistentData().getDouble("SharkoSleepCD") >= 240) {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoLayCD == false) {
					if (Math.random() <= 0.5) {
						if (entity instanceof EngieSharkoRareSleepEntity) {
							if (!entity.level.isClientSide())
								entity.discard();
							AllaboutengieMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_lay ~ ~ ~");
									}
								}
								AllaboutengieMod.queueServerWork(1, () -> {
									if (((Entity) world.getEntitiesOfClass(EngieSharkoRareLayEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof EngieSharkoRareLayEntity) {
										if (((Entity) world.getEntitiesOfClass(EngieSharkoRareLayEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity)
											_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
										if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Engie Sharko (Sleeping)")) {
											((Entity) world.getEntitiesOfClass(EngieSharkoRareLayEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
										}
									}
								});
							});
						}
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoSleepCD = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
			if ((entity.getDisplayName().getString()).equals("Finnegan")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:finnegan_sleep ~ ~ ~");
					}
				}
			}
		}
	}
}
