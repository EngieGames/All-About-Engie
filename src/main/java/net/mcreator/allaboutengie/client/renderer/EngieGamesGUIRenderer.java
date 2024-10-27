
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieGamesGUIEntity;
import net.mcreator.allaboutengie.client.model.ModelEngieGames;

public class EngieGamesGUIRenderer extends MobRenderer<EngieGamesGUIEntity, ModelEngieGames<EngieGamesGUIEntity>> {
	public EngieGamesGUIRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieGamesGUIEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiegames.png");
	}
}
