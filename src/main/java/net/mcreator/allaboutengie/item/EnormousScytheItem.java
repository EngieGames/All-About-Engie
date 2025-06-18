
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.procedures.EnormousBanObtainProProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class EnormousScytheItem extends SwordItem {
	public EnormousScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 5280;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1052f;
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
		}, 3, -2f, new Item.Properties().tab(AllaboutengieModTabs.TAB_BAN_HAMMERS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EnormousBanObtainProProcedure.execute(world, entity);
	}
}
