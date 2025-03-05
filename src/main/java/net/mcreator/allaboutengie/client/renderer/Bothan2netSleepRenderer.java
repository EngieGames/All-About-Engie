
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.Bothan2netSleepEntity;
import net.mcreator.allaboutengie.client.model.Modeltobytired;

public class Bothan2netSleepRenderer extends MobRenderer<Bothan2netSleepEntity, Modeltobytired<Bothan2netSleepEntity>> {
	public Bothan2netSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobytired(context.bakeLayer(Modeltobytired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Bothan2netSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bothan2nettired.png");
	}
}
