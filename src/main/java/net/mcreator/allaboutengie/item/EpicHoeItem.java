
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class EpicHoeItem extends HoeItem {
	public EpicHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1016;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 0, 0f, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS));
	}
}
