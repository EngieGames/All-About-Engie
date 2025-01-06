
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllaboutengieModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(16, 16).setRegistryName("developer_engie"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("idea_giver_blood"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("tiger_shark"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("tiger_shark_cat_onsie"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("aae_items_logo"));
		event.getRegistry().register(new Motive(16, 16).setRegistryName("ech"));
	}
}
