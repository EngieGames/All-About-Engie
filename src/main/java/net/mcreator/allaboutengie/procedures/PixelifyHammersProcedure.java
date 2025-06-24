package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PixelifyHammersProcedure {
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
		if (AllaboutengieModVariables.WorldVariables.get(world).yeah == true) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIES_SCYTHE.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.ENGIES_SCYTHE_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.ENGIES_SCYTHE.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIES_SCYTHE_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.ENGIES_SCYTHE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.CRUCIFIX.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.CRUCIFIX_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.CRUCIFIX.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.CRUCIFIX_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.CRUCIFIX.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.DOOMS_DAY_CRUCIFIX.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.DOOMS_DAY_CRUCIFIX_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.DOOMS_DAY_CRUCIFIX.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.DOOMS_DAY_CRUCIFIX_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.DOOMS_DAY_CRUCIFIX.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_CRUCIFIX.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_CRUCIFIX_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_CRUCIFIX.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_CRUCIFIX_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAY_CRUCIFIX.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.THE_END_CRUCIFIX.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.THE_END_CRUCIFIX_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.THE_END_CRUCIFIX.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.THE_END_CRUCIFIX_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.THE_END_CRUCIFIX.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENGIE_CRUCIFIX.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.ENGIE_CRUCIFIX_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.ENGIE_CRUCIFIX.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_CRUCIFIX_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.ENGIE_CRUCIFIX.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.BAN_HAMMER.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER_PIXEL.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.MONSTROSITY_BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.MONSTROSITY_BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.MONSTROSITY_BAN_HAMMER.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.MONSTROSITY_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.COMICALLY_MASSIVE_BAN_HAMMER.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.COMICALLY_MASSIVE_BAN_HAMMER_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.COMICALLY_MASSIVE_BAN_HAMMER.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.COMICALLY_MASSIVE_BAN_HAMMER_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.COMICALLY_MASSIVE_BAN_HAMMER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AllaboutengieModItems.ECHDEATH.get())) : false) {
				AllaboutengieMod.queueServerWork(1, () -> {
					(new ItemStack(AllaboutengieModItems.ECHDEATH_PIXEL.get())).setDamageValue((new ItemStack(AllaboutengieModItems.ECHDEATH.get())).getDamageValue());
				});
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ECHDEATH_PIXEL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(AllaboutengieModItems.ECHDEATH.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		}
	}
}
