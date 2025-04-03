
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRareLayAprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfoolssit;

public class EngieSharkoRareLayAprilFoolsRenderer extends MobRenderer<EngieSharkoRareLayAprilFoolsEntity, Modelboyoaprilfoolssit<EngieSharkoRareLayAprilFoolsEntity>> {
	public EngieSharkoRareLayAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssit(context.bakeLayer(Modelboyoaprilfoolssit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRareLayAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyorare1aprilfirstt.png");
	}
}
