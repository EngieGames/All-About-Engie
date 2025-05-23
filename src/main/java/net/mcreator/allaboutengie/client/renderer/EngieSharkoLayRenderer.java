
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelboyosit;

public class EngieSharkoLayRenderer extends MobRenderer<EngieSharkoLayEntity, Modelboyosit<EngieSharkoLayEntity>> {
	public EngieSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiesharkonewtamed.png");
	}
}
