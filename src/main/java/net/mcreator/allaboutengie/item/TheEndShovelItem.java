
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class TheEndShovelItem extends ShovelItem {
	public TheEndShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 7000;
			}

			public float getSpeed() {
				return 39f;
			}

			public float getAttackDamageBonus() {
				return 323f;
			}

			public int getLevel() {
				return 27;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AllaboutengieModItems.THE_END_COIN.get()));
			}
		}, 1, 0.2f, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Congrats!"));
	}
}
