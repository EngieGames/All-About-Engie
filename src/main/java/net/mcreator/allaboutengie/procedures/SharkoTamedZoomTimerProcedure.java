package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.TobyZoomiesEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.CBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.BuddyZoomiesEntity;
import net.mcreator.allaboutengie.entity.Bothan2netZoomiesEntity;
import net.mcreator.allaboutengie.entity.AtlasZoomiesEntity;
import net.mcreator.allaboutengie.entity.ApolloZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SharkoTamedZoomTimerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 60, 60, 60), e -> true).isEmpty())) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player) {
						{
							Entity _ent = entity;
							_ent.teleportTo((entityiterator.getX()), Math.ceil(entityiterator.getY()), (entityiterator.getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entityiterator.getX()), Math.ceil(entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
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
								_entity.getNavigation().moveTo((entityiterator.getX()), Math.ceil(entityiterator.getY()), (entityiterator.getZ()), 1);
						}
					}
				}
			}
		}
		entity.getPersistentData().putDouble("sharkoZoomiesTimer", (entity.getPersistentData().getDouble("sharkoZoomiesTimer") + 0.05));
		if (entity.getPersistentData().getDouble("sharkoZoomiesTimer") >= 150) {
			if (entity instanceof SharkoTamedZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if (((Entity) world.getEntitiesOfClass(SharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof SharkoTamedZoomiesTiredEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Sharko (Zoomies)")) {
							((Entity) world.getEntitiesOfClass(SharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof AlbinoSharkoTamedZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_tamed_sharko_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if (((Entity) world.getEntitiesOfClass(AlbinoSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof AlbinoSharkoTamedZoomiesTiredEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Albino Sharko (Zoomies)")) {
							((Entity) world.getEntitiesOfClass(AlbinoSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof RareSharkoTamedZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if (((Entity) world.getEntitiesOfClass(RareSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof RareSharkoTamedZoomiesTiredEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Rare Sharko (Zoomies)")) {
							((Entity) world.getEntitiesOfClass(RareSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof EpicSharkoTamedZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:epic_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if (((Entity) world.getEntitiesOfClass(EpicSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof EpicSharkoTamedZoomiesTiredEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Epic Sharko (Zoomies)")) {
							((Entity) world.getEntitiesOfClass(EpicSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof LegendarySharkoTamedZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if (((Entity) world.getEntitiesOfClass(LegendarySharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LegendarySharkoTamedZoomiesTiredEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Legendary Sharko (Zoomies)")) {
							((Entity) world.getEntitiesOfClass(LegendarySharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof MythicSharkoTamedZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if (((Entity) world.getEntitiesOfClass(MythicSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof MythicSharkoTamedZoomiesTiredEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Mythic Sharko (Zoomies)")) {
							((Entity) world.getEntitiesOfClass(MythicSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof ExoticSharkoTamedZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if (((Entity) world.getEntitiesOfClass(ExoticSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ExoticSharkoTamedZoomiesTiredEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Exotic Sharko (Zoomies)")) {
							((Entity) world.getEntitiesOfClass(ExoticSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof EngieSharkoTamedZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_sharko_tamed_zoomies_tired ~ ~ ~");
					}
				}
				AllaboutengieMod.queueServerWork(1, () -> {
					if (((Entity) world.getEntitiesOfClass(EngieSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof EngieSharkoTamedZoomiesTiredEntity) {
						if (!(entity.getDisplayName().getString()).equals("[Tamed] Engie Sharko (Zoomies)")) {
							((Entity) world.getEntitiesOfClass(EngieSharkoTamedZoomiesTiredEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entity.getDisplayName().getString())));
						}
					}
				});
			} else if (entity instanceof TobyZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof MarshalZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof TigerZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof LouisZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof BuddyZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof ApolloZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof AtlasZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof CBEZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof PBEZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_zoomies_tired ~ ~ ~");
					}
				}
			} else if (entity instanceof Bothan2netZoomiesEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:bothan_2net_zoomies_tired ~ ~ ~");
					}
				}
			}
		}
	}
}
