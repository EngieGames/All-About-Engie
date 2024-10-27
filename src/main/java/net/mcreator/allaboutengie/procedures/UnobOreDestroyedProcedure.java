package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class UnobOreDestroyedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 9) == 1) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_HELMET.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 2) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHESTPLATE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 3) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_LEGGINGS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 4) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_BOOTS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_SWORD.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 6) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_PICKAXE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 7) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_AXE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 8) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_SHOVEL.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 9) == 9) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(AllaboutengieModItems.UNOBTAINIUM_HOE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
