
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.LegendarySharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfools;

public class LegendarySharkoTamedAprilFoolsRenderer extends MobRenderer<LegendarySharkoTamedAprilFoolsEntity, Modelboyoaprilfools<LegendarySharkoTamedAprilFoolsEntity>> {
	public LegendarySharkoTamedAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LegendarySharkoTamedAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/legendaryboyoaprilfirstt.png");
	}
}
