package com.junipergroup.extc.block.entity;

import com.junipergroup.extc.ExtendedCraft;
import com.junipergroup.extc.init.BlockInit;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> Block_Entities = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExtendedCraft.MODID);

    public static final RegistryObject<BlockEntityType<ToolUpgradeStationBlockEntity>> TOOL_UPGRADE_STATION = Block_Entities.register("tool_upgrade_station", () ->
            BlockEntityType.Builder.of(ToolUpgradeStationBlockEntity::new, BlockInit.TOOL_UPGRADE_STATION.get()).build(null));

    public static void register(IEventBus eventBus) {
        Block_Entities.register(eventBus);
    }
}
