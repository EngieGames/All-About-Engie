
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.ExoticSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelboyosit;

public class ExoticSharkoLayRenderer extends MobRenderer<ExoticSharkoLayEntity, Modelboyosit<ExoticSharkoLayEntity>> {
	public ExoticSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ExoticSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/boyoext.png");
	}
}
