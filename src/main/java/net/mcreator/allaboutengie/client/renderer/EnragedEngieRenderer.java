
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.allaboutengie.entity.EnragedEngieEntity;

public class EnragedEngieRenderer extends HumanoidMobRenderer<EnragedEngieEntity, HumanoidModel<EnragedEngieEntity>> {
	public EnragedEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<EnragedEngieEntity, HumanoidModel<EnragedEngieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/enragednew_g.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedEngieEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednew.png");
	}
}
