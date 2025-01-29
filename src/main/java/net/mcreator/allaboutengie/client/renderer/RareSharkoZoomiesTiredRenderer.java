
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.RareSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;

public class RareSharkoZoomiesTiredRenderer extends MobRenderer<RareSharkoZoomiesTiredEntity, Modelboyozoomtired<RareSharkoZoomiesTiredEntity>> {
	public RareSharkoZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozoomtired(context.bakeLayer(Modelboyozoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareSharkoZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/raresharkonewtired.png");
	}
}
