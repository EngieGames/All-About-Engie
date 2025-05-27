package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.HashMap;

public class EngiesBirthdayBundleNameChangeProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ENGIES_BIRTHDAY_BUNDLE25.get()) {
			((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).setHoverName(Component.literal((guistate.containsKey("text:ChangeBundleName") ? ((EditBox) guistate.get("text:ChangeBundleName")).getValue() : "")));
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AllaboutengieModItems.ENGIES_BIRTHDAY_BUNDLE25.get()) {
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setHoverName(Component.literal((guistate.containsKey("text:ChangeBundleName") ? ((EditBox) guistate.get("text:ChangeBundleName")).getValue() : "")));
		} else {
			(new ItemStack(AllaboutengieModItems.ENGIES_BIRTHDAY_BUNDLE25.get())).setHoverName(Component.literal((guistate.containsKey("text:ChangeBundleName") ? ((EditBox) guistate.get("text:ChangeBundleName")).getValue() : "")));
		}
	}
}
