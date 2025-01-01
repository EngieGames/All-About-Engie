
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.allaboutengie.client.model.Modeloutraged_new;
import net.mcreator.allaboutengie.client.model.Modeloldboyo;
import net.mcreator.allaboutengie.client.model.Modelenraged_new;
import net.mcreator.allaboutengie.client.model.Modelenraged_boom;
import net.mcreator.allaboutengie.client.model.Modelboyosit;
import net.mcreator.allaboutengie.client.model.Modelboyo;
import net.mcreator.allaboutengie.client.model.Modelangry_new;
import net.mcreator.allaboutengie.client.model.ModelMadEngie;
import net.mcreator.allaboutengie.client.model.ModelEngieGames;
import net.mcreator.allaboutengie.client.model.ModelEngie;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AllaboutengieModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelEngieGames.LAYER_LOCATION, ModelEngieGames::createBodyLayer);
		event.registerLayerDefinition(Modelenraged_boom.LAYER_LOCATION, Modelenraged_boom::createBodyLayer);
		event.registerLayerDefinition(Modelangry_new.LAYER_LOCATION, Modelangry_new::createBodyLayer);
		event.registerLayerDefinition(Modelboyo.LAYER_LOCATION, Modelboyo::createBodyLayer);
		event.registerLayerDefinition(Modelboyosit.LAYER_LOCATION, Modelboyosit::createBodyLayer);
		event.registerLayerDefinition(ModelMadEngie.LAYER_LOCATION, ModelMadEngie::createBodyLayer);
		event.registerLayerDefinition(Modeloldboyo.LAYER_LOCATION, Modeloldboyo::createBodyLayer);
		event.registerLayerDefinition(ModelEngie.LAYER_LOCATION, ModelEngie::createBodyLayer);
		event.registerLayerDefinition(Modeloutraged_new.LAYER_LOCATION, Modeloutraged_new::createBodyLayer);
		event.registerLayerDefinition(Modelenraged_new.LAYER_LOCATION, Modelenraged_new::createBodyLayer);
	}
}
