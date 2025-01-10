
package net.mcreator.allaboutengie.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class LargeBanHammerPixelItem extends SwordItem {
	public LargeBanHammerPixelItem() {
		super(new Tier() {
			public int getUses() {
				return 6000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 598f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 128000;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.5f, new Item.Properties().tab(AllaboutengieModTabs.TAB_PIXEL_ITEMS));
	}
}
