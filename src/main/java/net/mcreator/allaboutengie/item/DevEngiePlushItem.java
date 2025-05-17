
package net.mcreator.allaboutengie.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class DevEngiePlushItem extends Item {
	public DevEngiePlushItem() {
		super(new Item.Properties().tab(null).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Hey, I see you're the type to read special info about items."));
		list.add(Component.literal("Allow me to let you in on a secret about the mod."));
		list.add(Component.literal("The mod wasn't made for just fun and games."));
		list.add(Component.literal("It was made as an introduction, a story, and personality about me."));
		list.add(Component.literal("Thanks for playing All About Engie."));
	}
}
