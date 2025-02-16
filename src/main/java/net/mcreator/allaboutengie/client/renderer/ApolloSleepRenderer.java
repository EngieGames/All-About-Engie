
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.ApolloSleepEntity;
import net.mcreator.allaboutengie.client.model.Modeltobytired;

public class ApolloSleepRenderer extends MobRenderer<ApolloSleepEntity, Modeltobytired<ApolloSleepEntity>> {
	public ApolloSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobytired(context.bakeLayer(Modeltobytired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ApolloSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/apollotired.png");
	}
}
