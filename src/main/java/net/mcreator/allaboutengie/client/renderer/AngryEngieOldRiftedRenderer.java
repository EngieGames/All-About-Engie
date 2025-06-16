
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.allaboutengie.entity.AngryEngieOldRiftedEntity;

public class AngryEngieOldRiftedRenderer extends HumanoidMobRenderer<AngryEngieOldRiftedEntity, HumanoidModel<AngryEngieOldRiftedEntity>> {
	public AngryEngieOldRiftedRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(AngryEngieOldRiftedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/a6ff6e18c8a6b660.png");
	}
}
