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
import net.mcreator.allaboutengie.init.AllaboutengieModBlocks;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class ItemAdvancementsProcedure {
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
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIE_GEM.get())) : false) {
			if ((entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_gem_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_gem_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModBlocks.ENGIE_BLOCK.get())) : false) {
			if ((entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
					&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_gem_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_gem_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel
					&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_essence_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_essence_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get())) : false) {
			if ((entity instanceof ServerPlayer _plr10 && _plr10.level instanceof ServerLevel
					&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_essence_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_essence_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr13 && _plr13.level instanceof ServerLevel
					&& _plr13.getAdvancements().getOrStartProgress(_plr13.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_essence_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_essence_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get())) : false) {
			if ((entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
					&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_essence_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_essence_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr19 && _plr19.level instanceof ServerLevel
					&& _plr19.getAdvancements().getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_essence_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_essence_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get())) : false) {
			if ((entity instanceof ServerPlayer _plr22 && _plr22.level instanceof ServerLevel
					&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_essence_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_engie_essence_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIE_AXE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr25 && _plr25.level instanceof ServerLevel
					&& _plr25.getAdvancements().getOrStartProgress(_plr25.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIE_PICKAXE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr28 && _plr28.level instanceof ServerLevel
					&& _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIE_SHOVEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
					&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIE_HOE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr34 && _plr34.level instanceof ServerLevel
					&& _plr34.getAdvancements().getOrStartProgress(_plr34.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_AXE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr37 && _plr37.level instanceof ServerLevel
					&& _plr37.getAdvancements().getOrStartProgress(_plr37.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PICKAXE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr40 && _plr40.level instanceof ServerLevel
					&& _plr40.getAdvancements().getOrStartProgress(_plr40.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_SHOVEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr43 && _plr43.level instanceof ServerLevel
					&& _plr43.getAdvancements().getOrStartProgress(_plr43.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_HOE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr46 && _plr46.level instanceof ServerLevel
					&& _plr46.getAdvancements().getOrStartProgress(_plr46.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:angry_engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_AXE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr49 && _plr49.level instanceof ServerLevel
					&& _plr49.getAdvancements().getOrStartProgress(_plr49.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_PICKAXE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr52 && _plr52.level instanceof ServerLevel
					&& _plr52.getAdvancements().getOrStartProgress(_plr52.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_SHOVEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr55 && _plr55.level instanceof ServerLevel
					&& _plr55.getAdvancements().getOrStartProgress(_plr55.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_HOE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr58 && _plr58.level instanceof ServerLevel
					&& _plr58.getAdvancements().getOrStartProgress(_plr58.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_tool_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enraged_engie_tool_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_AXE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr61 && _plr61.level instanceof ServerLevel
					&& _plr61.getAdvancements().getOrStartProgress(_plr61.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_tools_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_PICKAXE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr64 && _plr64.level instanceof ServerLevel
					&& _plr64.getAdvancements().getOrStartProgress(_plr64.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_tools_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_SHOVEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr67 && _plr67.level instanceof ServerLevel
					&& _plr67.getAdvancements().getOrStartProgress(_plr67.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_tools_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_HOE.get())) : false) {
			if ((entity instanceof ServerPlayer _plr70 && _plr70.level instanceof ServerLevel
					&& _plr70.getAdvancements().getOrStartProgress(_plr70.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_tools_obtained"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:outraged_tools_obtained"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER.get())) : false) {
			if ((entity instanceof ServerPlayer _plr73 && _plr73.level instanceof ServerLevel
					&& _plr73.getAdvancements().getOrStartProgress(_plr73.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mini_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mini_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER_PIXEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr76 && _plr76.level instanceof ServerLevel
					&& _plr76.getAdvancements().getOrStartProgress(_plr76.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mini_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:mini_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.BAN_HAMMER.get())) : false) {
			if ((entity instanceof ServerPlayer _plr79 && _plr79.level instanceof ServerLevel
					&& _plr79.getAdvancements().getOrStartProgress(_plr79.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.BAN_HAMMER_PIXEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr82 && _plr82.level instanceof ServerLevel
					&& _plr82.getAdvancements().getOrStartProgress(_plr82.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER.get())) : false) {
			if ((entity instanceof ServerPlayer _plr85 && _plr85.level instanceof ServerLevel
					&& _plr85.getAdvancements().getOrStartProgress(_plr85.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:big_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:big_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER_PIXEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr88 && _plr88.level instanceof ServerLevel
					&& _plr88.getAdvancements().getOrStartProgress(_plr88.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:big_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:big_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER.get())) : false) {
			if ((entity instanceof ServerPlayer _plr91 && _plr91.level instanceof ServerLevel
					&& _plr91.getAdvancements().getOrStartProgress(_plr91.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:large_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:large_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER_PIXEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr94 && _plr94.level instanceof ServerLevel
					&& _plr94.getAdvancements().getOrStartProgress(_plr94.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:large_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:large_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER.get())) : false) {
			if ((entity instanceof ServerPlayer _plr97 && _plr97.level instanceof ServerLevel
					&& _plr97.getAdvancements().getOrStartProgress(_plr97.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:huge_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:huge_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER_PIXEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr100 && _plr100.level instanceof ServerLevel
					&& _plr100.getAdvancements().getOrStartProgress(_plr100.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:huge_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:huge_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER.get())) : false) {
			if ((entity instanceof ServerPlayer _plr103 && _plr103.level instanceof ServerLevel
					&& _plr103.getAdvancements().getOrStartProgress(_plr103.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enormous_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enormous_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER_PIXEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr106 && _plr106.level instanceof ServerLevel
					&& _plr106.getAdvancements().getOrStartProgress(_plr106.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enormous_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:enormous_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER.get())) : false) {
			if ((entity instanceof ServerPlayer _plr109 && _plr109.level instanceof ServerLevel
					&& _plr109.getAdvancements().getOrStartProgress(_plr109.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gigantic_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gigantic_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER_PIXEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr112 && _plr112.level instanceof ServerLevel
					&& _plr112.getAdvancements().getOrStartProgress(_plr112.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gigantic_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:gigantic_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER.get())) : false) {
			if ((entity instanceof ServerPlayer _plr115 && _plr115.level instanceof ServerLevel
					&& _plr115.getAdvancements().getOrStartProgress(_plr115.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:massive_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:massive_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER_PIXEL.get())) : false) {
			if ((entity instanceof ServerPlayer _plr118 && _plr118.level instanceof ServerLevel
					&& _plr118.getAdvancements().getOrStartProgress(_plr118.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:massive_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:massive_ban_obtain"));
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
