
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelboyotired;

public class AlbinoSharkoSleepRenderer extends MobRenderer<AlbinoSharkoSleepEntity, Modelboyotired<AlbinoSharkoSleepEntity>> {
	public AlbinoSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyotired(context.bakeLayer(Modelboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlbinoSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/albinosharkonewtamedzoom.png");
	}
}
