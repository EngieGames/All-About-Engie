
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.allaboutengie.world.inventory.OutragedEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.MonstrosityEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.MetalChestUIMenu;
import net.mcreator.allaboutengie.world.inventory.MetalBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.EnragedEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.ETCEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.CreativeEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.BiblicallyAccurateEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.AngryEngieBundleUIMenu;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class AllaboutengieModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AllaboutengieMod.MODID);
	public static final RegistryObject<MenuType<MetalChestUIMenu>> METAL_CHEST_UI = REGISTRY.register("metal_chest_ui", () -> IForgeMenuType.create(MetalChestUIMenu::new));
	public static final RegistryObject<MenuType<MetalBundleUIMenu>> ENGIE_BUNDLE_UI = REGISTRY.register("engie_bundle_ui", () -> IForgeMenuType.create(MetalBundleUIMenu::new));
	public static final RegistryObject<MenuType<AngryEngieBundleUIMenu>> ANGRY_ENGIE_BUNDLE_UI = REGISTRY.register("angry_engie_bundle_ui", () -> IForgeMenuType.create(AngryEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<EnragedEngieBundleUIMenu>> ENRAGED_ENGIE_BUNDLE_UI = REGISTRY.register("enraged_engie_bundle_ui", () -> IForgeMenuType.create(EnragedEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<OutragedEngieBundleUIMenu>> OUTRAGED_ENGIE_BUNDLE_UI = REGISTRY.register("outraged_engie_bundle_ui", () -> IForgeMenuType.create(OutragedEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<BiblicallyAccurateEngieBundleUIMenu>> BIBLICALLY_ACCURATE_ENGIE_BUNDLE_UI = REGISTRY.register("biblically_accurate_engie_bundle_ui",
			() -> IForgeMenuType.create(BiblicallyAccurateEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<MonstrosityEngieBundleUIMenu>> MONSTROSITY_ENGIE_BUNDLE_UI = REGISTRY.register("monstrosity_engie_bundle_ui", () -> IForgeMenuType.create(MonstrosityEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<ETCEngieBundleUIMenu>> ETC_ENGIE_BUNDLE_UI = REGISTRY.register("etc_engie_bundle_ui", () -> IForgeMenuType.create(ETCEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<CreativeEngieBundleUIMenu>> CREATIVE_ENGIE_BUNDLE_UI = REGISTRY.register("creative_engie_bundle_ui", () -> IForgeMenuType.create(CreativeEngieBundleUIMenu::new));
}
