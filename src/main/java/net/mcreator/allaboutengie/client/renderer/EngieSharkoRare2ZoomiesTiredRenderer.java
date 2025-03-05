
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;

public class EngieSharkoRare2ZoomiesTiredRenderer extends MobRenderer<EngieSharkoRare2ZoomiesTiredEntity, Modelboyozoomtired<EngieSharkoRare2ZoomiesTiredEntity>> {
	public EngieSharkoRare2ZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozoomtired(context.bakeLayer(Modelboyozoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2ZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharko2newzoomtired.png");
	}
}
