package msnm.yummychickens.items;

import msnm.yummychickens.YummyChickens;
import net.minecraft.core.item.ItemFood;
import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderFurnace;

public class ChickenItems {
	public static ItemFood RAW_CHICKEN;
	public static ItemFood COOKED_CHICKEN;

	public static RecipeBuilderFurnace RAW_CHICKEN_FURNACE_RECIPE;

	public static void ConstructItems() {
		RAW_CHICKEN = new ItemBuilder(YummyChickens.MOD_ID)
			.build(new ItemFood(
			"rawChicken",
			NamespaceID.getPermanent(YummyChickens.MOD_ID, "rawChicken").toString(),
			20000,
			4,
			18,
			false,
			2
		));

		COOKED_CHICKEN = new ItemBuilder(YummyChickens.MOD_ID)
			.build(new ItemFood(
				"cookedChicken",
				NamespaceID.getPermanent(YummyChickens.MOD_ID, "cookedChicken").toString(),
				20001,
				13,
				14,
				false,
				2
			));
	}

	public static void ConstructRecipes() {
		RAW_CHICKEN_FURNACE_RECIPE = new RecipeBuilderFurnace(YummyChickens.MOD_ID)
			.setInput(RAW_CHICKEN);

		RAW_CHICKEN_FURNACE_RECIPE.create(NamespaceID.getPermanent(YummyChickens.MOD_ID, "cookedChicken").toString(), COOKED_CHICKEN.getDefaultStack());
	}

	public static void ConstructNamespaces() {
		RecipeBuilder.initNameSpace(YummyChickens.MOD_ID);
	}
}
