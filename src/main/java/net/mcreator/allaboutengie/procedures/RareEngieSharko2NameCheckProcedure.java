package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RareEngieSharko2NameCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EngieSharkoRare2TamedEntity) {
			if ((entity.getDisplayName().getString()).equals("Toby")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Louis")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Buddy")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Apollo")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Atlas")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("clippedbyengie")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe ~ ~ ~");
					}
				}
			}
			if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 30, 30, 30), e -> true).isEmpty())) {
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
			} else if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 30, 30, 30), e -> true).isEmpty()) {
				if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty())) {
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
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
		} else if (entity instanceof EngieSharkoRare2TamedZoomiesEntity) {
			if ((entity.getDisplayName().getString()).equals("Toby")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_zoomies ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_zoomies ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_zoomies ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Louis")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_zoomies ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Buddy")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_zoomies ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Apollo")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_zoomies ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Atlas")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_zoomies ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("clippedbyengie")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_zoomies ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_zoomies ~ ~ ~");
					}
				}
			}
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
				if (entity instanceof EngieSharkoRare2TamedZoomiesEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EngieSharkoRare2TamedZoomiesTiredEntity(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_TAMED_ZOOMIES_TIRED.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else if (entity instanceof EngieSharkoRare2TamedZoomiesTiredEntity) {
			entity.getPersistentData().putDouble("sharkoZoomiesTiredTimer", (entity.getPersistentData().getDouble("sharkoZoomiesTiredTimer") + 0.05));
			if (entity.getPersistentData().getDouble("sharkoZoomiesTiredTimer") >= 150) {
				if (entity instanceof EngieSharkoRare2TamedZoomiesTiredEntity) {
					if (!entity.level.isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EngieSharkoRare2TamedEntity(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_TAMED.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else if (entity instanceof EngieSharkoRare2LayEntity) {
			if ((entity.getDisplayName().getString()).equals("Toby")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_zoomies_tired ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_zoomies_tired ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_zoomies_tired ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Louis")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_zoomies_tired ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Buddy")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_zoomies_tired ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Apollo")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_zoomies_tired ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Atlas")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_zoomies_tired ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("clippedbyengie")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_zoomies_tired ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_zoomies_tired ~ ~ ~");
					}
				}
			}
		} else if (entity instanceof EngieSharkoRare2SleepEntity) {
			if ((entity.getDisplayName().getString()).equals("Toby")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_sleep ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_sleep ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_sleep ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Louis")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_sleep ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Buddy")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_sleep ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Apollo")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_sleep ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("Atlas")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_sleep ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("clippedbyengie")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_sleep ~ ~ ~");
					}
				}
			} else if ((entity.getDisplayName().getString()).equals("playedbyengie")) {
				if (!entity.level.isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_sleep ~ ~ ~");
					}
				}
			}
		}
	}
}
