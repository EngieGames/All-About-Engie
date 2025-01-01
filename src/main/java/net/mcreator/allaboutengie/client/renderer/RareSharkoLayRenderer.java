
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.RareSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelboyosit;

public class RareSharkoLayRenderer extends MobRenderer<RareSharkoLayEntity, Modelboyosit<RareSharkoLayEntity>> {
	public RareSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/raresharkonewtamed.png");
	}
}
