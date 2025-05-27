package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OHBOYProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
			if (AllaboutengieModVariables.MapVariables.get(world).riskcooldown == true) {
				entity.getPersistentData().putDouble("riskcooldown", (entity.getPersistentData().getDouble("riskcooldown") + 0.05));
				if (entity.getPersistentData().getDouble("riskcooldown") >= 300) {
					AllaboutengieModVariables.MapVariables.get(world).riskcooldown = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					entity.getPersistentData().putDouble("riskcooldown", 0);
				}
			} else if (AllaboutengieModVariables.MapVariables.get(world).riskcooldown == false) {
				if (AllaboutengieModVariables.MapVariables.get(world).Risk == 1) {
					if (Math.random() >= 0.005) {
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Spawned DoomsDay with the risk of \"Low\"");
					} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 50) {
						AllaboutengieModVariables.MapVariables.get(world).Risk = 2;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Upgraded DoomsDay chance to \"Medium\"");
					} else {
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Added +1 to DoomsDay \"Low\" risk fail count.");
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 2) {
					if (Math.random() >= 0.007) {
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Spawned DoomsDay with the risk of \"Medium\"");
					} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 50) {
						AllaboutengieModVariables.MapVariables.get(world).Risk = 3;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Upgraded DoomsDay chance to \"High\"");
					} else {
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Added +1 to DoomsDay \"Medium\" risk fail count.");
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 3) {
					if (Math.random() >= 0.013) {
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Spawned DoomsDay with the risk of \"High\"");
					} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 50) {
						AllaboutengieModVariables.MapVariables.get(world).Risk = 4;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Upgraded DoomsDay chance to \"Extreme\"");
					} else {
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Added +1 to DoomsDay \"High\" risk fail count.");
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 4) {
					if (Math.random() >= 0.02) {
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Spawned DoomsDay with the risk of \"Extreme\"");
					} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 50) {
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Upgraded DoomsDay chance to \"Guaranteed\"");
					} else {
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieMod.LOGGER.info("Added +1 to DoomsDay \"Extreme\" risk fail count.");
					}
				} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 5) {
					AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieMod.LOGGER.info("Spawned DoomsDay with the risk of \"Guaranteed\"");
				}
			}
		}
	}
}
