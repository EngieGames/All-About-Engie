
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.MonstrosityEngieEntity;
import net.mcreator.allaboutengie.client.model.Modelmonstrosity;

public class MonstrosityEngieRenderer extends MobRenderer<MonstrosityEngieEntity, Modelmonstrosity<MonstrosityEngieEntity>> {
	public MonstrosityEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmonstrosity(context.bakeLayer(Modelmonstrosity.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<MonstrosityEngieEntity, Modelmonstrosity<MonstrosityEngieEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/itescaped_g.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(MonstrosityEngieEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/itescaped.png");
	}
}
