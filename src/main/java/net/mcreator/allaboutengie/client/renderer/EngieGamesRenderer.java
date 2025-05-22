
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.EngieGamesEntity;
import net.mcreator.allaboutengie.client.model.ModelEngieGames;

public class EngieGamesRenderer extends MobRenderer<EngieGamesEntity, ModelEngieGames<EngieGamesEntity>> {
	public EngieGamesRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<EngieGamesEntity, ModelEngieGames<EngieGamesEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/engiegamesentity_e.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EngieGamesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiegamesentity.png");
	}
}
