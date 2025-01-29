
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modelboyozooms;

public class EngieSharkoRare2TamedZoomiesRenderer extends MobRenderer<EngieSharkoRare2TamedZoomiesEntity, Modelboyozooms<EngieSharkoRare2TamedZoomiesEntity>> {
	public EngieSharkoRare2TamedZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyozooms(context.bakeLayer(Modelboyozooms.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2TamedZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharko2newtamedzoom.png");
	}
}
