
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.allaboutengie.procedures.ExocookfinishProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public class ExoticCookieItem extends Item {
	public ExoticCookieItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_FOOD).stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 35;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ExocookfinishProcedure.execute(entity);
		return retval;
	}
}
