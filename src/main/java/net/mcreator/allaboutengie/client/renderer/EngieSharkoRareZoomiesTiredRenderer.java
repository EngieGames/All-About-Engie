
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRareZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;

public class EngieSharkoRareZoomiesTiredRenderer extends MobRenderer<EngieSharkoRareZoomiesTiredEntity, Modelboyozoomtired<EngieSharkoRareZoomiesTiredEntity>> {
	public EngieSharkoRareZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozoomtired(context.bakeLayer(Modelboyozoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRareZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharkonewtired.png");
	}
}
