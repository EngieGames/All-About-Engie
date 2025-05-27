
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
	public static final RegistryObject<SoundEvent> DOOMSDAY_EERIE_2 = REGISTRY.register("doomsday_eerie_2", () -> new SoundEvent(new ResourceLocation("allaboutengie", "doomsday_eerie_2")));
}
