
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.ExoticSharkoZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozooms;

public class ExoticSharkoZoomiesRenderer extends MobRenderer<ExoticSharkoZoomiesEntity, Modelboyozooms<ExoticSharkoZoomiesEntity>> {
	public ExoticSharkoZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozooms(context.bakeLayer(Modelboyozooms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ExoticSharkoZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/exoticsharkonewzoom.png");
	}
}
