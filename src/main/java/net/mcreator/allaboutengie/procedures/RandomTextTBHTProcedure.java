package net.mcreator.allaboutengie.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class RandomTextTBHTProcedure {
	public static String execute() {
		if (Mth.nextDouble(RandomSource.create(), 1, 10) == 1) {
			return "ROBLOX? Heh, don't get me started on the TRUELY TRASH moderation.";
		} else if (Mth.nextDouble(RandomSource.create(), 1, 10) == 2) {
			return "Honestly, merging Kick, and NCMD together into this was worth it ngl.";
		} else if (Mth.nextDouble(RandomSource.create(), 1, 10) == 3) {
			return "Remember lad, NO RULEBREAKING.";
		} else if (Mth.nextDouble(RandomSource.create(), 1, 10) == 4) {
			return "Moderation in general is decent...";
		} else if (Mth.nextDouble(RandomSource.create(), 1, 10) == 5) {
			return "Moderation on ROBLOX's side is like a metal trashcan...";
		} else if (Mth.nextDouble(RandomSource.create(), 1, 10) == 6) {
			return "hi";
		} else if (Mth.nextDouble(RandomSource.create(), 1, 10) == 7) {
			return "Surely being too silly will get you demoted... right..? :3";
		} else if (Mth.nextDouble(RandomSource.create(), 1, 10) == 8) {
			return "BYE BYE THERE!";
		} else if (Mth.nextDouble(RandomSource.create(), 1, 10) == 9) {
			return "star was here";
		} else if (Mth.nextDouble(RandomSource.create(), 1, 10) == 10) {
			return "Signed by DevEngieGames.";
		}
		return "i'm too silly";
	}
}
