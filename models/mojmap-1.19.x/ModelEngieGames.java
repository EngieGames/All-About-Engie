// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelEngieGames<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "engiegames"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelEngieGames(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -10.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 22)
				.addBox(-2.0F, -9.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 15)
				.addBox(-3.0F, -9.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 28)
				.addBox(-4.0F, -8.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
				.addBox(-6.0F, -7.5F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
				.addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-7.0F, -7.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(96, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(14, 98)
				.addBox(4.05F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(0, 95)
				.addBox(4.2F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 94)
				.addBox(3.9F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 88)
				.addBox(3.9F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 98)
				.addBox(-5.5F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(0, 95)
				.addBox(-5.3F, -6.0F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 94).mirror()
				.addBox(-4.7F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(11, 88)
				.addBox(-4.7F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 66)
				.addBox(-4.4F, -8.3F, -1.0F, 0.4F, 2.7F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 66)
				.addBox(4.0F, -8.3F, -1.0F, 0.4F, 2.7F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
				.addBox(-4.0F, -8.4F, -1.0F, 8.0F, 0.4F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 69)
				.addBox(-4.1F, -5.95F, -5.0F, 8.2F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 125).mirror()
				.addBox(-1.5F, -8.075F, 4.0F, 3.0F, 2.4F, 0.1F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 126)
				.mirror().addBox(-4.1F, -5.675F, 4.0F, 8.2F, 1.5F, 0.1F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 118).addBox(-4.1F, -5.675F, -4.0F, 0.1F, 1.5F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 118).addBox(4.0F, -5.675F, -4.0F, 0.1F, 1.5F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 119).addBox(-1.5F, -8.075F, -3.975F, 3.0F, 0.1F, 7.975F, new CubeDeformation(0.0F))
				.texOffs(56, 64).addBox(-1.8F, -6.25F, -4.5F, 0.3F, 0.3F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(55, 65).addBox(1.5F, -6.25F, -4.5F, 0.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 125).addBox(-1.5F, -2.5F, -0.05F, 3.0F, 2.5F, 0.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.6F, -4.35F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(80, 79).mirror()
						.addBox(-9.0F, -4.0F, -1.0F, 13.0F, 13.0F, 2.0F, new CubeDeformation(-5.49F)).mirror(false),
				PartPose.offsetAndRotation(-4.525F, -7.45F, -1.05F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(80, 79).mirror()
						.addBox(-9.0F, -4.0F, -1.0F, 13.0F, 13.0F, 2.0F, new CubeDeformation(-5.49F)).mirror(false),
				PartPose.offsetAndRotation(-0.525F, -7.45F, -1.05F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(58, 78).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F,
						new CubeDeformation(-2.99F)),
				PartPose.offsetAndRotation(1.975F, -4.95F, -3.525F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(58, 78).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F,
						new CubeDeformation(-2.99F)),
				PartPose.offsetAndRotation(-2.025F, -4.95F, -3.525F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(80, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(96, 121)
						.addBox(-3.3F, 0.64F, -2.5F, 6.55F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-2.7F, 1.04F, -2.5F, 5.45F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-2.6F, 1.54F, -2.5F, 5.35F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-3.9F, 0.04F, -2.5F, 7.75F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-5.4F, -0.5F, -2.5F, 10.8F, 1.2F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Cape_r1 = Body.addOrReplaceChild("Cape_r1",
				CubeListBuilder.create().texOffs(37, 106).addBox(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 2.8798F, 0.0F, 3.1416F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7758F, 0.3973F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7242F, 0.3973F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9022F, 0.9671F, 0.0F, 0.0F, 0.0F, -0.6283F));

		PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9539F, 0.9671F, 0.0F, 0.0F, 0.0F, 0.6283F));

		PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3539F, 1.3671F, 0.0F, 0.0F, 0.0F, 0.6283F));

		PartDefinition cube_r11 = Body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5373F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6758F, 1.8973F, 0.0F, 0.0F, 0.0F, 0.6283F));

		PartDefinition cube_r12 = Body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4022F, 1.3671F, 0.0F, 0.0F, 0.0F, -0.6283F));

		PartDefinition cube_r13 = Body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8022F, 1.8671F, 0.0F, 0.0F, 0.0F, -0.6283F));

		PartDefinition cube_r14 = Body.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(96, 121).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 3.3F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7242F, -0.1027F, 0.3F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(96, 121)
						.addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-0.5F, -0.5F, 0.4F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5242F, -0.6027F, 0.4F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(96, 121)
						.addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-0.5F, -0.5F, 0.6F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-0.5F, -0.5F, -1.4F, 1.0F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(0.0F, -0.5F, -1.4F, 0.5F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-0.5F, -0.5F, 2.0F, 1.0F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(0.0F, -0.5F, 2.0F, 0.5F, 1.0F, 0.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9242F, -1.1027F, 0.3F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(96, 121)
						.addBox(-0.5F, 0.0F, -1.4F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-0.5F, 0.0F, -3.2F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4242F, -1.0027F, 2.2F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r18 = Body.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(96, 121)
						.addBox(-0.5F, 0.0F, -1.3F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(96, 121)
						.addBox(-0.5F, 0.0F, 0.5F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.3242F, -1.3027F, 0.3F, 0.0F, 0.0F, -0.3491F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(104, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(96, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(64, 16)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 32)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(80, 48)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 48)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}