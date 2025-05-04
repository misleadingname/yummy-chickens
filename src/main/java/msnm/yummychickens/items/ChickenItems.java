package msnm.yummychickens.items;

import msnm.yummychickens.YummyChickens;
import net.minecraft.core.item.ItemFood;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderFurnace;

public class ChickenItems {
	public static ItemFood RAW_CHICKEN;
	public static ItemFood COOKED_CHICKEN;

	public static RecipeBuilderFurnace RAW_CHICKEN_FURNACE_RECIPE;

	public static void ConstructItems() {
		RAW_CHICKEN = new ItemFood(
			"rawChicken",
			"yummyChickens:rawChicken",
			20000,
			4,
			18,
			false,
			2
		);

		COOKED_CHICKEN = new ItemFood(
			"cookedChicken",
			"yummyChickens:cookedChicken",
			20001,
			13,
			14,
			false,
			2
		);
	}

	public static void ConstructRecipes() {
		RAW_CHICKEN_FURNACE_RECIPE = new RecipeBuilderFurnace(YummyChickens.MOD_ID)
			.setInput(RAW_CHICKEN);

		RAW_CHICKEN_FURNACE_RECIPE.create("yummyChickens:cookedChicken", COOKED_CHICKEN.getDefaultStack());
	}
}
