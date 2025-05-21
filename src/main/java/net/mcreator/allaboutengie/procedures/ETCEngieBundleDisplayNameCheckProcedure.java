package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class ETCEngieBundleDisplayNameCheckProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.DEVELOPER_ENGIE_BUNDLE.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.DEVELOPER_ENGIE_BUNDLE.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getDisplayName().getString();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.IDEAGIVER_ENGIE_BUNDLE.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.IDEAGIVER_ENGIE_BUNDLE.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getDisplayName().getString();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.TESTER_ENGIE_BUNDLE.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.TESTER_ENGIE_BUNDLE.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getDisplayName().getString();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.CONTENT_CREATOR_ENGIE_BUNDLE.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getDisplayName().getString();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.CONTENT_CREATOR_ENGIE_BUNDLE.get()) {
			return (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getDisplayName().getString();
		}
		return new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_BUNDLE.get()).getDisplayName().getString();
	}
}
