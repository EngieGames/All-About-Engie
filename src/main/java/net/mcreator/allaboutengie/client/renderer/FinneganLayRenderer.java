
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.FinneganLayEntity;
import net.mcreator.allaboutengie.client.model.Modelboyosit;

public class FinneganLayRenderer extends MobRenderer<FinneganLayEntity, Modelboyosit<FinneganLayEntity>> {
	public FinneganLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FinneganLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharkonewtamedfox.png");
	}
}
