
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AllAboutEngiePlaqueItem extends Item {
	public AllAboutEngiePlaqueItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}
}
