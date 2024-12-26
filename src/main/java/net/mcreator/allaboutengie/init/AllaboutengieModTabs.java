
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AllaboutengieModTabs {
	public static CreativeModeTab TAB_AAE_ITEMS_ITEMS;
	public static CreativeModeTab TAB_AAE_ITEMS_ARMOR;
	public static CreativeModeTab TAB_AAE_ITEMS_FOOD;
	public static CreativeModeTab TAB_MOBS;
	public static CreativeModeTab TAB_SHARKOS;
	public static CreativeModeTab TAB_ZOMBIES;
	public static CreativeModeTab TAB_PIXEL_ITEMS;
	public static CreativeModeTab TAB_BAN_HAMMERS;

	public static void load() {
		TAB_AAE_ITEMS_ITEMS = new CreativeModeTab("tabaae_items_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.ENGIE_GEM.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AAE_ITEMS_ARMOR = new CreativeModeTab("tabaae_items_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.ENGIES_HELMET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_AAE_ITEMS_FOOD = new CreativeModeTab("tabaae_items_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.COOKED_PIZZA.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MOBS = new CreativeModeTab("tabmobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.AAE_ENGIE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SHARKOS = new CreativeModeTab("tabsharkos") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.COOKIE);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ZOMBIES = new CreativeModeTab("tabzombies") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.ENRAGED_ZOMBIES_PLAQUE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_PIXEL_ITEMS = new CreativeModeTab("tabpixel_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.CRUCIFIX_PIXEL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BAN_HAMMERS = new CreativeModeTab("tabban_hammers") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AllaboutengieModItems.BAN_HAMMER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
