
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.allaboutengie.client.model.Modeltobyzoomtired;
import net.mcreator.allaboutengie.client.model.Modeltobyzooms;
import net.mcreator.allaboutengie.client.model.Modeltobytired;
import net.mcreator.allaboutengie.client.model.Modeltobysit;
import net.mcreator.allaboutengie.client.model.Modeltoby;
import net.mcreator.allaboutengie.client.model.Modeloutraged_new;
import net.mcreator.allaboutengie.client.model.Modeloldboyo;
import net.mcreator.allaboutengie.client.model.Modelmonstrosity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;
import net.mcreator.allaboutengie.client.model.Modelenraged_new;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyozoom;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyotired;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyosit;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyo;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;
import net.mcreator.allaboutengie.client.model.Modelboyozooms;
import net.mcreator.allaboutengie.client.model.Modelboyotired;
import net.mcreator.allaboutengie.client.model.Modelboyosit;
import net.mcreator.allaboutengie.client.model.Modelboyo;
import net.mcreator.allaboutengie.client.model.Modelangry_new;
import net.mcreator.allaboutengie.client.model.ModelMadEngie;
import net.mcreator.allaboutengie.client.model.ModelEngieGames;
import net.mcreator.allaboutengie.client.model.ModelEngie;
import net.mcreator.allaboutengie.client.model.ModelBiblicallyAccurateEngie;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AllaboutengieModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelEngieGames.LAYER_LOCATION, ModelEngieGames::createBodyLayer);
		event.registerLayerDefinition(Modeltobysit.LAYER_LOCATION, Modeltobysit::createBodyLayer);
		event.registerLayerDefinition(Modelboyozoomtired.LAYER_LOCATION, Modelboyozoomtired::createBodyLayer);
		event.registerLayerDefinition(Modelangry_new.LAYER_LOCATION, Modelangry_new::createBodyLayer);
		event.registerLayerDefinition(Modelboyo.LAYER_LOCATION, Modelboyo::createBodyLayer);
		event.registerLayerDefinition(Modelboyosit.LAYER_LOCATION, Modelboyosit::createBodyLayer);
		event.registerLayerDefinition(Modelengiedaboyozoom.LAYER_LOCATION, Modelengiedaboyozoom::createBodyLayer);
		event.registerLayerDefinition(ModelMadEngie.LAYER_LOCATION, ModelMadEngie::createBodyLayer);
		event.registerLayerDefinition(Modelmonstrosity.LAYER_LOCATION, Modelmonstrosity::createBodyLayer);
		event.registerLayerDefinition(Modelenragedzombie.LAYER_LOCATION, Modelenragedzombie::createBodyLayer);
		event.registerLayerDefinition(Modeltobyzoomtired.LAYER_LOCATION, Modeltobyzoomtired::createBodyLayer);
		event.registerLayerDefinition(Modeloldboyo.LAYER_LOCATION, Modeloldboyo::createBodyLayer);
		event.registerLayerDefinition(Modelengiedaboyo.LAYER_LOCATION, Modelengiedaboyo::createBodyLayer);
		event.registerLayerDefinition(Modeltobyzooms.LAYER_LOCATION, Modeltobyzooms::createBodyLayer);
		event.registerLayerDefinition(Modelboyozooms.LAYER_LOCATION, Modelboyozooms::createBodyLayer);
		event.registerLayerDefinition(Modeltoby.LAYER_LOCATION, Modeltoby::createBodyLayer);
		event.registerLayerDefinition(ModelEngie.LAYER_LOCATION, ModelEngie::createBodyLayer);
		event.registerLayerDefinition(Modeltobytired.LAYER_LOCATION, Modeltobytired::createBodyLayer);
		event.registerLayerDefinition(Modelboyotired.LAYER_LOCATION, Modelboyotired::createBodyLayer);
		event.registerLayerDefinition(Modeloutraged_new.LAYER_LOCATION, Modeloutraged_new::createBodyLayer);
		event.registerLayerDefinition(Modelengiedaboyotired.LAYER_LOCATION, Modelengiedaboyotired::createBodyLayer);
		event.registerLayerDefinition(Modelenraged_new.LAYER_LOCATION, Modelenraged_new::createBodyLayer);
		event.registerLayerDefinition(Modelengiedaboyosit.LAYER_LOCATION, Modelengiedaboyosit::createBodyLayer);
		event.registerLayerDefinition(ModelBiblicallyAccurateEngie.LAYER_LOCATION, ModelBiblicallyAccurateEngie::createBodyLayer);
	}
}
