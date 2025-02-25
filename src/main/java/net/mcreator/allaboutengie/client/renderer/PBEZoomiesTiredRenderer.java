
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.PBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyotired;

public class PBEZoomiesTiredRenderer extends MobRenderer<PBEZoomiesTiredEntity, Modelengiedaboyotired<PBEZoomiesTiredEntity>> {
	public PBEZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengiedaboyotired(context.bakeLayer(Modelengiedaboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PBEZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharko2zoomtired.png");
	}
}
