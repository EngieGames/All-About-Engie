
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.ApolloLayEntity;
import net.mcreator.allaboutengie.client.model.Modeltobysit;

public class ApolloLayRenderer extends MobRenderer<ApolloLayEntity, Modeltobysit<ApolloLayEntity>> {
	public ApolloLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobysit(context.bakeLayer(Modeltobysit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ApolloLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/apollo.png");
	}
}
