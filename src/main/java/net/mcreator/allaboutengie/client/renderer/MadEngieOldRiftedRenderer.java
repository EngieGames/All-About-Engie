
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.allaboutengie.entity.MadEngieOldRiftedEntity;

public class MadEngieOldRiftedRenderer extends HumanoidMobRenderer<MadEngieOldRiftedEntity, HumanoidModel<MadEngieOldRiftedEntity>> {
	public MadEngieOldRiftedRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(MadEngieOldRiftedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/madengieoldrifted.png");
	}
}
