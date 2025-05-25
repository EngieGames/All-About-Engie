
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.allaboutengie.client.gui.OutragedEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.MonstrosityEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.MetalChestUIScreen;
import net.mcreator.allaboutengie.client.gui.MetalBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.EnragedEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.EngiesOwnEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.ETCEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.CreativeEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.BiblicallyAccurateEngieBundleUIScreen;
import net.mcreator.allaboutengie.client.gui.AngryEngieBundleUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AllaboutengieModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AllaboutengieModMenus.METAL_CHEST_UI.get(), MetalChestUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ENGIE_BUNDLE_UI.get(), MetalBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ANGRY_ENGIE_BUNDLE_UI.get(), AngryEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ENRAGED_ENGIE_BUNDLE_UI.get(), EnragedEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.OUTRAGED_ENGIE_BUNDLE_UI.get(), OutragedEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.BIBLICALLY_ACCURATE_ENGIE_BUNDLE_UI.get(), BiblicallyAccurateEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.MONSTROSITY_ENGIE_BUNDLE_UI.get(), MonstrosityEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ETC_ENGIE_BUNDLE_UI.get(), ETCEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.CREATIVE_ENGIE_BUNDLE_UI.get(), CreativeEngieBundleUIScreen::new);
			MenuScreens.register(AllaboutengieModMenus.ENGIES_OWN_ENGIE_BUNDLE_UI.get(), EngiesOwnEngieBundleUIScreen::new);
		});
	}
}
