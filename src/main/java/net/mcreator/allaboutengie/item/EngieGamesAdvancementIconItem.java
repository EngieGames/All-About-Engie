
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EngieGamesAdvancementIconItem extends Item {
	public EngieGamesAdvancementIconItem() {
		super(new Item.Properties().tab(null).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
