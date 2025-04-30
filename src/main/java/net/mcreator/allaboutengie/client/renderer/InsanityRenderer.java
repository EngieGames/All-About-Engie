
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.InsanityEntity;
import net.mcreator.allaboutengie.client.model.ModelEngieGames;

public class InsanityRenderer extends MobRenderer<InsanityEntity, ModelEngieGames<InsanityEntity>> {
	public InsanityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InsanityEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/insanity.png");
	}
}
