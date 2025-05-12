
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class BigEngieSharkoRare2LayRenderer extends MobRenderer<BigEngieSharkoRare2LayEntity, Modelbigboyosit<BigEngieSharkoRare2LayEntity>> {
	public BigEngieSharkoRare2LayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyosit(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoRare2LayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigrareengiesharko2newtamed.png");
	}
}
