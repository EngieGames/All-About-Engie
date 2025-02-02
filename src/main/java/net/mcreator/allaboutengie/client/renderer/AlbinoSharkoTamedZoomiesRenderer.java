
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozooms;

public class AlbinoSharkoTamedZoomiesRenderer extends MobRenderer<AlbinoSharkoTamedZoomiesEntity, Modelboyozooms<AlbinoSharkoTamedZoomiesEntity>> {
	public AlbinoSharkoTamedZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozooms(context.bakeLayer(Modelboyozooms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlbinoSharkoTamedZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/albinosharkonewtamedzoom.png");
	}
}
