
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.SharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;

public class SharkoZoomiesTiredRenderer extends MobRenderer<SharkoZoomiesTiredEntity, Modelboyozoomtired<SharkoZoomiesTiredEntity>> {
	public SharkoZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozoomtired(context.bakeLayer(Modelboyozoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SharkoZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/sharkonewtired.png");
	}
}
