
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.LouisZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modeltoby;

public class LouisZoomiesRenderer extends MobRenderer<LouisZoomiesEntity, Modeltoby<LouisZoomiesEntity>> {
	public LouisZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoby(context.bakeLayer(Modeltoby.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LouisZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/louis.png");
	}
}
