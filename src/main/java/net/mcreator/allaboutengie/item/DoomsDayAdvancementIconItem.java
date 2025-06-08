
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DoomsDayAdvancementIconItem extends Item {
	public DoomsDayAdvancementIconItem() {
		super(new Item.Properties().tab(null).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
