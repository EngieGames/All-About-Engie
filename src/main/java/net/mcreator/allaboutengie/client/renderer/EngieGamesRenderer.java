
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieGamesEntity;
import net.mcreator.allaboutengie.client.model.ModelEngieGames;

public class EngieGamesRenderer extends MobRenderer<EngieGamesEntity, ModelEngieGames<EngieGamesEntity>> {
	public EngieGamesRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieGamesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiegamesentity.png");
	}
}
