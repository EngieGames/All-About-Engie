package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

import java.util.Iterator;

public class EngieGamesRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_FIND_ENGIE) == true) {
			if ((entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:found_engie"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:found_engie"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"clippedbyengie\",\"obfuscated\":true,\"color\":\"red\"},{\"text\":\"> Hey, I've been waiting. You probably don't know who I am. Lets just put it this way.\"}]");
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
										"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"clippedbyengie\",\"color\":\"red\"},{\"text\":\"> I am Engie, also known as EngieGames or clippedbyengie.\"}]");
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null)
										_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
												"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"clippedbyengie\",\"color\":\"red\"},{\"text\":\"> I'm impressed you found me, I ditched for quite the long time. The others.. You have no clue what happened to them.\"}]");
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										{
											Entity _ent = entity;
											if (!_ent.level.isClientSide() && _ent.getServer() != null)
												_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
														"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"clippedbyengie\",\"color\":\"red\"},{\"text\":\"> Let's just put it right here. They're... well... \"},{\"text\":\"dead\",\"underlined\":true},{\"text\":\".\"}]");
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null)
														_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
																"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"clippedbyengie\",\"color\":\"red\"},{\"text\":\"> But hey, thanks for finding me. I'm still shook after the \"},{\"text\":\"incident\",\"bold\":true},{\"text\":\"...\"}]");
												}
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private LevelAccessor world;

													public void start(LevelAccessor world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														{
															Entity _ent = entity;
															if (!_ent.level.isClientSide() && _ent.getServer() != null)
																_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
																		"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[AAE Developer] clippedbyengie\",\"color\":\"red\"},{\"text\":\"> And that's that! Thanks for playing the new mode! I'm now going to change the gamerule back to normal. Have fun!\"}]");
														}
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private LevelAccessor world;

															public void start(LevelAccessor world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																{
																	Entity _ent = entity;
																	if (!_ent.level.isClientSide() && _ent.getServer() != null)
																		_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "advancement grant @p only allaboutengie:found_engie");
																}
																if (world instanceof Level _level)
																	_level.getGameRules().getRule(AllaboutengieModGameRules.DETECTIVE_FIND_ENGIE).set(false, _level.getServer());
																{
																	Entity _ent = entity;
																	if (!_ent.level.isClientSide() && _ent.getServer() != null)
																		_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
																				"tellraw @p [\"\",{\"text\":\"clippedbyengie has changed the gamerule detectiveFindEngie\",\"italic\":true,\"color\":\"gray\"},{\"text\":\" to false\",\"italic\":true,\"color\":\"gray\"}]");
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 220);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 160);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 200);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 200);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 160);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 200);
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @p {\"text\":\"Let the man be.\",\"bold\":true,\"color\":\"gold\"}");
			}
		}
	}
}
