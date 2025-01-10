
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class CommonPickaxeItem extends PickaxeItem {
	public CommonPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 59;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -2.8f, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS));
	}
}
