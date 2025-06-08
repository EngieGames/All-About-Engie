
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class TheEndCrucifixPixelItem extends Item {
	public TheEndCrucifixPixelItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_PIXEL_ITEMS).durability(125).rarity(Rarity.RARE));
	}
}
