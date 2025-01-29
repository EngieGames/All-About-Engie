
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozooms;

public class EngieSharkoRare2ZoomiesRenderer extends MobRenderer<EngieSharkoRare2ZoomiesEntity, Modelboyozooms<EngieSharkoRare2ZoomiesEntity>> {
	public EngieSharkoRare2ZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozooms(context.bakeLayer(Modelboyozooms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2ZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharko2newzoom.png");
	}
}
