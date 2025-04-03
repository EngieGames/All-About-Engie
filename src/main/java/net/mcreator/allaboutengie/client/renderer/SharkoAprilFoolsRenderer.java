
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.SharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfools;

public class SharkoAprilFoolsRenderer extends MobRenderer<SharkoAprilFoolsEntity, Modelboyoaprilfools<SharkoAprilFoolsEntity>> {
	public SharkoAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SharkoAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/boyoaprilfirst.png");
	}
}
