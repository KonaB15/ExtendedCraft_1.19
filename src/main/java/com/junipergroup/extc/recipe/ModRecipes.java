package com.junipergroup.extc.recipe;

import com.junipergroup.extc.ExtendedCraft;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ExtendedCraft.MODID);

    public static final RegistryObject<RecipeSerializer<ToolUpgradeStationRecipe>> TOOL_UPGRADE_SERIALIZER =
            SERIALIZERS.register("tool_upgrade", () -> ToolUpgradeStationRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
