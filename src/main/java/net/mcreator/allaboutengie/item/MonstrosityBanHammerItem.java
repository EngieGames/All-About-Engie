
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.procedures.MonstrosityBanObtainProProcedure;
import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

import java.util.List;

public class MonstrosityBanHammerItem extends SwordItem {
	public MonstrosityBanHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 24000;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2398f;
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
		}, 3, -3f, new Item.Properties().tab(AllaboutengieModTabs.TAB_BAN_HAMMERS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("You could say this ban hammer is a Monstrosity.. Heh? Alright I know that was a terrible joke anyway."));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		MonstrosityBanObtainProProcedure.execute(world, entity);
	}
}
