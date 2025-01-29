
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.allaboutengie.world.features.ores.UnobtainiumOreFeature;
import net.mcreator.allaboutengie.world.features.ores.EngieOreFeature;
import net.mcreator.allaboutengie.world.features.ores.DeepslateUnobtainiumOreFeature;
import net.mcreator.allaboutengie.world.features.ores.DeepslateEngieOreFeature;
import net.mcreator.allaboutengie.world.features.ores.CyberOreFeature;
import net.mcreator.allaboutengie.world.features.ores.BloodOreFeature;
import net.mcreator.allaboutengie.world.features.SharkoHouseFeature;
import net.mcreator.allaboutengie.world.features.NothingFeature;
import net.mcreator.allaboutengie.world.features.Nothing4Feature;
import net.mcreator.allaboutengie.world.features.Nothing3Feature;
import net.mcreator.allaboutengie.world.features.Nothing2Feature;
import net.mcreator.allaboutengie.world.features.ItemHouseXXLFeature;
import net.mcreator.allaboutengie.world.features.ItemHouseFeature;
import net.mcreator.allaboutengie.world.features.CyberHouseFeature;
import net.mcreator.allaboutengie.AllaboutengieMod;

@Mod.EventBusSubscriber
public class AllaboutengieModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AllaboutengieMod.MODID);
	public static final RegistryObject<Feature<?>> CYBER_ORE = REGISTRY.register("cyber_ore", CyberOreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSLATE_ENGIE_ORE = REGISTRY.register("deepslate_engie_ore", DeepslateEngieOreFeature::feature);
	public static final RegistryObject<Feature<?>> BLOOD_ORE = REGISTRY.register("blood_ore", BloodOreFeature::feature);
	public static final RegistryObject<Feature<?>> ENGIE_ORE = REGISTRY.register("engie_ore", EngieOreFeature::feature);
	public static final RegistryObject<Feature<?>> UNOBTAINIUM_ORE = REGISTRY.register("unobtainium_ore", UnobtainiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSLATE_UNOBTAINIUM_ORE = REGISTRY.register("deepslate_unobtainium_ore", DeepslateUnobtainiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> NOTHING = REGISTRY.register("nothing", NothingFeature::feature);
	public static final RegistryObject<Feature<?>> ITEM_HOUSE = REGISTRY.register("item_house", ItemHouseFeature::feature);
	public static final RegistryObject<Feature<?>> NOTHING_2 = REGISTRY.register("nothing_2", Nothing2Feature::feature);
	public static final RegistryObject<Feature<?>> SHARKO_HOUSE = REGISTRY.register("sharko_house", SharkoHouseFeature::feature);
	public static final RegistryObject<Feature<?>> NOTHING_3 = REGISTRY.register("nothing_3", Nothing3Feature::feature);
	public static final RegistryObject<Feature<?>> CYBER_HOUSE = REGISTRY.register("cyber_house", CyberHouseFeature::feature);
	public static final RegistryObject<Feature<?>> NOTHING_4 = REGISTRY.register("nothing_4", Nothing4Feature::feature);
	public static final RegistryObject<Feature<?>> ITEM_HOUSE_XXL = REGISTRY.register("item_house_xxl", ItemHouseXXLFeature::feature);
}
