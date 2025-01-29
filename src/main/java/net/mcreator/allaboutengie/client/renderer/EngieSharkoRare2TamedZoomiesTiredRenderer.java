
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozoomtired;

public class EngieSharkoRare2TamedZoomiesTiredRenderer extends MobRenderer<EngieSharkoRare2TamedZoomiesTiredEntity, Modelboyozoomtired<EngieSharkoRare2TamedZoomiesTiredEntity>> {
	public EngieSharkoRare2TamedZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozoomtired(context.bakeLayer(Modelboyozoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2TamedZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharko2newtamedtired.png");
	}
}
