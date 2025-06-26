package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.init.AllaboutengieModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RareChanceProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
					|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
					|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
					|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0) {
			if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() <= 0.1) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() <= 0.1) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.1) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.1) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.1) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.1) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.1) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.1) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.1) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() <= 0.15) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() <= 0.15) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.15) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.15) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.15) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.15) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.15) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.15) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.15) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() <= 0.2) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() <= 0.2) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.2) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.2) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.2) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.2) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.2) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.2) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.2) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() <= 0.25) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() <= 0.25) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.25) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.25) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.25) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.25) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.25) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.25) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.25) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 5
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 5) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() <= 0.3) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() <= 0.3) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.3) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.3) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.3) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.3) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.3) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.3) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.3) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 6
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 6) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() <= 0.35) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() <= 0.35) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.35) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.35) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.35) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.35) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.35) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.35) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.35) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 7
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 7) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() <= 0.4) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() <= 0.4) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.4) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.4) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.4) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.4) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.4) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.4) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.4) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 8
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 8) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() <= 0.45) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() <= 0.45) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.45) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.45) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.45) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.45) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.45) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.45) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.45) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 9
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 9) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() <= 0.5) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() <= 0.5) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.5) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.5) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.5) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.5) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.5) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.5) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.5) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 10
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 10) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (Math.random() <= 0.55) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
						entityToSpawn.setPickUpDelay(1);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() <= 0.55) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.55) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.55) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.55) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.55) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.55) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.55) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.55) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} else if ((EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0)
				&& (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) != 0)) {
			if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
					for (int index0 = 0; index0 < 1; index0++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.1) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.1) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.1) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.1) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.1) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.1) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.1) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.1) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.1) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
					for (int index1 = 0; index1 < 1; index1++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.1) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.1) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.1) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.1) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.1) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.1) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.1) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.1) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.1) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
					for (int index2 = 0; index2 < 1; index2++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.1) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.1) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.1) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.1) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.1) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.1) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.1) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.1) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.1) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
					for (int index3 = 0; index3 < 1; index3++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.15) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.15) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.15) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.15) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.15) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.15) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.15) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.15) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.15) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
					for (int index4 = 0; index4 < 2; index4++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.15) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.15) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.15) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.15) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.15) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.15) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.15) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.15) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.15) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
					for (int index5 = 0; index5 < 3; index5++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.15) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.15) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.15) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.15) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.15) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.15) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.15) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.15) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.15) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
					for (int index6 = 0; index6 < 1; index6++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.2) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.2) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.2) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.2) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.2) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.2) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.2) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.2) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.2) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
					for (int index7 = 0; index7 < 2; index7++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.2) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.2) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.2) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.2) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.2) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.2) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.2) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.2) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.2) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
					for (int index8 = 0; index8 < 3; index8++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.2) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.2) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.2) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.2) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.2) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.2) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.2) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.2) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.2) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
					for (int index9 = 0; index9 < 1; index9++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.25) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.25) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.25) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.25) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.25) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.25) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.25) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.25) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.25) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
					for (int index10 = 0; index10 < 2; index10++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.25) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.25) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.25) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.25) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.25) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.25) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.25) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.25) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.25) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
					for (int index11 = 0; index11 < 3; index11++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.25) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.25) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.25) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.25) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.25) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.25) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.25) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.25) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.25) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 5
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 5) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
					for (int index12 = 0; index12 < 1; index12++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.3) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.3) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.3) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.3) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.3) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.3) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.3) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.3) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.3) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
					for (int index13 = 0; index13 < 2; index13++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.3) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.3) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.3) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.3) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.3) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.3) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.3) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.3) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.3) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
					for (int index14 = 0; index14 < 3; index14++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.3) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.3) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.3) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.3) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.3) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.3) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.3) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.3) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.3) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 6
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 6) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
					for (int index15 = 0; index15 < 1; index15++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.35) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.35) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.35) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.35) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.35) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.35) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.35) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.35) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.35) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
					for (int index16 = 0; index16 < 2; index16++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.35) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.35) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.35) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.35) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.35) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.35) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.35) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.35) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.35) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
					for (int index17 = 0; index17 < 3; index17++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.35) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.35) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.35) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.35) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.35) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.35) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.35) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.35) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.35) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 7
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 7) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
					for (int index18 = 0; index18 < 1; index18++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.4) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.4) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.4) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.4) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.4) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.4) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.4) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.4) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.4) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
					for (int index19 = 0; index19 < 2; index19++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.4) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.4) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.4) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.4) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.4) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.4) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.4) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.4) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.4) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
					for (int index20 = 0; index20 < 3; index20++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.4) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.4) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.4) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.4) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.4) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.4) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.4) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.4) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.4) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 8
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 8) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
					for (int index21 = 0; index21 < 1; index21++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.45) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.45) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.45) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.45) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.45) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.45) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.45) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.45) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.45) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
					for (int index22 = 0; index22 < 2; index22++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.45) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.45) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.45) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.45) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.45) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.45) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.45) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.45) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.45) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
					for (int index23 = 0; index23 < 3; index23++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.45) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.45) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.45) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.45) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.45) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.45) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.45) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.45) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.45) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 9
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 9) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
					for (int index24 = 0; index24 < 1; index24++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.5) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.5) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.5) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.5) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.5) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.5) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.5) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.5) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.5) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
					for (int index25 = 0; index25 < 2; index25++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.5) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.5) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.5) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.5) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.5) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.5) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.5) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.5) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.5) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
					for (int index26 = 0; index26 < 3; index26++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.5) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.5) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.5) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.5) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.5) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.5) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.5) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.5) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.5) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 10
					|| EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 10) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 1) {
					for (int index27 = 0; index27 < 1; index27++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.55) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.55) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.55) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.55) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.55) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.55) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.55) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.55) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.55) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 2) {
					for (int index28 = 0; index28 < 2; index28++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.55) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.55) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.55) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.55) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.55) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.55) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.55) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.55) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.55) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3
						|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING, (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)) == 3) {
					for (int index29 = 0; index29 < 3; index29++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
							entityToSpawn.setPickUpDelay(1);
							_level.addFreshEntity(entityToSpawn);
						}
						if (Math.random() <= 0.55) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
							if (Math.random() <= 0.55) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
									entityToSpawn.setPickUpDelay(1);
									_level.addFreshEntity(entityToSpawn);
								}
								if (Math.random() <= 0.55) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
										entityToSpawn.setPickUpDelay(1);
										_level.addFreshEntity(entityToSpawn);
									}
									if (Math.random() <= 0.55) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
											entityToSpawn.setPickUpDelay(1);
											_level.addFreshEntity(entityToSpawn);
										}
										if (Math.random() <= 0.55) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
												entityToSpawn.setPickUpDelay(1);
												_level.addFreshEntity(entityToSpawn);
											}
											if (Math.random() <= 0.55) {
												if (world instanceof Level _level && !_level.isClientSide()) {
													ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
													entityToSpawn.setPickUpDelay(1);
													_level.addFreshEntity(entityToSpawn);
												}
												if (Math.random() <= 0.55) {
													if (world instanceof Level _level && !_level.isClientSide()) {
														ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
														entityToSpawn.setPickUpDelay(1);
														_level.addFreshEntity(entityToSpawn);
													}
													if (Math.random() <= 0.55) {
														if (world instanceof Level _level && !_level.isClientSide()) {
															ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
															entityToSpawn.setPickUpDelay(1);
															_level.addFreshEntity(entityToSpawn);
														}
														if (Math.random() <= 0.55) {
															if (world instanceof Level _level && !_level.isClientSide()) {
																ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
																entityToSpawn.setPickUpDelay(1);
																_level.addFreshEntity(entityToSpawn);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (entity instanceof Player) {
			if ((entity.getDisplayName().getString()).equals("Dev")) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_DEV_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_DEV_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_DEV_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_DEV_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.AAE_ENGIE.get()));
					entityToSpawn.setPickUpDelay(1);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).ddaystart == true) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && world.getLevelData().isRaining() && !world.getLevelData().isThundering()) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DOOMS_DAY_COIN.get()));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).sddaystart == true) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_COIN.get()));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == true && AllaboutengieModVariables.MapVariables.get(world).thestart == true) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DOOMSDAY_TOGGLE) == false && world.getLevelData().isRaining() && world.getLevelData().isThundering()) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
				entityToSpawn.setPickUpDelay(1);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
