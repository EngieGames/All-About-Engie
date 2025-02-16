
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.BiblicallyAccurateEngieEntity;
import net.mcreator.allaboutengie.client.model.ModelBiblicallyAccurateEngie;

public class BiblicallyAccurateEngieRenderer extends MobRenderer<BiblicallyAccurateEngieEntity, ModelBiblicallyAccurateEngie<BiblicallyAccurateEngieEntity>> {
	public BiblicallyAccurateEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBiblicallyAccurateEngie(context.bakeLayer(ModelBiblicallyAccurateEngie.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<BiblicallyAccurateEngieEntity, ModelBiblicallyAccurateEngie<BiblicallyAccurateEngieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/biblicallyaccurateengie_g.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BiblicallyAccurateEngieEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/biblicallyaccurateengie.png");
	}
}
