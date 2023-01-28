package com.junipergroup.extc.init;

import com.junipergroup.extc.ExtendedCraft;
import com.junipergroup.extc.base.*;
import net.minecraft.core.Registry;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.registries.*;
import org.jetbrains.annotations.Debug;

import java.util.List;
import java.util.logging.Logger;

public class ItemIni {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedCraft.MODID);


    //Items
    public static final RegistryObject<Item> EXITEM = ITEMS.register("exitem", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KONIUM = ITEMS.register("konium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_KONIUM = ITEMS.register("refined_konium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STAR_SHARD = ITEMS.register("star_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_SCALE = ITEMS.register("dragon_scale", () -> new Item(new Item.Properties()));


    //Tools
    //Wood
    public static final RegistryObject<SwordItem> WOOD_SWORD = ITEMS.register("wooden_sword",
            () -> new SwordItem(ModTiers.WOOD, 1, -2.8f, toolTab()));
    public static final RegistryObject<PickaxeItem> WOOD_PICKAXE = ITEMS.register("wooden_pickaxe",
            () -> new PickaxeItem(ModTiers.WOOD, 1, -3.3f, toolTab()));
    public static final RegistryObject<ShovelItem> WOOD_SHOVEL = ITEMS.register("wooden_shovel",
            () -> new ShovelItem(ModTiers.WOOD, 0, -3.0f, toolTab()));
    public static final RegistryObject<AxeItem> WOOD_AXE = ITEMS.register("wooden_axe",
            () -> new AxeItem(ModTiers.WOOD, 3, -3.7f, toolTab()));
    public static final RegistryObject<HoeItem> WOOD_HOE = ITEMS.register("wooden_hoe",
            () -> new HoeItem(ModTiers.WOOD, 0, -3.0f, toolTab()));

    //Stone
    public static final RegistryObject<SwordItem> STONE_SWORD = ITEMS.register("stone_sword",
            () -> new SwordItem(ModTiers.STONE, 2, -2.8f, toolTab()));
    public static final RegistryObject<PickaxeItem> STONE_PICKAXE = ITEMS.register("stone_pickaxe",
            () -> new PickaxeItem(ModTiers.STONE, 1, -3.3f, toolTab()));
    public static final RegistryObject<ShovelItem> STONE_SHOVEL = ITEMS.register("stone_shovel",
            () -> new ShovelItem(ModTiers.STONE, 0, -3.0f, toolTab()));
    public static final RegistryObject<AxeItem> STONE_AXE = ITEMS.register("stone_axe",
            () -> new AxeItem(ModTiers.STONE, 4, -3.7f, toolTab()));
    public static final RegistryObject<HoeItem> STONE_HOE = ITEMS.register("stone_hoe",
            () -> new HoeItem(ModTiers.STONE, 0, -3.0f, toolTab()));

    //Copper
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModTiers.COPPER, 3, -2.8f, toolTab()));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModTiers.COPPER, 1, -3.3f, toolTab()));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModTiers.COPPER, 0, -3.0f, toolTab()));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModTiers.COPPER, 5, -3.7f, toolTab()));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModTiers.COPPER, 0, -3.0f, toolTab()));

    //Iron
    public static final RegistryObject<SwordItem> IRON_SWORD = ITEMS.register("iron_sword",
            () -> new SwordItem(ModTiers.IRON, 4, -2.7f, toolTab()));
    public static final RegistryObject<PickaxeItem> IRON_PICKAXE = ITEMS.register("iron_pickaxe",
            () -> new PickaxeItem(ModTiers.IRON, 1, -3.2f, toolTab()));
    public static final RegistryObject<ShovelItem> IRON_SHOVEL = ITEMS.register("iron_shovel",
            () -> new ShovelItem(ModTiers.IRON, 0, -3f, toolTab()));
    public static final RegistryObject<AxeItem> IRON_AXE = ITEMS.register("iron_axe",
            () -> new AxeItem(ModTiers.IRON, 6, -3.6f, toolTab()));
    public static final RegistryObject<HoeItem> IRON_HOE = ITEMS.register("iron_hoe",
            () -> new HoeItem(ModTiers.IRON, 0, -3.0f, toolTab()));


    //Gold
    public static final RegistryObject<SwordItem> GOLD_SWORD = ITEMS.register("gold_sword",
            () -> new SwordItem(ModTiers.GOLD, 5, -2.6f, toolTab()));
    public static final RegistryObject<PickaxeItem> GOLD_PICKAXE = ITEMS.register("gold_pickaxe",
            () -> new PickaxeItem(ModTiers.GOLD, 1, -3.1f, toolTab()));
    public static final RegistryObject<ShovelItem> GOLD_SHOVEL = ITEMS.register("gold_shovel",
            () -> new ShovelItem(ModTiers.GOLD, 0, -3f, toolTab()));
    public static final RegistryObject<AxeItem> GOLD_AXE = ITEMS.register("gold_axe",
            () -> new AxeItem(ModTiers.GOLD, 7, -3.5f, toolTab()));
    public static final RegistryObject<HoeItem> GOLD_HOE = ITEMS.register("gold_hoe",
            () -> new HoeItem(ModTiers.GOLD, 0, -3.0f, toolTab()));

    //Diamond
    public static final RegistryObject<SwordItem> DIAMOND_SWORD = ITEMS.register("diamond_sword",
            () -> new SwordItem(ModTiers.DIAMOND, 6, -2.5f, toolTab()));
    public static final RegistryObject<PickaxeItem> DIAMOND_PICKAXE = ITEMS.register("diamond_pickaxe",
            () -> new PickaxeItem(ModTiers.DIAMOND, 1, -3.0f, toolTab()));
    public static final RegistryObject<ShovelItem> DIAMOND_SHOVEL = ITEMS.register("diamond_shovel",
            () -> new ShovelItem(ModTiers.DIAMOND, 0, -3f, toolTab()));
    public static final RegistryObject<AxeItem> DIAMOND_AXE = ITEMS.register("diamond_axe",
            () -> new AxeItem(ModTiers.DIAMOND, 8, -3.4f, toolTab()));
    public static final RegistryObject<HoeItem> DIAMOND_HOE = ITEMS.register("diamond_hoe",
            () -> new HoeItem(ModTiers.DIAMOND, 0, -3.0f, toolTab()));

    //Netherite
    public static final RegistryObject<SwordItem> NETHERITE_SWORD = ITEMS.register("netherite_sword",
            () -> new SwordItem(ModTiers.NETHERITE, 7, -2.4f, toolTab()));
    public static final RegistryObject<PickaxeItem> NETHERITE_PICKAXE = ITEMS.register("netherite_pickaxe",
            () -> new PickaxeItem(ModTiers.NETHERITE, 2, -2.9f, toolTab()));
    public static final RegistryObject<ShovelItem> NETHERITE_SHOVEL = ITEMS.register("netherite_shovel",
            () -> new ShovelItem(ModTiers.NETHERITE, 0, -3f, toolTab()));
    public static final RegistryObject<AxeItem> NETHERITE_AXE = ITEMS.register("netherite_axe",
            () -> new AxeItem(ModTiers.NETHERITE, 9, -3.3f, toolTab()));
    public static final RegistryObject<HoeItem> NETHERITE_HOE = ITEMS.register("netherite_hoe",
            () -> new HoeItem(ModTiers.NETHERITE, 0, -3.0f, toolTab()));

    //Konium
    public static final RegistryObject<SwordItem> KONIUM_SWORD = ITEMS.register("konium_sword",
            () -> new SwordItem(ModTiers.KONIUM, 8, -2.1f, toolTab()));
    public static final RegistryObject<PickaxeItem> KONIUM_PICKAXE = ITEMS.register("konium_pickaxe",
            () -> new PickaxeItem(ModTiers.KONIUM, 2, -2.7f, toolTab()));
    public static final RegistryObject<ShovelItem> KONIUM_SHOVEL = ITEMS.register("konium_shovel",
            () -> new ShovelItem(ModTiers.KONIUM, 0, -3f, toolTab()));
    public static final RegistryObject<AxeItem> KONIUM_AXE = ITEMS.register("konium_axe",
            () -> new AxeItem(ModTiers.KONIUM, 10, -3.1f, toolTab()));
    public static final RegistryObject<HoeItem> KONIUM_HOE = ITEMS.register("konium_hoe",
            () -> new HoeItem(ModTiers.KONIUM, 0, -2.8f, toolTab()));

    //Armor
    //Copper
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", ()-> new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.HEAD, toolTab()));
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", ()-> new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.CHEST, toolTab()));
    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", ()-> new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.LEGS, toolTab()));
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", ()-> new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.FEET, toolTab()));

    //Chain Mail
    public static final RegistryObject<ArmorItem> CHAIN_HELMET = ITEMS.register("chain_helmet", ()-> new ArmorItem(ArmorTiers.CHAIN, EquipmentSlot.HEAD, toolTab()));
    public static final RegistryObject<ArmorItem> CHAIN_CHESTPLATE = ITEMS.register("chain_chestplate", ()-> new ArmorItem(ArmorTiers.CHAIN, EquipmentSlot.CHEST, toolTab()));
    public static final RegistryObject<ArmorItem> CHAIN_LEGGINGS = ITEMS.register("chain_leggings", ()-> new ArmorItem(ArmorTiers.CHAIN, EquipmentSlot.LEGS, toolTab()));
    public static final RegistryObject<ArmorItem> CHAIN_BOOTS = ITEMS.register("chain_boots", ()-> new ArmorItem(ArmorTiers.CHAIN, EquipmentSlot.FEET, toolTab()));

    //Iron
    public static final RegistryObject<ArmorItem> IRON_HELMET = ITEMS.register("iron_helmet", ()-> new ArmorItem(ArmorTiers.IRON, EquipmentSlot.HEAD, toolTab()));
    public static final RegistryObject<ArmorItem> IRON_CHESTPLATE = ITEMS.register("iron_chestplate", ()-> new ArmorItem(ArmorTiers.IRON, EquipmentSlot.CHEST, toolTab()));
    public static final RegistryObject<ArmorItem> IRON_LEGGINGS = ITEMS.register("iron_leggings", ()-> new ArmorItem(ArmorTiers.IRON, EquipmentSlot.LEGS, toolTab()));
    public static final RegistryObject<ArmorItem> IRON_BOOTS = ITEMS.register("iron_boots", ()-> new ArmorItem(ArmorTiers.IRON, EquipmentSlot.FEET, toolTab()));

    //Gold
    public static final RegistryObject<ArmorItem> GOLD_HELMET = ITEMS.register("gold_helmet", ()-> new ArmorItem(ArmorTiers.GOLD, EquipmentSlot.HEAD, toolTab()));
    public static final RegistryObject<ArmorItem> GOLD_CHESTPLATE = ITEMS.register("gold_chestplate", ()-> new ArmorItem(ArmorTiers.GOLD, EquipmentSlot.CHEST, toolTab()));
    public static final RegistryObject<ArmorItem> GOLD_LEGGINGS = ITEMS.register("gold_leggings", ()-> new ArmorItem(ArmorTiers.GOLD, EquipmentSlot.LEGS, toolTab()));
    public static final RegistryObject<ArmorItem> GOLD_BOOTS = ITEMS.register("gold_boots", ()-> new ArmorItem(ArmorTiers.GOLD, EquipmentSlot.FEET, toolTab()));

    //Diamond
    public static final RegistryObject<ArmorItem> DIAMOND_HELMET = ITEMS.register("diamond_helm", ()-> new ArmorItem(ArmorTiers.DIAMOND, EquipmentSlot.HEAD, toolTab()));
    public static final RegistryObject<ArmorItem> DIAMOND_CHESTPLATE = ITEMS.register("diamond_chestplate", ()-> new ArmorItem(ArmorTiers.DIAMOND, EquipmentSlot.CHEST, toolTab()));
    public static final RegistryObject<ArmorItem> DIAMOND_LEGGINGS = ITEMS.register("diamond_leggings", ()-> new ArmorItem(ArmorTiers.DIAMOND, EquipmentSlot.LEGS, toolTab()));
    public static final RegistryObject<ArmorItem> DIAMOND_BOOTS = ITEMS.register("diamond_boots", ()-> new ArmorItem(ArmorTiers.DIAMOND, EquipmentSlot.FEET, toolTab()));

    //Netherite
    public static final RegistryObject<ArmorItem> NETHERITE_HELMET = ITEMS.register("netherite_helmet", ()-> new ArmorItem(ArmorTiers.NETHERITE, EquipmentSlot.HEAD, toolTab()));
    public static final RegistryObject<ArmorItem> NETHERITE_CHESTPLATE = ITEMS.register("netherite_chestplate", ()-> new ArmorItem(ArmorTiers.NETHERITE, EquipmentSlot.CHEST, toolTab()));
    public static final RegistryObject<ArmorItem> NETHERITE_LEGGINGS = ITEMS.register("netherite_leggings", ()-> new ArmorItem(ArmorTiers.NETHERITE, EquipmentSlot.LEGS, toolTab()));
    public static final RegistryObject<ArmorItem> NETHERITE_BOOTS = ITEMS.register("netherite_boots", ()-> new ArmorItem(ArmorTiers.NETHERITE, EquipmentSlot.FEET, toolTab()));

    //Konium
    public static final RegistryObject<ArmorItem> KONIUM_HELMET = ITEMS.register("konium_helmet", ()-> new ArmorItem(ArmorTiers.KONIUM, EquipmentSlot.HEAD, toolTab()));
    public static final RegistryObject<ArmorItem> KONIUM_CHESTPLATE = ITEMS.register("konium_chestplate", ()-> new ArmorItem(ArmorTiers.KONIUM, EquipmentSlot.CHEST, toolTab()));
    public static final RegistryObject<ArmorItem> KONIUM_LEGGINGS = ITEMS.register("konium_leggings", ()-> new ArmorItem(ArmorTiers.KONIUM, EquipmentSlot.LEGS, toolTab()));
    public static final RegistryObject<ArmorItem> KONIUM_BOOTS = ITEMS.register("konium_boots", ()-> new ArmorItem(ArmorTiers.KONIUM, EquipmentSlot.FEET, toolTab()));

    //DRAGON
    public static final RegistryObject<ArmorItem> DRAGON_HELMET = ITEMS.register("dragon_helmet", ()-> new ArmorItem(ArmorTiers.DRAGONSCALE, EquipmentSlot.HEAD, toolTab()));
    public static final RegistryObject<ArmorItem> DRAGON_CHESTPLATE = ITEMS.register("dragon_chestplate", ()-> new ArmorItem(ArmorTiers.DRAGONSCALE, EquipmentSlot.CHEST, toolTab()));
    public static final RegistryObject<ArmorItem> DRAGON_LEGGINGS = ITEMS.register("dragon_leggings", ()-> new ArmorItem(ArmorTiers.DRAGONSCALE, EquipmentSlot.LEGS, toolTab()));
    public static final RegistryObject<ArmorItem> DRAGON_BOOTS = ITEMS.register("dragon_boots", ()-> new ArmorItem(ArmorTiers.DRAGONSCALE, EquipmentSlot.FEET, toolTab()));



    private static Item.Properties toolTab() {
        return new Item.Properties();
    }

    public static class ModTiers {
        public static final Tier WOOD = TierSortingRegistry.registerTier(new ForgeTier(0, 10, 0.4f, 0.0f, 2, null, () -> Ingredient.EMPTY),
                new ResourceLocation(ExtendedCraft.MODID, "wood"), List.of(Tiers.WOOD), List.of());
        public static final Tier STONE = TierSortingRegistry.registerTier(new ForgeTier(1, 50, 1.0f, 0.0f, 5, null, () -> Ingredient.EMPTY),
                new ResourceLocation(ExtendedCraft.MODID, "stone"), List.of(ModTiers.WOOD), List.of());
        public static final Tier COPPER = TierSortingRegistry.registerTier(new ForgeTier(2, 150, 1.8f, 0.0f, 8, null, () -> Ingredient.EMPTY),
                new ResourceLocation(ExtendedCraft.MODID, "copper"), List.of(ModTiers.STONE), List.of());
        public static final Tier IRON = TierSortingRegistry.registerTier( new ForgeTier(2, 250, 3.9f, 0.0f, 9, null, () -> Ingredient.EMPTY),
                new ResourceLocation(ExtendedCraft.MODID, "iron"), List.of(ModTiers.COPPER), List.of());
        public static final Tier GOLD = TierSortingRegistry.registerTier( new ForgeTier(3, 450, 5.4f, 0.0f, 11, null, () -> Ingredient.EMPTY),
                new ResourceLocation(ExtendedCraft.MODID, "gold"), List.of(ModTiers.IRON), List.of());
        public static final Tier DIAMOND = TierSortingRegistry.registerTier( new ForgeTier(4, 1000, 6.7f, 0.0f, 14, null, () -> Ingredient.EMPTY),
                new ResourceLocation(ExtendedCraft.MODID, "diamond"), List.of(ModTiers.IRON), List.of());
        public static final Tier NETHERITE = TierSortingRegistry.registerTier( new ForgeTier(5, 2500, 7.9f, 0.0f, 17, Tags.Blocks.NEEDS_NETHER_TOOL, () -> Ingredient.EMPTY),
                new ResourceLocation(ExtendedCraft.MODID, "netherite"), List.of(ModTiers.IRON), List.of());

        public static final Tier KONIUM = TierSortingRegistry.registerTier(new ForgeTier(6, 7000, 10.0f, 0.0f, 20, Tags.Blocks.NEEDS_KONIUM_TOOL, () -> Ingredient.EMPTY),
                new ResourceLocation(ExtendedCraft.MODID, "konium"), List.of(Tiers.NETHERITE), List.of());

    }

    public static class ArmorTiers {
        public static final ArmorMaterial COPPER = new ModArmorMaterial("copper", 2, new int[]{1, 2, 2, 1}, 5, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> Ingredient.EMPTY);
        public static final ArmorMaterial CHAIN = new ModArmorMaterial("chain", 4, new int[]{2, 3, 3, 1}, 8, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0f, 0.0f, () -> Ingredient.EMPTY);
        public static final ArmorMaterial IRON = new ModArmorMaterial("iron", 8, new int[]{2, 3, 4, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.EMPTY);
        public static final ArmorMaterial GOLD = new ModArmorMaterial("gold", 64, new int[]{3, 4, 5, 2}, 11, SoundEvents.ARMOR_EQUIP_GOLD, 0.0f, 0.0f, () -> Ingredient.EMPTY);
        public static final ArmorMaterial DIAMOND = new ModArmorMaterial("diamond", 128, new int[]{3, 5, 6, 3}, 14, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0f, 0.0f, () -> Ingredient.EMPTY);
        public static final ArmorMaterial NETHERITE = new ModArmorMaterial("netherite", 256, new int[]{4, 6, 7, 3}, 17, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0f, 0.1f, () -> Ingredient.EMPTY);
        public static final ArmorMaterial KONIUM = new ModArmorMaterial("konium", 640, new int[]{4, 6, 8, 4}, 20, SoundEvents.WARDEN_ROAR, 4.0f, 0.5f, () -> Ingredient.EMPTY);
        public static final ArmorMaterial DRAGONSCALE = new ModArmorMaterial("dragonscale", 720, new int[]{5, 7, 8, 5}, 25, SoundEvents.ENDER_DRAGON_GROWL, 5.0f, 1.0f, () -> Ingredient.EMPTY);
    }

    public static void addCreative(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() == ExtendedCraft.CreativeTab.EXTCTAB){
            event.accept(KONIUM.get());
            event.accept(REFINED_KONIUM.get());
            event.accept(STAR_SHARD.get());
            event.accept(DRAGON_SCALE.get());
            event.accept(BlockInit.TOOL_UPGRADE_STATION.get());
            event.accept(BlockInit.KONIUMBLOCK.get());
            event.accept(BlockInit.KONIUMORE.get());
        }
        if(event.getTab() == ExtendedCraft.CreativeTab.EXTCTOOL){
            //wood
            event.accept(WOOD_SWORD.get());
            event.accept(WOOD_PICKAXE.get());
            event.accept(WOOD_SHOVEL.get());
            event.accept(WOOD_AXE.get());
            event.accept(WOOD_HOE.get());
            //stone
            event.accept(STONE_SWORD.get());
            event.accept(STONE_PICKAXE.get());
            event.accept(STONE_SHOVEL.get());
            event.accept(STONE_AXE.get());
            event.accept(STONE_HOE.get());
            //copper
            event.accept(COPPER_SWORD.get());
            event.accept(COPPER_PICKAXE.get());
            event.accept(COPPER_SHOVEL.get());
            event.accept(COPPER_AXE.get());
            event.accept(COPPER_HOE.get());
            //iron
            event.accept(IRON_SWORD.get());
            event.accept(IRON_PICKAXE.get());
            event.accept(IRON_SHOVEL.get());
            event.accept(IRON_AXE.get());
            event.accept(IRON_HOE.get());
            //gold
            event.accept(GOLD_SWORD.get());
            event.accept(GOLD_PICKAXE.get());
            event.accept(GOLD_SHOVEL.get());
            event.accept(GOLD_AXE.get());
            event.accept(GOLD_HOE.get());
            //diamond
            event.accept(DIAMOND_SWORD.get());
            event.accept(DIAMOND_PICKAXE.get());
            event.accept(DIAMOND_SHOVEL.get());
            event.accept(DIAMOND_AXE.get());
            event.accept(DIAMOND_HOE.get());
            //netherite
            event.accept(NETHERITE_SWORD.get());
            event.accept(NETHERITE_PICKAXE.get());
            event.accept(NETHERITE_SHOVEL.get());
            event.accept(NETHERITE_AXE.get());
            event.accept(NETHERITE_HOE.get());
            //konium
            event.accept(KONIUM_SWORD.get());
            event.accept(KONIUM_PICKAXE.get());
            event.accept(KONIUM_SHOVEL.get());
            event.accept(KONIUM_AXE.get());
            event.accept(KONIUM_HOE.get());

        }
        if(event.getTab() == ExtendedCraft.CreativeTab.EXTCARMOR){
            //copper
            event.accept(COPPER_HELMET.get());
            event.accept(COPPER_CHESTPLATE.get());
            event.accept(COPPER_LEGGINGS.get());
            event.accept(COPPER_BOOTS.get());
            //chain
            event.accept(CHAIN_HELMET.get());
            event.accept(CHAIN_CHESTPLATE.get());
            event.accept(CHAIN_LEGGINGS.get());
            event.accept(CHAIN_BOOTS.get());
            //iron
            event.accept(IRON_HELMET.get());
            event.accept(IRON_CHESTPLATE.get());
            event.accept(IRON_LEGGINGS.get());
            event.accept(IRON_BOOTS.get());
            //gold
            event.accept(GOLD_HELMET.get());
            event.accept(GOLD_CHESTPLATE.get());
            event.accept(GOLD_LEGGINGS.get());
            event.accept(GOLD_BOOTS.get());
            //diamond
            event.accept(DIAMOND_HELMET.get());
            event.accept(DIAMOND_CHESTPLATE.get());
            event.accept(DIAMOND_LEGGINGS.get());
            event.accept(DIAMOND_BOOTS.get());
            //netherite
            event.accept(NETHERITE_HELMET.get());
            event.accept(NETHERITE_CHESTPLATE.get());
            event.accept(NETHERITE_LEGGINGS.get());
            event.accept(NETHERITE_BOOTS.get());
            //konium
            event.accept(KONIUM_HELMET.get());
            event.accept(KONIUM_CHESTPLATE.get());
            event.accept(KONIUM_LEGGINGS.get());
            event.accept(KONIUM_BOOTS.get());
            //dragon
            event.accept(DRAGON_HELMET.get());
            event.accept(DRAGON_CHESTPLATE.get());
            event.accept(DRAGON_LEGGINGS.get());
            event.accept(DRAGON_BOOTS.get());

        }
    }


}
