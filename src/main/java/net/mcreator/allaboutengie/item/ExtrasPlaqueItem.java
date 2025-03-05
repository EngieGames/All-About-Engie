
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ExtrasPlaqueItem extends Item {
	public ExtrasPlaqueItem() {
		super(new Item.Properties().tab(null).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}
}
