
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.MonstrosityEngieSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoother;

public class MonstrosityEngieSharkoRenderer extends MobRenderer<MonstrosityEngieSharkoEntity, Modelboyoother<MonstrosityEngieSharkoEntity>> {
	public MonstrosityEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoother(context.bakeLayer(Modelboyoother.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MonstrosityEngieSharkoEntity, Modelboyoother<MonstrosityEngieSharkoEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/monstrosityboyo.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MonstrosityEngieSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/monstrosityboyo.png");
	}
}
