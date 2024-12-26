
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.client.model.Modelangry_new;

public class AngryEngieRenderer extends MobRenderer<AngryEngieEntity, Modelangry_new<AngryEngieEntity>> {
	public AngryEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangry_new(context.bakeLayer(Modelangry_new.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<AngryEngieEntity, Modelangry_new<AngryEngieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/angrynew_g.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(AngryEngieEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/angrynew.png");
	}
}
