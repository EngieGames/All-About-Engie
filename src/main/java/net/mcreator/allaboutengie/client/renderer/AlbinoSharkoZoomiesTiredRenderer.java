
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.AlbinoSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;

public class AlbinoSharkoZoomiesTiredRenderer extends MobRenderer<AlbinoSharkoZoomiesTiredEntity, Modelboyozoomtired<AlbinoSharkoZoomiesTiredEntity>> {
	public AlbinoSharkoZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozoomtired(context.bakeLayer(Modelboyozoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlbinoSharkoZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/albinosharkonewzoomtired.png");
	}
}
