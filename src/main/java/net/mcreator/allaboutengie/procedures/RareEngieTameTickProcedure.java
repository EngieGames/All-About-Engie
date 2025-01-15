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
import net.mcreator.allaboutengie.entity.TobyEntity;
import net.mcreator.allaboutengie.entity.TigerEntity;
import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.entity.LouisEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RareEngieTameTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("Toby")) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new TobyEntity(AllaboutengieModEntities.TOBY.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if ((entity.getDisplayName().getString()).equals("Marshal")) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MarshalEntity(AllaboutengieModEntities.MARSHAL.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if ((entity.getDisplayName().getString()).equals("Tiger")) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new TigerEntity(AllaboutengieModEntities.TIGER.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if ((entity.getDisplayName().getString()).equals("Louis")) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new LouisEntity(AllaboutengieModEntities.LOUIS.get(), _level);
				entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
				entityToSpawn.setYBodyRot(entity.getYRot());
				entityToSpawn.setYHeadRot(entity.getYRot());
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
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
	}
}
