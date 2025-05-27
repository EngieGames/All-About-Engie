
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.PureInsanityEntity;
import net.mcreator.allaboutengie.client.model.ModelEngieGames;

public class PureInsanityRenderer extends MobRenderer<PureInsanityEntity, ModelEngieGames<PureInsanityEntity>> {
	public PureInsanityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEngieGames(context.bakeLayer(ModelEngieGames.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<PureInsanityEntity, ModelEngieGames<PureInsanityEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/pureinsanity_e.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PureInsanityEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/pureinsanity.png");
	}
}
