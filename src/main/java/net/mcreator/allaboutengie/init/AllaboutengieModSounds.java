
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.allaboutengie.AllaboutengieMod;

public class AllaboutengieModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AllaboutengieMod.MODID);
	public static final RegistryObject<SoundEvent> BYEBYETHERE = REGISTRY.register("byebyethere", () -> new SoundEvent(new ResourceLocation("allaboutengie", "byebyethere")));
	public static final RegistryObject<SoundEvent> DOOMSDAY_EERIE = REGISTRY.register("doomsday_eerie", () -> new SoundEvent(new ResourceLocation("allaboutengie", "doomsday_eerie")));
	public static final RegistryObject<SoundEvent> DOOMSDAY_START = REGISTRY.register("doomsday_start", () -> new SoundEvent(new ResourceLocation("allaboutengie", "doomsday_start")));
	public static final RegistryObject<SoundEvent> HOTLINEMIAMI2_RUN = REGISTRY.register("hotlinemiami2-run", () -> new SoundEvent(new ResourceLocation("allaboutengie", "hotlinemiami2-run")));
	public static final RegistryObject<SoundEvent> THEEND_EERIE = REGISTRY.register("theend_eerie", () -> new SoundEvent(new ResourceLocation("allaboutengie", "theend_eerie")));
	public static final RegistryObject<SoundEvent> CUSTOMLIGHTNING = REGISTRY.register("customlightning", () -> new SoundEvent(new ResourceLocation("allaboutengie", "customlightning")));
	public static final RegistryObject<SoundEvent> CUSTOMLIGHTNING2 = REGISTRY.register("customlightning2", () -> new SoundEvent(new ResourceLocation("allaboutengie", "customlightning2")));
	public static final RegistryObject<SoundEvent> RIFTOPENS = REGISTRY.register("riftopens", () -> new SoundEvent(new ResourceLocation("allaboutengie", "riftopens")));
}
