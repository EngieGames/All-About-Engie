
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

import java.util.List;

public class RareSharkoClothItem extends Item {
	public RareSharkoClothItem() {
		super(new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("my pain is unmeasureable"));
	}
}
