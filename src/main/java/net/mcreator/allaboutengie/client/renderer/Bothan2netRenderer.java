
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.Bothan2netEntity;
import net.mcreator.allaboutengie.client.model.Modeltoby;

public class Bothan2netRenderer extends MobRenderer<Bothan2netEntity, Modeltoby<Bothan2netEntity>> {
	public Bothan2netRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoby(context.bakeLayer(Modeltoby.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Bothan2netEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bothan2net.png");
	}
}
