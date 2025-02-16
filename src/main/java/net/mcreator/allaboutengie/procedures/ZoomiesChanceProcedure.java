package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.TobyEntity;
import net.mcreator.allaboutengie.entity.TigerEntity;
import net.mcreator.allaboutengie.entity.SharkoEntity;
import net.mcreator.allaboutengie.entity.SharkTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoEntity;
import net.mcreator.allaboutengie.entity.PBEEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoEntity;
import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.entity.LouisEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.EngieSharkoEntity;
import net.mcreator.allaboutengie.entity.CBEEntity;
import net.mcreator.allaboutengie.entity.BuddyEntity;
import net.mcreator.allaboutengie.entity.AtlasEntity;
import net.mcreator.allaboutengie.entity.ApolloEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ZoomiesChanceProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof SharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof SharkTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:sharko_tamed_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof AlbinoSharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof AlbinoSharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:albino_sharko_tamed_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof RareSharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof RareSharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:rare_sharko_tamed_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof LegendarySharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof LegendarySharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:legendary_sharko_tamed_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof MythicSharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof MythicSharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:mythic_sharko_tamed_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof ExoticSharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof ExoticSharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:exotic_sharko_tamed_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof EngieSharkoEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof EngieSharkoTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_tamed_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof EngieSharkoRareEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof EngieSharkoRareTamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_tamed_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof EngieSharkoRare2Entity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof EngieSharkoRare2TamedEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:engie_sharko_rare_2_tamed_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof TobyEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:toby_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof MarshalEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:marshal_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof TigerEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:tiger_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof LouisEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:louis_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof BuddyEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:buddy_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof ApolloEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:apollo_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof AtlasEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:atlas_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof CBEEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:cbe_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
		if (entity instanceof PBEEntity) {
			if (Math.random() <= 0.000005) {
				AllaboutengieMod.LOGGER.debug("Rolled zoomies chance, spawned zoomies state.");
				if (!entity.level.isClientSide())
					entity.discard();
				AllaboutengieMod.queueServerWork(1, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "summon allaboutengie:pbe_zoomies ~ ~ ~");
						}
					}
				});
			}
		}
	}
}
