
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.Bothan2netZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modeltobyzooms;

public class Bothan2netZoomiesRenderer extends MobRenderer<Bothan2netZoomiesEntity, Modeltobyzooms<Bothan2netZoomiesEntity>> {
	public Bothan2netZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobyzooms(context.bakeLayer(Modeltobyzooms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Bothan2netZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bothan2netzoom.png");
	}
}
