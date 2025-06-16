package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

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
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true) {
			if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
				if (world instanceof Level _lvl1 && _lvl1.isDay()) {
					if (AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle == false) {
						if (AllaboutengieModVariables.MapVariables.get(world).riskcooldown == true) {
							entity.getPersistentData().putDouble("riskcooldown", (entity.getPersistentData().getDouble("riskcooldown") + 0.05));
							if (entity.getPersistentData().getDouble("riskcooldown") >= 5) {
								AllaboutengieModVariables.MapVariables.get(world).riskcooldown = false;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								entity.getPersistentData().putDouble("riskcooldown", 0);
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).riskcooldown == false) {
							if (AllaboutengieModVariables.MapVariables.get(world).Risk == 1) {
								if (Math.random() <= 0.0005) {
									AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									if (Math.random() <= 0.05) {
										AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									} else if (Math.random() > 0.05) {
										if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
											if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
												AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											}
										} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
											if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
												AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											}
										}
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
									AllaboutengieModVariables.MapVariables.get(world).Risk = 2;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else {
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
							} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 2) {
								if (Math.random() <= 0.007) {
									AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									if (Math.random() <= 0.05) {
										AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									} else if (Math.random() > 0.05) {
										if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
											if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
												AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											}
										} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
											if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
												AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											}
										}
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
									AllaboutengieModVariables.MapVariables.get(world).Risk = 3;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else {
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
							} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 3) {
								if (Math.random() <= 0.013) {
									AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									if (Math.random() <= 0.05) {
										AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									} else if (Math.random() > 0.05) {
										if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
											if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
												AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											}
										} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
											if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
												AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											}
										}
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
									AllaboutengieModVariables.MapVariables.get(world).Risk = 4;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else {
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
							} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 4) {
								if (Math.random() <= 0.02) {
									AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									if (Math.random() <= 0.05) {
										AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
										AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									} else if (Math.random() > 0.05) {
										if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
											if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
												AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											}
										} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
											if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
												AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
												AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
												AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
												AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											}
										}
									}
								} else if (AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount >= 30) {
									AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = 0;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else {
									AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount = AllaboutengieModVariables.MapVariables.get(world).DoomsdayRiskFailCount + 1;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								}
							} else if (AllaboutengieModVariables.MapVariables.get(world).Risk == 5) {
								AllaboutengieModVariables.MapVariables.get(world).OHBOY = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = true;
								AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								if (Math.random() <= 0.05) {
									AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).TheEndStart = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
								} else if (Math.random() > 0.05) {
									if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == true) {
										if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
											AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = true;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
									} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.SUPER_DOOMS_DAY_TOGGLE) == false) {
										if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == false) {
											AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle = true;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										} else if (AllaboutengieModVariables.MapVariables.get(world).SDDAYToggle == true) {
											AllaboutengieModVariables.MapVariables.get(world).TheEndStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
											AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = true;
											AllaboutengieModVariables.MapVariables.get(world).syncData(world);
										}
									}
								}
							}
						}
					}
				} else if (!(world instanceof Level _lvl16 && _lvl16.isDay())) {
					AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					AllaboutengieModVariables.MapVariables.get(world).DayCooldownToggle = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
