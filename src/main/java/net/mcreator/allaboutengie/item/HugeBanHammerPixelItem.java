
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.procedures.HugeBanObtainProProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class HugeBanHammerPixelItem extends SwordItem {
	public HugeBanHammerPixelItem() {
		super(new Tier() {
			public int getUses() {
				return 7920;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 790f;
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
		}, 3, -1.75f, new Item.Properties().tab(AllaboutengieModTabs.TAB_PIXEL_ITEMS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		HugeBanObtainProProcedure.execute(world, entity);
	}
}
