
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.Bothan2netLayEntity;
import net.mcreator.allaboutengie.client.model.Modeltobysit;

public class Bothan2netLayRenderer extends MobRenderer<Bothan2netLayEntity, Modeltobysit<Bothan2netLayEntity>> {
	public Bothan2netLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobysit(context.bakeLayer(Modeltobysit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Bothan2netLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bothan2net.png");
	}
}
