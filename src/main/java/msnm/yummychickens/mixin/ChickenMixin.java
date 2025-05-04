package msnm.yummychickens.mixin;

import msnm.yummychickens.YummyChickens;
import msnm.yummychickens.items.ChickenItems;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.entity.animal.MobChicken;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

@Mixin(value = MobChicken.class, remap = false)
public abstract class ChickenMixin {
	@Unique
	public List<WeightedRandomLootObject> burningMobDrops = new ArrayList<>();
	@Inject(method = "<init>", at = @At("RETURN"))
	private void postConstruct(World world, CallbackInfo ci) {
		YummyChickens.LOGGER.info("Adding drop to chicken");
		((MobChicken) (Object) this).mobDrops.add(new WeightedRandomLootObject(ChickenItems.RAW_CHICKEN.getDefaultStack(), 1));

		this.burningMobDrops.add(new WeightedRandomLootObject(ChickenItems.COOKED_CHICKEN.getDefaultStack(), 1));
	}


	@Unique
	public List<WeightedRandomLootObject> getMobDrops() {
		return ((MobChicken) (Object) this).remainingFireTicks > 0 ? this.burningMobDrops : ((MobChicken) (Object) this).mobDrops;
	}
}
