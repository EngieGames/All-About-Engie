package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.TobyZoomiesEntity;
import net.mcreator.allaboutengie.entity.TobyEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesEntity;
import net.mcreator.allaboutengie.entity.TigerEntity;
import net.mcreator.allaboutengie.entity.SharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.SharkoEntity;
import net.mcreator.allaboutengie.entity.SharkTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesEntity;
import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesEntity;
import net.mcreator.allaboutengie.entity.LouisEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.EngieSharkoEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ZoomiesChanceProcedure {
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
		if (entity instanceof SharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new SharkoZoomiesEntity(AllaboutengieModEntities.SHARKO_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof SharkTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new SharkoTamedZoomiesEntity(AllaboutengieModEntities.SHARKO_TAMED_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof AlbinoSharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AlbinoSharkoZoomiesEntity(AllaboutengieModEntities.ALBINO_SHARKO_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof AlbinoSharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AlbinoSharkoTamedZoomiesEntity(AllaboutengieModEntities.ALBINO_SHARKO_TAMED_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof RareSharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RareSharkoZoomiesEntity(AllaboutengieModEntities.RARE_SHARKO_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof RareSharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RareSharkoTamedZoomiesEntity(AllaboutengieModEntities.RARE_SHARKO_TAMED_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof LegendarySharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LegendarySharkoZoomiesEntity(AllaboutengieModEntities.LEGENDARY_SHARKO_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof LegendarySharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LegendarySharkoTamedZoomiesEntity(AllaboutengieModEntities.LEGENDARY_SHARKO_TAMED_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof MythicSharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MythicSharkoZoomiesEntity(AllaboutengieModEntities.MYTHIC_SHARKO_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof MythicSharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MythicSharkoTamedZoomiesEntity(AllaboutengieModEntities.MYTHIC_SHARKO_TAMED_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof ExoticSharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ExoticSharkoZoomiesEntity(AllaboutengieModEntities.EXOTIC_SHARKO_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof ExoticSharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ExoticSharkoTamedZoomiesEntity(AllaboutengieModEntities.EXOTIC_SHARKO_TAMED_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof EngieSharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EngieSharkoZoomiesEntity(AllaboutengieModEntities.ENGIE_SHARKO_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof EngieSharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EngieSharkoTamedZoomiesEntity(AllaboutengieModEntities.ENGIE_SHARKO_TAMED_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof EngieSharkoRareEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EngieSharkoRareZoomiesEntity(AllaboutengieModEntities.ENGIE_SHARKO_RARE_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof EngieSharkoRareTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EngieSharkoRareTamedZoomiesEntity(AllaboutengieModEntities.ENGIE_SHARKO_RARE_TAMED_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof EngieSharkoRare2Entity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EngieSharkoRare2ZoomiesEntity(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof EngieSharkoRare2TamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new EngieSharkoRare2TamedZoomiesEntity(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_TAMED_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof TobyEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TobyZoomiesEntity(AllaboutengieModEntities.TOBY_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof MarshalEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MarshalZoomiesEntity(AllaboutengieModEntities.MARSHAL_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof TigerEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TigerZoomiesEntity(AllaboutengieModEntities.TIGER_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
		if (entity instanceof LouisEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies variant.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LouisZoomiesEntity(AllaboutengieModEntities.LOUIS_ZOOMIES.get(), _level);
						entityToSpawn.moveTo(x, Math.ceil(y), z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				});
			}
		}
	}
}
