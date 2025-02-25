
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.CBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyotired;

public class CBEZoomiesTiredRenderer extends MobRenderer<CBEZoomiesTiredEntity, Modelengiedaboyotired<CBEZoomiesTiredEntity>> {
	public CBEZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengiedaboyotired(context.bakeLayer(Modelengiedaboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CBEZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharkozoomtired.png");
	}
}
