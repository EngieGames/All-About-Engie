// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelengieboyosit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "engieboyosit"), "main");
	private final ModelPart Body;
	private final ModelPart tail;
	private final ModelPart base;
	private final ModelPart base2;
	private final ModelPart mid1;
	private final ModelPart mid1a;
	private final ModelPart mid2;
	private final ModelPart mid2a;
	private final ModelPart tip;
	private final ModelPart tip2;
	private final ModelPart Head;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;

	public Modelengieboyosit(ModelPart root) {
		this.Body = root.getChild("Body");
		this.tail = this.Body.getChild("tail");
		this.base = this.tail.getChild("base");
		this.base2 = this.base.getChild("base2");
		this.mid1 = this.base2.getChild("mid1");
		this.mid1a = this.mid1.getChild("mid1a");
		this.mid2 = this.mid1a.getChild("mid2");
		this.mid2a = this.mid2.getChild("mid2a");
		this.tip = this.mid2a.getChild("tip");
		this.tip2 = this.tip.getChild("tip2");
		this.Head = root.getChild("Head");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 28)
						.addBox(-5.0F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(33, 72)
						.addBox(-5.0F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 17.7F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition BackFin_r1 = Body.addOrReplaceChild("BackFin_r1",
				CubeListBuilder.create().texOffs(107, 52).addBox(-1.0F, 0.9753F, 2.2318F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition BackFin_r2 = Body.addOrReplaceChild("BackFin_r2",
				CubeListBuilder.create().texOffs(97, 50).addBox(-1.0F, -1.9066F, 3.7227F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.25F, 25.0F, -20.5F, -1.5708F, 0.0F, 0.0F));

		PartDefinition base = tail.addOrReplaceChild("base", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -19.85F, -22.95F, -0.3491F, 0.0F, 0.0F));

		PartDefinition base2 = base.addOrReplaceChild("base2",
				CubeListBuilder.create().texOffs(107, 33)
						.addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(112, 81)
						.addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0873F, 0.0F, 0.0F));

		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1",
				CubeListBuilder.create().texOffs(92, 32).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -2.9571F, 3.7604F, -0.7854F, 0.0F, 0.0F));

		PartDefinition mid1 = base2.addOrReplaceChild("mid1",
				CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0903F, -0.2608F, -0.0233F));

		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a",
				CubeListBuilder.create().texOffs(107, 33).addBox(-2.75F, -2.75F, 0.0F, 5.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0903F, -0.2608F, -0.0233F));

		PartDefinition sidefin_r1 = mid1a.addOrReplaceChild("sidefin_r1",
				CubeListBuilder.create().texOffs(93, 45).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7409F, 1.8339F, 2.433F, 0.0246F, 0.5108F, -0.2081F));

		PartDefinition sidefin_r2 = mid1a.addOrReplaceChild("sidefin_r2",
				CubeListBuilder.create().texOffs(92, 40).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7409F, 1.8339F, 2.433F, 0.0246F, -0.5108F, 0.2081F));

		PartDefinition mid2 = mid1a.addOrReplaceChild("mid2",
				CubeListBuilder.create().texOffs(114, 42).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.0903F, -0.2608F, -0.0233F));

		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a",
				CubeListBuilder.create().texOffs(114, 42).addBox(-2.125F, -2.125F, 0.0F, 4.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0903F, -0.2608F, 0.0233F));

		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2",
				CubeListBuilder.create().texOffs(94, 16).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.5821F, 2.3033F, -0.7854F, 0.0F, 0.0F));

		PartDefinition tip = mid2a.addOrReplaceChild("tip",
				CubeListBuilder.create().texOffs(118, 50).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, -0.0903F, -0.2608F, 0.0233F));

		PartDefinition tip2 = tip.addOrReplaceChild("tip2",
				CubeListBuilder.create().texOffs(118, 56).addBox(-0.875F, -0.875F, 0.0F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.8125F, 0.346F, -0.2608F, 0.0233F));

		PartDefinition shark_r1 = tip2.addOrReplaceChild("shark_r1",
				CubeListBuilder.create().texOffs(92, 24).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.1188F, 1.0963F, 2.6376F, -0.7854F, 0.0F, 0.0F));

		PartDefinition shark_r2 = tip2.addOrReplaceChild("shark_r2",
				CubeListBuilder.create().texOffs(79, 25).addBox(-0.5F, -3.5F, -2.0F, 1.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -1.8857F, 3.7071F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(36, 39)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(56, 0)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(64, 55)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 52)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(0, 68)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(0, 0)
						.addBox(-7.0F, -5.6F, -11.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-6.0F, -6.1F, -10.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(36, 28)
						.addBox(-5.0F, -6.6F, -9.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 16)
						.addBox(-4.0F, -7.1F, -8.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(68, 39)
						.addBox(-3.0F, -7.6F, -7.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(88, 0)
						.addBox(-2.0F, -8.1F, -6.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 25)
						.addBox(-1.0F, -8.6F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.7F, -6.0F));

		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1",
				CubeListBuilder.create().texOffs(88, 5).addBox(-0.25F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, -3.0F, 1.0263F, -0.733F, -0.9599F));

		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2",
				CubeListBuilder.create().texOffs(88, 10).addBox(-0.25F, -2.0F, 0.0F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, -3.0F, -1.0263F, -0.733F, -2.1817F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, 4.0F, -4.475F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(-3.0F, 18.0F, 7.0F, 0.0F, 0.5585F, 0.0F));

		PartDefinition Toe_r1 = leg1.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(124, 36)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(1.55F, 5.5F, -4.475F, 0.0F, 0.0F, 0.0F));

		PartDefinition Toe_r2 = leg1.addOrReplaceChild("Toe_r2",
				CubeListBuilder.create().texOffs(124, 33)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.2786F, -0.6109F, 0.0F, 0.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, 4.0F, -4.475F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(3.0F, 18.0F, 7.0F, 0.0F, -0.5585F, 0.0F));

		PartDefinition Toe_r3 = leg2.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(124, 36)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(1.55F, 5.5F, -4.475F, 0.0F, 0.0F, 0.0F));

		PartDefinition Toe_r4 = leg2.addOrReplaceChild("Toe_r4",
				CubeListBuilder.create().texOffs(124, 33)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.2786F, -0.6109F, 0.0F, 0.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, 4.0F, -4.25F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(-3.0F, 18.0F, -5.0F, 0.0F, 0.5585F, 0.0F));

		PartDefinition Toe_r5 = leg3.addOrReplaceChild("Toe_r5",
				CubeListBuilder.create().texOffs(124, 36)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(1.55F, 5.5F, -4.25F, 0.0F, 0.0F, 0.0F));

		PartDefinition Toe_r6 = leg3.addOrReplaceChild("Toe_r6",
				CubeListBuilder.create().texOffs(124, 33)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.0536F, -0.6109F, 0.0F, 0.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(112, 26).addBox(-2.0F, 4.0F, -4.25F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(3.0F, 18.0F, -5.0F, 0.0F, -0.5585F, 0.0F));

		PartDefinition Toe_r7 = leg4.addOrReplaceChild("Toe_r7",
				CubeListBuilder.create().texOffs(124, 36)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(124, 36)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(1.55F, 5.5F, -4.25F, 0.0F, 0.0F, 0.0F));

		PartDefinition Toe_r8 = leg4.addOrReplaceChild("Toe_r8",
				CubeListBuilder.create().texOffs(124, 33)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(124, 33)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.0536F, -0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}