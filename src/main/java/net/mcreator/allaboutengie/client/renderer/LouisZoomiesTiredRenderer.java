
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.LouisZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modeltobyzoomtired;

public class LouisZoomiesTiredRenderer extends MobRenderer<LouisZoomiesTiredEntity, Modeltobyzoomtired<LouisZoomiesTiredEntity>> {
	public LouisZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobyzoomtired(context.bakeLayer(Modeltobyzoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LouisZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/louistired.png");
	}
}
