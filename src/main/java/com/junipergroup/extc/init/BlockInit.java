package com.junipergroup.extc.init;

import com.junipergroup.extc.ExtendedCraft;
import com.junipergroup.extc.block.custom.ToolUpgradeStationBlock;
import com.mojang.datafixers.types.templates.Tag;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.TagLoader;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedCraft.MODID);

    public static final RegistryObject<Block> EXBLOCK = register("exblock",
            () -> new Block(BlockBehaviour.Properties.of(Material.CLAY).friction(0.5f).strength(2.0f, 8).requiresCorrectToolForDrops()),
                  new Item.Properties());

    public static final RegistryObject<Block> TOOL_UPGRADE_STATION = registerBlock("tool_upgrade_station",
            () -> new ToolUpgradeStationBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), null);

    //Konium Blocks
    public static final RegistryObject<Block> KONIUMBLOCK = register("konium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2.0f, 18).requiresCorrectToolForDrops()),
                  new Item.Properties());
    public static final RegistryObject<Block> KONIUMORE = register("konium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f, 18).requiresCorrectToolForDrops()),
            new Item.Properties());

    //upgrade stations
    public static final RegistryObject<Block> PICK_UPGRADE_STATION = registerBlock("pick_upgrade_station",
            () -> new ToolUpgradeStationBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), null);





    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemIni.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> supplier, CreativeModeTab tab){
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        registerBlockItem(name, block, tab);
        return block;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ItemIni.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }



}
