package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class ArmorAdvancementsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIES_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
					&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIES_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
					&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel
					&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIES_LEGGINGS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel
					&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr13 && _plr13.level instanceof ServerLevel
					&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIES_BOOTS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
					&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr18 && _plr18.level instanceof ServerLevel
					&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr21 && _plr21.level instanceof ServerLevel
					&& _plr21.getAdvancements().getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr23 && _plr23.level instanceof ServerLevel
					&& _plr23.getAdvancements().getOrStartProgress(_plr23.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr26 && _plr26.level instanceof ServerLevel
					&& _plr26.getAdvancements().getOrStartProgress(_plr26.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr28 && _plr28.level instanceof ServerLevel
					&& _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_LEGGINGS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
					&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr33 && _plr33.level instanceof ServerLevel
					&& _plr33.getAdvancements().getOrStartProgress(_plr33.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_BOOTS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr36 && _plr36.level instanceof ServerLevel
					&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr38 && _plr38.level instanceof ServerLevel
					&& _plr38.getAdvancements().getOrStartProgress(_plr38.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr41 && _plr41.level instanceof ServerLevel
					&& _plr41.getAdvancements().getOrStartProgress(_plr41.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr43 && _plr43.level instanceof ServerLevel
					&& _plr43.getAdvancements().getOrStartProgress(_plr43.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr46 && _plr46.level instanceof ServerLevel
					&& _plr46.getAdvancements().getOrStartProgress(_plr46.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr48 && _plr48.level instanceof ServerLevel
					&& _plr48.getAdvancements().getOrStartProgress(_plr48.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_LEGGINGS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr51 && _plr51.level instanceof ServerLevel
					&& _plr51.getAdvancements().getOrStartProgress(_plr51.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr53 && _plr53.level instanceof ServerLevel
					&& _plr53.getAdvancements().getOrStartProgress(_plr53.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_BOOTS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr56 && _plr56.level instanceof ServerLevel
					&& _plr56.getAdvancements().getOrStartProgress(_plr56.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr58 && _plr58.level instanceof ServerLevel
					&& _plr58.getAdvancements().getOrStartProgress(_plr58.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_armor_made"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_HELMET.get())) : false) {
			if ((entity instanceof ServerPlayer _plr61 && _plr61.level instanceof ServerLevel
					&& _plr61.getAdvancements().getOrStartProgress(_plr61.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr63 && _plr63.level instanceof ServerLevel
					&& _plr63.getAdvancements().getOrStartProgress(_plr63.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr65 && _plr65.level instanceof ServerLevel
					&& _plr65.getAdvancements().getOrStartProgress(_plr65.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_CHESTPLATE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr68 && _plr68.level instanceof ServerLevel
					&& _plr68.getAdvancements().getOrStartProgress(_plr68.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr70 && _plr70.level instanceof ServerLevel
					&& _plr70.getAdvancements().getOrStartProgress(_plr70.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr72 && _plr72.level instanceof ServerLevel
					&& _plr72.getAdvancements().getOrStartProgress(_plr72.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_LEGGINGS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr75 && _plr75.level instanceof ServerLevel
					&& _plr75.getAdvancements().getOrStartProgress(_plr75.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr77 && _plr77.level instanceof ServerLevel
					&& _plr77.getAdvancements().getOrStartProgress(_plr77.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr79 && _plr79.level instanceof ServerLevel
					&& _plr79.getAdvancements().getOrStartProgress(_plr79.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_BOOTS.get())) : false) {
			if ((entity instanceof ServerPlayer _plr82 && _plr82.level instanceof ServerLevel
					&& _plr82.getAdvancements().getOrStartProgress(_plr82.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/netherite_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr84 && _plr84.level instanceof ServerLevel
					&& _plr84.getAdvancements().getOrStartProgress(_plr84.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:story/obtain_armor"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			if ((entity instanceof ServerPlayer _plr86 && _plr86.level instanceof ServerLevel
					&& _plr86.getAdvancements().getOrStartProgress(_plr86.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_armor_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
	}
}
