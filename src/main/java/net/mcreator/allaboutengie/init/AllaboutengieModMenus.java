
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.allaboutengie.world.inventory.TrueBanHammerTogglesMenu;
import net.mcreator.allaboutengie.world.inventory.TheEndTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.SuperDoomsDayTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.OutragedEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.MonstrosityEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.MetalChestUIMenu;
import net.mcreator.allaboutengie.world.inventory.MetalBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.EnragedEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.EngiesOwnEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.EngiesBirthdayBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.EngieTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.ETCEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.DoomsDayTradeUIMenu;
import net.mcreator.allaboutengie.world.inventory.CreativeEngieBundleUIMenu;
import net.mcreator.allaboutengie.world.inventory.BirthdayBundleForYoungestUIMenu;
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
	public static final RegistryObject<MenuType<EngiesOwnEngieBundleUIMenu>> ENGIES_OWN_ENGIE_BUNDLE_UI = REGISTRY.register("engies_own_engie_bundle_ui", () -> IForgeMenuType.create(EngiesOwnEngieBundleUIMenu::new));
	public static final RegistryObject<MenuType<EngiesBirthdayBundleUIMenu>> ENGIES_BIRTHDAY_BUNDLE_UI = REGISTRY.register("engies_birthday_bundle_ui", () -> IForgeMenuType.create(EngiesBirthdayBundleUIMenu::new));
	public static final RegistryObject<MenuType<DoomsDayTradeUIMenu>> DOOMS_DAY_TRADE_UI = REGISTRY.register("dooms_day_trade_ui", () -> IForgeMenuType.create(DoomsDayTradeUIMenu::new));
	public static final RegistryObject<MenuType<SuperDoomsDayTradeUIMenu>> SUPER_DOOMS_DAY_TRADE_UI = REGISTRY.register("super_dooms_day_trade_ui", () -> IForgeMenuType.create(SuperDoomsDayTradeUIMenu::new));
	public static final RegistryObject<MenuType<TheEndTradeUIMenu>> THE_END_TRADE_UI = REGISTRY.register("the_end_trade_ui", () -> IForgeMenuType.create(TheEndTradeUIMenu::new));
	public static final RegistryObject<MenuType<EngieTradeUIMenu>> ENGIE_TRADE_UI = REGISTRY.register("engie_trade_ui", () -> IForgeMenuType.create(EngieTradeUIMenu::new));
	public static final RegistryObject<MenuType<BirthdayBundleForYoungestUIMenu>> BIRTHDAY_BUNDLE_FOR_YOUNGEST_UI = REGISTRY.register("birthday_bundle_for_youngest_ui", () -> IForgeMenuType.create(BirthdayBundleForYoungestUIMenu::new));
	public static final RegistryObject<MenuType<TrueBanHammerTogglesMenu>> TRUE_BAN_HAMMER_TOGGLES = REGISTRY.register("true_ban_hammer_toggles", () -> IForgeMenuType.create(TrueBanHammerTogglesMenu::new));
}
