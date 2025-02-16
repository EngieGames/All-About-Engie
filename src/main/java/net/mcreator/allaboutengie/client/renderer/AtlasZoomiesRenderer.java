
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.AtlasZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modeltobyzooms;

public class AtlasZoomiesRenderer extends MobRenderer<AtlasZoomiesEntity, Modeltobyzooms<AtlasZoomiesEntity>> {
	public AtlasZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobyzooms(context.bakeLayer(Modeltobyzooms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AtlasZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/atlaszoom.png");
	}
}
