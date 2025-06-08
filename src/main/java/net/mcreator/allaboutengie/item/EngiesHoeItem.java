
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.procedures.MonstrosityToolObtainProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class EngiesHoeItem extends HoeItem {
	public EngiesHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 8000;
			}

			public float getSpeed() {
				return 42f;
			}

			public float getAttackDamageBonus() {
				return 373f;
			}

			public int getLevel() {
				return 30;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.ENGIE_COIN.get()));
			}
		}, 0, 0.6f, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Congrats!"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		MonstrosityToolObtainProcedure.execute(entity);
	}
}
