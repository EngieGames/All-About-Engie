
package net.mcreator.allaboutengie.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.procedures.BiblicallyAccurateBanObtainProProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class BiblicallyAccurateEngieScytheItem extends SwordItem {
	public BiblicallyAccurateEngieScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 9240;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 1844f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.75f, new Item.Properties().tab(AllaboutengieModTabs.TAB_BAN_HAMMERS));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		BiblicallyAccurateBanObtainProProcedure.execute(world, entity);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
