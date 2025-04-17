
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.allaboutengie.entity.HeWhoGamesHostileEntity;
import net.mcreator.allaboutengie.client.model.ModelHeWhoGames;

public class HeWhoGamesHostileRenderer extends MobRenderer<HeWhoGamesHostileEntity, ModelHeWhoGames<HeWhoGamesHostileEntity>> {
	public HeWhoGamesHostileRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHeWhoGames(context.bakeLayer(ModelHeWhoGames.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<HeWhoGamesHostileEntity, ModelHeWhoGames<HeWhoGamesHostileEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("allaboutengie:textures/entities/hewhogames_g.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HeWhoGamesHostileEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/hewhogames.png");
	}
}
