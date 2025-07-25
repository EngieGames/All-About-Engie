
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.procedures.MonstrosityToolObtainProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

public class MonstrosityEngieHoeItem extends HoeItem {
	public MonstrosityEngieHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 123f;
			}

			public int getLevel() {
				return 18;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get()));
			}
		}, 0, -1f, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		MonstrosityToolObtainProcedure.execute(entity);
	}
}
