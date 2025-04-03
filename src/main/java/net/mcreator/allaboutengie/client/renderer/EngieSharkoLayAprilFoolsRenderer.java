
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfoolssit;

public class EngieSharkoLayAprilFoolsRenderer extends MobRenderer<EngieSharkoLayAprilFoolsEntity, Modelboyoaprilfoolssit<EngieSharkoLayAprilFoolsEntity>> {
	public EngieSharkoLayAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssit(context.bakeLayer(Modelboyoaprilfoolssit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoLayAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyoaprilfirstt.png");
	}
}
