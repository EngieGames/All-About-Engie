
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieGamesDetectiveEntity;
import net.mcreator.allaboutengie.client.model.ModelEngieGames;

public class EngieGamesDetectiveRenderer extends MobRenderer<EngieGamesDetectiveEntity, ModelEngieGames<EngieGamesDetectiveEntity>> {
	public EngieGamesDetectiveRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieGamesDetectiveEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiegamesentity.png");
	}
}
