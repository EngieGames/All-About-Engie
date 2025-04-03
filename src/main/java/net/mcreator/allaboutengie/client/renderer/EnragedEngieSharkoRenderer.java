
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.EnragedEngieSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoother;

public class EnragedEngieSharkoRenderer extends MobRenderer<EnragedEngieSharkoEntity, Modelboyoother<EnragedEngieSharkoEntity>> {
	public EnragedEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoother(context.bakeLayer(Modelboyoother.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<EnragedEngieSharkoEntity, Modelboyoother<EnragedEngieSharkoEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/enragedengieboyo.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedEngieSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedengieboyo.png");
	}
}
