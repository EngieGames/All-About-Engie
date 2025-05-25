
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.EnragedEngieStyle3Entity;
import net.mcreator.allaboutengie.client.model.Modelenraged_new;

public class EnragedEngieStyle3Renderer extends MobRenderer<EnragedEngieStyle3Entity, Modelenraged_new<EnragedEngieStyle3Entity>> {
	public EnragedEngieStyle3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenraged_new(context.bakeLayer(Modelenraged_new.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<EnragedEngieStyle3Entity, Modelenraged_new<EnragedEngieStyle3Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/enragednew_g.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedEngieStyle3Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednew3.png");
	}
}
