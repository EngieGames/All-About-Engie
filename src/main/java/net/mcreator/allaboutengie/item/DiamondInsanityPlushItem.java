
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class DiamondInsanityPlushItem extends Item {
	public DiamondInsanityPlushItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS).stacksTo(64).rarity(Rarity.RARE));
	}
}
