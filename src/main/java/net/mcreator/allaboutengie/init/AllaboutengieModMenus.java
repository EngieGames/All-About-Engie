
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.allaboutengie.world.inventory.MetalChestUIMenu;
import net.mcreator.allaboutengie.world.inventory.MetalBundleUIMenu;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class AllaboutengieModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AllaboutengieMod.MODID);
	public static final RegistryObject<MenuType<MetalChestUIMenu>> METAL_CHEST_UI = REGISTRY.register("metal_chest_ui", () -> IForgeMenuType.create(MetalChestUIMenu::new));
	public static final RegistryObject<MenuType<MetalBundleUIMenu>> METAL_BUNDLE_UI = REGISTRY.register("metal_bundle_ui", () -> IForgeMenuType.create(MetalBundleUIMenu::new));
}
