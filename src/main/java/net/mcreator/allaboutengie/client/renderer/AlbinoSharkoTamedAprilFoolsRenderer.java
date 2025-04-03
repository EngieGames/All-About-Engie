
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfools;

public class AlbinoSharkoTamedAprilFoolsRenderer extends MobRenderer<AlbinoSharkoTamedAprilFoolsEntity, Modelboyoaprilfools<AlbinoSharkoTamedAprilFoolsEntity>> {
	public AlbinoSharkoTamedAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AlbinoSharkoTamedAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/albinoboyoaprilfirstt.png");
	}
}
