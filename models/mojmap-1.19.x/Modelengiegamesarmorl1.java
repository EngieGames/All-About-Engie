// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelengiegamesarmorl1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "engiegamesarmorl1"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart ScarfBody;
	private final ModelPart mainholder;
	private final ModelPart ScarfHangR;
	private final ModelPart R1;
	private final ModelPart R2;
	private final ModelPart R3;
	private final ModelPart R4;
	private final ModelPart R5;
	private final ModelPart ScarfHangL;
	private final ModelPart L1;
	private final ModelPart L2;
	private final ModelPart L3;
	private final ModelPart L4;
	private final ModelPart L5;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart right_shoe;
	private final ModelPart left_shoe;

	public Modelengiegamesarmorl1(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.ScarfBody = this.body.getChild("ScarfBody");
		this.mainholder = this.ScarfBody.getChild("mainholder");
		this.ScarfHangR = this.mainholder.getChild("ScarfHangR");
		this.R1 = this.ScarfHangR.getChild("R1");
		this.R2 = this.R1.getChild("R2");
		this.R3 = this.R2.getChild("R3");
		this.R4 = this.R3.getChild("R4");
		this.R5 = this.R4.getChild("R5");
		this.ScarfHangL = this.mainholder.getChild("ScarfHangL");
		this.L1 = this.ScarfHangL.getChild("L1");
		this.L2 = this.L1.getChild("L2");
		this.L3 = this.L2.getChild("L3");
		this.L4 = this.L3.getChild("L4");
		this.L5 = this.L4.getChild("L5");
		this.right_arm = root.getChild("right_arm");
		this.left_arm = root.getChild("left_arm");
		this.right_shoe = root.getChild("right_shoe");
		this.left_shoe = root.getChild("left_shoe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -10.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 22)
				.addBox(-2.0F, -9.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 15)
				.addBox(-3.0F, -9.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 28)
				.addBox(-4.0F, -8.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
				.addBox(-6.0F, -7.5F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
				.addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-7.0F, -7.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(14, 98)
				.addBox(4.05F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(0, 95)
				.addBox(4.2F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 94)
				.addBox(3.9F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 88)
				.addBox(3.9F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 98)
				.addBox(-5.5F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(0, 95)
				.addBox(-5.3F, -6.0F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 94).mirror()
				.addBox(-4.7F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(11, 88)
				.addBox(-4.7F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
				.addBox(-4.4F, -8.3F, -2.0F, 0.4F, 2.7F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(-4.8F, -8.7F, 1.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(-4.8F, -8.7F, -2.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(4.2F, -8.7F, -2.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(4.2F, -8.7F, 1.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
				.addBox(4.0F, -8.3F, -2.0F, 0.4F, 2.7F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
				.addBox(-4.0F, -8.4F, -2.0F, 8.0F, 0.4F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 50)
				.addBox(-4.5F, -8.8F, -2.0F, 9.0F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 50)
				.addBox(-4.5F, -8.8F, 1.0F, 9.0F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 55)
				.addBox(-4.8F, -8.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 55)
				.addBox(3.6F, -8.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 69)
				.addBox(-4.1F, -5.95F, -5.0F, 8.2F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 125).mirror()
				.addBox(-1.5F, -8.075F, 4.0F, 3.0F, 2.4F, 0.1F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 126)
				.mirror().addBox(-4.1F, -5.675F, 4.0F, 8.2F, 1.5F, 0.1F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 118).addBox(-4.1F, -5.675F, -4.0F, 0.1F, 1.5F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 118).addBox(4.0F, -5.675F, -4.0F, 0.1F, 1.5F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 119).addBox(-1.5F, -8.075F, -3.975F, 3.0F, 0.1F, 7.975F, new CubeDeformation(0.0F))
				.texOffs(56, 64).addBox(-1.8F, -6.25F, -4.5F, 0.3F, 0.3F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(55, 65).addBox(1.5F, -6.25F, -4.5F, 0.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 71)
				.addBox(-4.4F, -1.9F, -4.4F, 8.8F, 2.3F, 8.8F, new CubeDeformation(0.025F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 125).addBox(-1.5F, -1.25F, -0.05F, 3.0F, 2.5F, 0.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.8393F, -4.1868F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(80, 79).mirror()
						.addBox(-6.5F, -6.5F, -1.0F, 13.0F, 13.0F, 2.0F, new CubeDeformation(-5.49F)).mirror(false),
				PartPose.offsetAndRotation(-2.025F, -4.95F, -1.05F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(80, 79).mirror()
						.addBox(-6.5F, -6.5F, -1.0F, 13.0F, 13.0F, 2.0F, new CubeDeformation(-5.49F)).mirror(false),
				PartPose.offsetAndRotation(1.975F, -4.95F, -1.05F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(58, 78).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F,
						new CubeDeformation(-2.99F)),
				PartPose.offsetAndRotation(1.975F, -4.95F, -3.525F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(58, 78).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F,
						new CubeDeformation(-2.99F)),
				PartPose.offsetAndRotation(-2.025F, -4.95F, -3.525F, 0.0F, 3.1416F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(80, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(80, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ScarfBody = body.addOrReplaceChild("ScarfBody", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition mainholder = ScarfBody.addOrReplaceChild("mainholder",
				CubeListBuilder.create().texOffs(0, 71)
						.addBox(0.5F, -2.5F, 4.0F, 3.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-3.5F, -2.5F, 4.0F, 3.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-4.5F, 1.5F, -2.5F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-4.5F, -1.5F, -3.5F, 9.0F, 3.0F, 7.0F, new CubeDeformation(-0.025F)).texOffs(0, 71)
						.addBox(-4.5F, -2.0F, -4.5F, 9.0F, 2.5F, 9.0F, new CubeDeformation(0.025F)).texOffs(0, 71)
						.addBox(-3.5F, -2.9F, -3.5F, 7.0F, 0.9F, 7.0F, new CubeDeformation(0.025F)).texOffs(0, 71)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = mainholder.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 71).addBox(-3.075F, -0.5F, -0.5F, 8.05F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(3.525F, -2.3F, -0.95F, -0.7854F, -1.5708F, 0.0F));

		PartDefinition cube_r7 = mainholder.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 71).addBox(-2.625F, -0.5F, -0.5F, 7.575F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-0.925F, -2.3F, -3.525F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r8 = mainholder.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 3.8F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r9 = mainholder.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.5F, 2.8F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r10 = mainholder.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.5F, -0.7125F, -0.8F, 9.0F, 1.425F, 1.6F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, -0.4833F, 3.5412F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r11 = mainholder.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.5F, -0.5F, -0.6F, 9.0F, 1.425F, 1.6F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, -3.8F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r12 = mainholder.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 71).addBox(-3.575F, -0.5F, -0.5F, 7.6F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(-3.525F, -2.3F, 0.0F, 0.7854F, -1.5708F, 0.0F));

		PartDefinition cube_r13 = mainholder.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.025F, -0.5F, -0.5F, 8.05F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, -2.3F, 3.525F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r14 = mainholder.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, -3.8F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r15 = mainholder.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 71).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.425F, 1.0F,
						new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.5F, -2.8F, 0.7854F, 0.0F, 0.0F));

		PartDefinition ScarfHangR = mainholder.addOrReplaceChild("ScarfHangR", CubeListBuilder.create(),
				PartPose.offset(-2.0F, -2.0F, 4.5F));

		PartDefinition R1 = ScarfHangR.addOrReplaceChild("R1", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F,
				-0.5F, 0.0F, 3.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition R2 = R1.addOrReplaceChild("R2", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, 0.0F,
				-0.25F, 3.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.5F, 0.25F));

		PartDefinition R3 = R2.addOrReplaceChild("R3", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, 0.0F,
				-0.25F, 3.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition R4 = R3.addOrReplaceChild("R4", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, 0.0F,
				-0.25F, 3.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition R5 = R4.addOrReplaceChild("R5", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, 0.0F,
				-0.25F, 3.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition ScarfHangL = mainholder.addOrReplaceChild("ScarfHangL", CubeListBuilder.create(),
				PartPose.offset(2.0F, -2.0F, 4.5F));

		PartDefinition L1 = ScarfHangL.addOrReplaceChild("L1", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F,
				-0.5F, 0.0F, 3.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition L2 = L1.addOrReplaceChild("L2", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, 0.0F,
				-0.25F, 3.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.5F, 0.25F));

		PartDefinition L3 = L2.addOrReplaceChild("L3", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, 0.0F,
				-0.25F, 3.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition L4 = L3.addOrReplaceChild("L4", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, 0.0F,
				-0.25F, 3.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition L5 = L4.addOrReplaceChild("L5", CubeListBuilder.create().texOffs(0, 3).addBox(-1.5F, 0.0F,
				-0.25F, 3.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(104, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(104, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(96, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(112, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_shoe = partdefinition.addOrReplaceChild("right_shoe",
				CubeListBuilder.create().texOffs(64, 16)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(64, 32)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_shoe = partdefinition.addOrReplaceChild("left_shoe",
				CubeListBuilder.create().texOffs(80, 48)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(64, 48)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_shoe.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_shoe.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}