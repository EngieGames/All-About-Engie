
package net.mcreator.allaboutengie.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;
import net.mcreator.allaboutengie.init.AllaboutengieModBlocks;

public class BiblicallyAccurateEngieAxeItem extends AxeItem {
	public BiblicallyAccurateEngieAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2250;
			}

			public float getSpeed() {
				return 27f;
			}

			public float getAttackDamageBonus() {
				return 123f;
			}

			public int getLevel() {
				return 15;
			}

			public int getEnchantmentValue() {
				return 27;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModBlocks.BIBLICALLY_ACCURATE_BLOCK.get()));
			}
		}, 1, -1.4f, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
