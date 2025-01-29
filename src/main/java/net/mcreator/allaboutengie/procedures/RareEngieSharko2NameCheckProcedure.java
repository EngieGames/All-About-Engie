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

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.TobyZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.TobyZoomiesEntity;
import net.mcreator.allaboutengie.entity.TobySleepEntity;
import net.mcreator.allaboutengie.entity.TobyLayEntity;
import net.mcreator.allaboutengie.entity.TobyEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesEntity;
import net.mcreator.allaboutengie.entity.TigerSleepEntity;
import net.mcreator.allaboutengie.entity.TigerLayEntity;
import net.mcreator.allaboutengie.entity.TigerEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesEntity;
import net.mcreator.allaboutengie.entity.MarshalSleepEntity;
import net.mcreator.allaboutengie.entity.MarshalLayEntity;
import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesEntity;
import net.mcreator.allaboutengie.entity.LouisSleepEntity;
import net.mcreator.allaboutengie.entity.LouisLayEntity;
import net.mcreator.allaboutengie.entity.LouisEntity;
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
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TobyEntity(AllaboutengieModEntities.TOBY.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MarshalEntity(AllaboutengieModEntities.MARSHAL.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TigerEntity(AllaboutengieModEntities.TIGER.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Louis")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LouisEntity(AllaboutengieModEntities.LOUIS.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
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
								_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
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
									_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1);
							}
						}
					}
				}
			}
		} else if (entity instanceof EngieSharkoRare2TamedZoomiesEntity) {
			if ((entity.getDisplayName().getString()).equals("Toby")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TobyZoomiesEntity(AllaboutengieModEntities.TOBY_ZOOMIES.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MarshalZoomiesEntity(AllaboutengieModEntities.MARSHAL_ZOOMIES.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TigerZoomiesEntity(AllaboutengieModEntities.TIGER_ZOOMIES.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Louis")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LouisZoomiesEntity(AllaboutengieModEntities.LOUIS_ZOOMIES.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
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
								_ent.teleportTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()));
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
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
									_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1);
							}
						}
					}
				}
			}
		} else if (entity instanceof EngieSharkoRare2TamedZoomiesTiredEntity) {
			if ((entity.getDisplayName().getString()).equals("Toby")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TobyZoomiesTiredEntity(AllaboutengieModEntities.TOBY_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MarshalZoomiesTiredEntity(AllaboutengieModEntities.MARSHAL_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TigerZoomiesTiredEntity(AllaboutengieModEntities.TIGER_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Louis")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LouisZoomiesTiredEntity(AllaboutengieModEntities.LOUIS_ZOOMIES_TIRED.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			}
		} else if (entity instanceof EngieSharkoRare2LayEntity) {
			if ((entity.getDisplayName().getString()).equals("Toby")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TobyLayEntity(AllaboutengieModEntities.TOBY_LAY.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MarshalLayEntity(AllaboutengieModEntities.MARSHAL_LAY.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TigerLayEntity(AllaboutengieModEntities.TIGER_LAY.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Louis")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LouisLayEntity(AllaboutengieModEntities.LOUIS_LAY.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			}
		} else if (entity instanceof EngieSharkoRare2SleepEntity) {
			if ((entity.getDisplayName().getString()).equals("Toby")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TobySleepEntity(AllaboutengieModEntities.TOBY_SLEEP.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MarshalSleepEntity(AllaboutengieModEntities.MARSHAL_SLEEP.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new TigerSleepEntity(AllaboutengieModEntities.TIGER_SLEEP.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			} else if ((entity.getDisplayName().getString()).equals("Louis")) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new LouisSleepEntity(AllaboutengieModEntities.LOUIS_SLEEP.get(), _level);
					entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
