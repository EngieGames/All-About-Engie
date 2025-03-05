
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.procedures.BigBanObtainProProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class BigBanHammerPixelItem extends SwordItem {
	public BigBanHammerPixelItem() {
		super(new Tier() {
			public int getUses() {
				return 2640;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 262f;
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
		}, 3, -1.25f, new Item.Properties().tab(AllaboutengieModTabs.TAB_PIXEL_ITEMS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		BigBanObtainProProcedure.execute(entity);
	}
}
