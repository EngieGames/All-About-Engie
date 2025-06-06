
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class DoomsDayCrucifixPixelItem extends Item {
	public DoomsDayCrucifixPixelItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_PIXEL_ITEMS).durability(75).rarity(Rarity.RARE));
	}
}
