
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.EnragedEngieStyle2Entity;
import net.mcreator.allaboutengie.client.model.Modelenraged_new;

public class EnragedEngieStyle2Renderer extends MobRenderer<EnragedEngieStyle2Entity, Modelenraged_new<EnragedEngieStyle2Entity>> {
	public EnragedEngieStyle2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenraged_new(context.bakeLayer(Modelenraged_new.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<EnragedEngieStyle2Entity, Modelenraged_new<EnragedEngieStyle2Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/enragednewstyle3_g.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedEngieStyle2Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednewstyle2.png");
	}
}
