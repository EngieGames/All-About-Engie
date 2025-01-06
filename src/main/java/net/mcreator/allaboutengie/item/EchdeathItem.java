
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

import java.util.List;

public class EchdeathItem extends SwordItem {
	public EchdeathItem() {
		super(new Tier() {
			public int getUses() {
				return 128000;
			}

			public float getSpeed() {
				return 128000f;
			}

			public float getAttackDamageBonus() {
				return 127998f;
			}

			public int getLevel() {
				return 128000;
			}

			public int getEnchantmentValue() {
				return 128000;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -3f, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(":echdeath:"));
	}
}
