
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class NetheriteEnragedEngiePlushItem extends Item {
	public NetheriteEnragedEngiePlushItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS).stacksTo(64).rarity(Rarity.EPIC));
	}
}
