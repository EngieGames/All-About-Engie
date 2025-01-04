
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.TobyLayEntity;
import net.mcreator.allaboutengie.client.model.Modelboyosit;

public class TobyLayRenderer extends MobRenderer<TobyLayEntity, Modelboyosit<TobyLayEntity>> {
	public TobyLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TobyLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharko2newtamed.png");
	}
}
