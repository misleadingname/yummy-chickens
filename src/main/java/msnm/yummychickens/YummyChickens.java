package msnm.yummychickens;

import msnm.yummychickens.items.ChickenItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class YummyChickens implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
	public static final String MOD_ID = "yummychickens";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("YummyChickens initialized.");
	}

	@Override
	public void onRecipesReady() {
		ChickenItems.ConstructRecipes();
	}

	@Override
	public void initNamespaces() {
		ChickenItems.ConstructNamespaces();
	}

	@Override
	public void beforeGameStart() {
		ChickenItems.ConstructItems();
	}

	@Override
	public void afterGameStart() {

	}
}
