package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class DetectiveGameruleProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_FIND_ENGIE) == false) {
			if (!(entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel && _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:new_world"))).isDone())) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:new_world"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_FIND_ENGIE) == true) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).detecstart == false) {
				if (!(entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
						&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:new_world_new_problem"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:new_world_new_problem"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @p \"Read the diary please.\"");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
									"give @p written_book{pages:['[\"\",{\"text\":\"Day 1(0).\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"Just got here, something feels off about this world.. I have no idea what is, but something is one-hundred percent off. I got to gear up. \",\"color\":\"red\"},{\"text\":\"I\\'m not fond of whatever is here.\",\"bold\":true,\"color\":\"red\"}]','[\"\",{\"text\":\"Day 5(4)\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"Lost my track of time, didn\\'t know I spent that long trying to find somewhere to live. \",\"color\":\"red\"},{\"text\":\"I\\'m not building out in the damn open with whatever is here.\",\"bold\":true,\"color\":\"red\"},{\"text\":\" Hell, with those f*cking enraged looking zombies I\\'ve been on the run since.\",\"color\":\"red\"}]','[\"\",{\"text\":\"Day 8(7)\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"Lost track of time again, I found one of those houses with this white 3rd floor? Whatever, I can try to renovate for as long as possible. \",\"color\":\"red\"},{\"text\":\"As long as whatever is out there can\\'t get in.\",\"bold\":true,\"color\":\"red\"}]','[\"\",{\"text\":\"Day 9(8)\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"These weird looking bins actually give quite the good\\\\n\\\\nSCRAP THAT, WHATEVER WAS SUPPOSED TO BE OUT THERE GOT IN.\\\\n\\\\n\",\"color\":\"red\"},{\"text\":\"I needed to defend myself from those f*cking things.\",\"bold\":true,\"color\":\"red\"}]','[\"\",{\"text\":\"Day 10(9)\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"Blood of the foes splattered everywhere. I needed to clean this sh*t up, I have a feeling I need to add some sort of barricade tonight..\\\\n\\\\n\",\"color\":\"red\"},{\"text\":\"I was right.\",\"bold\":true,\"color\":\"red\"}]','[\"\",{\"text\":\"Day 25(24)\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"Found my diary again, I had lost it while getting rid of that f*cking horde of zombies&husks on Day 10. Found out that it was stolen by a mob that I don\\'t know which one, but\",\"color\":\"red\"},{\"text\":\" it terrifies me even seeing one of them in particular.\",\"bold\":true,\"color\":\"dark_red\"}]','[\"\",{\"text\":\"Day 26(25)\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"A lot of sh*t just went wrong earlier, I had to leave everything I had worked on in that house. To just be infiltrated by \",\"color\":\"red\"},{\"text\":\"whatever \",\"bold\":true,\"color\":\"red\"},{\"text\":\"the f*ck is in this damn world.\",\"color\":\"red\"}]','[\"\",{\"text\":\"Day 40(39)\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"What happened to \",\"color\":\"blue\"},{\"text\":\"Engie\",\"obfuscated\":true,\"color\":\"blue\"},{\"text\":\"?\",\"color\":\"blue\"},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"I do not know... Whatever happened here, it\\'s not good.\",\"color\":\"dark_green\"},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"No sh*t sherlock, that\\'s why I\\'m asking. You\\'re with him more than me.\",\"color\":\"blue\"}]','[\"\",{\"text\":\"Day 49(48)\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"I\\'m alive.. After all of that..!? Who wrote in my diary..? Screw the questions, I\\'m half a heart, I need to find some food or some sort of healing. That f*cking cartoon looking b*tch really did destroy me..\",\"color\":\"red\"}]','[\"\",{\"text\":\"Day 50(49)\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"I saw a glimpse of someone running in the forest to my right. I need to find out who they are, and if possible.. \",\"color\":\"red\"},{\"text\":\"Figure out who wrote in my diary.\",\"bold\":true,\"color\":\"red\"}]','[\"\",{\"text\":\"Console:\",\"bold\":true,\"underlined\":true,\"color\":\"green\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"page from\",\"bold\":true,\"italic\":true,\"underlined\":true,\"color\":\"dark_red\"},{\"text\":\" players/\\\\n\",\"color\":\"dark_red\",\"italic\":true,\"underlined\":true},{\"text\":\"clippedbyengie\",\"italic\":true,\"underlined\":true,\"obfuscated\":true,\"color\":\"dark_red\"},{\"text\":\"/items/\\\\ndiary/page11\",\"color\":\"dark_red\",\"italic\":true,\"underlined\":true},{\"text\":\" unavailible, please check logs for info.\",\"bold\":true,\"italic\":true,\"underlined\":true,\"color\":\"dark_red\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"Console:\",\"bold\":true,\"underlined\":true,\"color\":\"green\"},{\"text\":\"\\\\n\",\"color\":\"reset\",\"bold\":true,\"underlined\":true},{\"text\":\"load console/\\\\nlogs/page11error.txt\",\"bold\":true,\"underlined\":true,\"color\":\"gray\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"\\\\\"Page 11 corrupt.\\\\\"\",\"bold\":true,\"italic\":true,\"color\":\"dark_red\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"Intresting..\",\"color\":\"black\"}]','[\"\",{\"text\":\"Console:\",\"bold\":true,\"underlined\":true,\"color\":\"green\"},{\"text\":\" load page12 from players/\\\\n\",\"color\":\"gray\"},{\"text\":\"clippedbyengie\",\"obfuscated\":true,\"color\":\"gray\"},{\"text\":\"/\\\\nitems/diary/page12\",\"color\":\"gray\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"Console: \",\"bold\":true,\"underlined\":true,\"color\":\"green\"},{\"text\":\"Generating...\",\"color\":\"gray\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"Day 100(99)\",\"bold\":true,\"underlined\":true,\"color\":\"black\"},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"I found out who they were. We\\'ve been living together\",\"color\":\"red\"},{\"text\":\"(LORE WISE) \",\"color\":\"reset\"},{\"text\":\"ever since, for a long time now. It\\'s crazy we found eachother.\",\"color\":\"red\"}]','[\"\",{\"text\":\"Anyways, it\\'s day 100 as you can tell. I had left that old house to live with these two, anyways...\",\"color\":\"red\"},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"Console:\",\"bold\":true,\"underlined\":true,\"color\":\"green\"},{\"text\":\" Succesfully loaded page12 from players/\\\\n\",\"color\":\"gray\"},{\"text\":\"clippedbyengie\",\"obfuscated\":true,\"color\":\"gray\"},{\"text\":\"/\\\\nitems/diary/page12\",\"color\":\"gray\"},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"execute closeconsole.exe\",\"color\":\"gray\"}]','[\"\",{\"text\":\"Day 101(100)\",\"bold\":true,\"underlined\":true},{\"text\":\"\\\\n\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"It appears you, the player(s) have to figure out what happened to \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"Engie\",\"bold\":true,\"obfuscated\":true,\"color\":\"gold\"},{\"text\":\",\\\\n\",\"color\":\"gold\",\"bold\":true},{\"text\":\"Blood\",\"bold\":true,\"obfuscated\":true,\"color\":\"gold\"},{\"text\":\", and\",\"color\":\"gold\",\"bold\":true},{\"text\":\" Xgen\",\"bold\":true,\"obfuscated\":true,\"color\":\"gold\"},{\"text\":\". On this day and more on.\",\"color\":\"gold\",\"bold\":true},{\"text\":\" \",\"color\":\"gold\"},{\"text\":\"Good luck my friend(s). You\\'re going to need it.\",\"bold\":true,\"underlined\":true,\"color\":\"gold\"}]'],title:\"Unknown Diary.\",author:\"EngieGames (Not lore wise.)\",generation:3,display:{Lore:[\"What happened to them?\"]}}");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "time set 100d");
					}
					{
						boolean _setval = true;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.detecstart = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
