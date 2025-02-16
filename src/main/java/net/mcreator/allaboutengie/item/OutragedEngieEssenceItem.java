
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.procedures.OutragedEngieEssenceObtainProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class OutragedEngieEssenceItem extends Item {
	public OutragedEngieEssenceItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		OutragedEngieEssenceObtainProcedure.execute(entity);
	}
}
