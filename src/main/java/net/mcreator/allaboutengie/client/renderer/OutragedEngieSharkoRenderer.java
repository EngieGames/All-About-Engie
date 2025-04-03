
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.OutragedEngieSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoother;

public class OutragedEngieSharkoRenderer extends MobRenderer<OutragedEngieSharkoEntity, Modelboyoother<OutragedEngieSharkoEntity>> {
	public OutragedEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoother(context.bakeLayer(Modelboyoother.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<OutragedEngieSharkoEntity, Modelboyoother<OutragedEngieSharkoEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/outragedengieboyo.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(OutragedEngieSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/outragedengieboyo.png");
	}
}
