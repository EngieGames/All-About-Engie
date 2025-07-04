package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class BirthdayBundleForYoungestNameCheckProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ENGIE_BIRTHDAY_BUNDLE_FOR_YOUNGEST.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ENGIE_BIRTHDAY_BUNDLE_FOR_YOUNGEST.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getDisplayName().getString();
		}
		return new ItemStack(AllaboutengieModItems.ENGIE_BIRTHDAY_BUNDLE_FOR_YOUNGEST.get()).getDisplayName().getString();
	}
}
