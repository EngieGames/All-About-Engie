
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.procedures.MassiveBanObtainProProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class MassiveBanHammerPixelItem extends SwordItem {
	public MassiveBanHammerPixelItem() {
		super(new Tier() {
			public int getUses() {
				return 15840;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1582f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.5f, new Item.Properties().tab(AllaboutengieModTabs.TAB_PIXEL_ITEMS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		MassiveBanObtainProProcedure.execute(world, entity);
	}
}
