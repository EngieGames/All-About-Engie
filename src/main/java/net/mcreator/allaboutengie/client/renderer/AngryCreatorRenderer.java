
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.AngryCreatorEntity;
import net.mcreator.allaboutengie.client.model.Modeloutraged_new;

public class AngryCreatorRenderer extends MobRenderer<AngryCreatorEntity, Modeloutraged_new<AngryCreatorEntity>> {
	public AngryCreatorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeloutraged_new(context.bakeLayer(Modeloutraged_new.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<AngryCreatorEntity, Modeloutraged_new<AngryCreatorEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/outragednew_g.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AngryCreatorEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/outragednew.png");
	}
}
