
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.allaboutengie.entity.EngieGamesDetectiveEntity;

public class EngieGamesDetectiveRenderer extends HumanoidMobRenderer<EngieGamesDetectiveEntity, HumanoidModel<EngieGamesDetectiveEntity>> {
	public EngieGamesDetectiveRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<EngieGamesDetectiveEntity, HumanoidModel<EngieGamesDetectiveEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/engiegamesentity_e.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EngieGamesDetectiveEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiegamesentity.png");
	}
}
