
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.client.model.Modelboyosit;

public class EngieSharkoRare2LayRenderer extends MobRenderer<EngieSharkoRare2LayEntity, Modelboyosit<EngieSharkoRare2LayEntity>> {
	public EngieSharkoRare2LayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyosit(context.bakeLayer(Modelboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2LayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharko2newtamed.png");
	}
}
