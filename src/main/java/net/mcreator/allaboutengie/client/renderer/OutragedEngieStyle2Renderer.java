
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.OutragedEngieStyle2Entity;
import net.mcreator.allaboutengie.client.model.Modeloutraged_new;

public class OutragedEngieStyle2Renderer extends MobRenderer<OutragedEngieStyle2Entity, Modeloutraged_new<OutragedEngieStyle2Entity>> {
	public OutragedEngieStyle2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeloutraged_new(context.bakeLayer(Modeloutraged_new.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<OutragedEngieStyle2Entity, Modeloutraged_new<OutragedEngieStyle2Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/outragednew_g.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(OutragedEngieStyle2Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/outragednew2.png");
	}
}
