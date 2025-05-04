package msnm.yummychickens;

import msnm.yummychickens.items.ChickenItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.ModelEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class YummyChickens implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint, ModelEntrypoint {
	public static final String MOD_ID = "YummyChickens";
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
	}

	@Override
	public void beforeGameStart() {
		ChickenItems.ConstructItems();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		ModelHelper.setItemModel(ChickenItems.RAW_CHICKEN, () -> new ItemModelStandard(ChickenItems.RAW_CHICKEN, MOD_ID));
		ModelHelper.setItemModel(ChickenItems.COOKED_CHICKEN, () -> new ItemModelStandard(ChickenItems.COOKED_CHICKEN, MOD_ID));
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
