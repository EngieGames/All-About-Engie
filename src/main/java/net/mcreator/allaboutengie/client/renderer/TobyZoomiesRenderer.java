
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.TobyZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modeltobyzooms;

public class TobyZoomiesRenderer extends MobRenderer<TobyZoomiesEntity, Modeltobyzooms<TobyZoomiesEntity>> {
	public TobyZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobyzooms(context.bakeLayer(Modeltobyzooms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TobyZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/toby.png");
	}
}
