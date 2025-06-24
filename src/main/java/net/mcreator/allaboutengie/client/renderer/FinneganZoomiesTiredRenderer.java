
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.FinneganZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;

public class FinneganZoomiesTiredRenderer extends MobRenderer<FinneganZoomiesTiredEntity, Modelboyozoomtired<FinneganZoomiesTiredEntity>> {
	public FinneganZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozoomtired(context.bakeLayer(Modelboyozoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FinneganZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharkonewtamedfoxzoomtired.png");
	}
}
