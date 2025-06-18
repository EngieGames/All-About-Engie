
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.procedures.GiganticBanObtainProProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class GiganticScytheItem extends SwordItem {
	public GiganticScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 6600;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1316f;
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
		}, 3, -2.25f, new Item.Properties().tab(AllaboutengieModTabs.TAB_BAN_HAMMERS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		GiganticBanObtainProProcedure.execute(world, entity);
	}
}
