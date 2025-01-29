
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;

public class AlbinoSharkoTamedZoomiesTiredRenderer extends MobRenderer<AlbinoSharkoTamedZoomiesTiredEntity, Modelboyozoomtired<AlbinoSharkoTamedZoomiesTiredEntity>> {
	public AlbinoSharkoTamedZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozoomtired(context.bakeLayer(Modelboyozoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlbinoSharkoTamedZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/albinosharkonewtamedtired.png");
	}
}
