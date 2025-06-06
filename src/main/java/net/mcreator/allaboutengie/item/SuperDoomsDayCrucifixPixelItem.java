
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class SuperDoomsDayCrucifixPixelItem extends Item {
	public SuperDoomsDayCrucifixPixelItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_PIXEL_ITEMS).durability(100).rarity(Rarity.RARE));
	}
}
