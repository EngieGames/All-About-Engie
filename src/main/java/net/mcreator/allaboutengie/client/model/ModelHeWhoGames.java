package net.mcreator.allaboutengie.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelHeWhoGames<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("allaboutengie", "model_he_who_games"), "main");
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelHeWhoGames(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(80, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(96, 121)
						.addBox(-3.3F, 0.64F, -2.5F, 6.55F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 121).addBox(-2.7F, 1.04F, -2.5F, 5.45F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-2.6F, 1.54F, -2.5F, 5.35F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 121).addBox(-3.9F, 0.04F, -2.5F, 7.75F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-5.4F, -0.5F, -2.5F, 10.8F, 1.2F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Main_r1 = Body.addOrReplaceChild("Main_r1",
				CubeListBuilder.create().texOffs(19, 55).addBox(3.625F, -2.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 55).addBox(-4.775F, -2.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 50)
						.addBox(-4.475F, -2.5F, 1.0F, 9.0F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 50).addBox(-4.475F, -2.5F, -2.0F, 9.0F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-3.975F, -2.1F, -2.0F, 8.0F, 0.4F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 64).addBox(4.025F, -2.0F, -2.0F, 0.4F, 2.7F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
						.addBox(4.225F, -2.4F, 1.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55).addBox(4.225F, -2.4F, -2.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
						.addBox(-4.775F, -2.4F, -2.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55).addBox(-4.775F, -2.4F, 1.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-4.375F, -2.0F, -2.0F, 0.4F, 2.7F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 88).addBox(-4.675F, 0.3F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 94).mirror()
						.addBox(-4.675F, -0.2F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 95).addBox(-5.275F, 0.3F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 98)
						.addBox(-5.475F, 1.1F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(11, 88).addBox(3.925F, 0.3F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 94)
						.addBox(3.925F, -0.2F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 95).addBox(4.225F, 0.3F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 98)
						.addBox(4.075F, 1.1F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.025F, 0.7F, 1.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition Main_r2 = Body.addOrReplaceChild("Main_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 1.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-5.0F, 0.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-6.0F, 0.5F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(30, 28).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 15)
						.addBox(-3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 22).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 4.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7758F, 0.3973F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7242F, 0.3973F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9022F, 0.9671F, 0.0F, 0.0F, 0.0F, -0.6283F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9539F, 0.9671F, 0.0F, 0.0F, 0.0F, 0.6283F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3539F, 1.3671F, 0.0F, 0.0F, 0.0F, 0.6283F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5373F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6758F, 1.8973F, 0.0F, 0.0F, 0.0F, 0.6283F));
		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4022F, 1.3671F, 0.0F, 0.0F, 0.0F, -0.6283F));
		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8022F, 1.8671F, 0.0F, 0.0F, 0.0F, -0.6283F));
		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 3.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7242F, -0.1027F, 0.3F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)).texOffs(96, 121).addBox(-0.5F, -0.5F, 0.4F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5242F, -0.6027F, 0.4F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)).texOffs(96, 121).addBox(-0.5F, -0.5F, 0.6F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-0.5F, -0.5F, -1.4F, 1.0F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(96, 121).addBox(0.0F, -0.5F, -1.4F, 0.5F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-0.5F, -0.5F, 2.0F, 1.0F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(96, 121).addBox(0.0F, -0.5F, 2.0F, 0.5F, 1.0F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9242F, -1.1027F, 0.3F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, 0.0F, -1.4F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(96, 121).addBox(-0.5F, 0.0F, -3.2F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4242F, -1.0027F, 2.2F, 0.0F, 0.0F, -0.3491F));
		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, 0.0F, -1.3F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(96, 121).addBox(-0.5F, 0.0F, 0.5F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.3242F, -1.3027F, 0.3F, 0.0F, 0.0F, -0.3491F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(104, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(96, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(64, 16).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 32).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(80, 48).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 48).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
