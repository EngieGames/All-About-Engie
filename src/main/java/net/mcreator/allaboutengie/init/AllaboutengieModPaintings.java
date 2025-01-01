
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.allaboutengie.AllaboutengieMod;

public class AllaboutengieModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, AllaboutengieMod.MODID);
	public static final RegistryObject<PaintingVariant> DEVELOPER_ENGIE = REGISTRY.register("developer_engie", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> IDEA_GIVER_BLOOD = REGISTRY.register("idea_giver_blood", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> TIGER_SHARK = REGISTRY.register("tiger_shark", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> TIGER_SHARK_CAT_ONSIE = REGISTRY.register("tiger_shark_cat_onsie", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> AAE_ITEMS_LOGO = REGISTRY.register("aae_items_logo", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> ECH = REGISTRY.register("ech", () -> new PaintingVariant(16, 16));
}
