package com.junipergroup.extc;

import com.junipergroup.extc.base.Tags;
import com.junipergroup.extc.block.entity.ModBlockEntities;
import com.junipergroup.extc.init.BlockInit;
import com.junipergroup.extc.init.ItemIni;
import com.junipergroup.extc.recipe.ModRecipes;
import com.junipergroup.extc.screen.ModMenuTypes;
import com.junipergroup.extc.screen.ToolUpgradeStationScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.jline.utils.Log;


@Mod(ExtendedCraft.MODID)
public class ExtendedCraft
{
    public static final String MODID = "extc";
    public static final Logger logger = LogManager.getLogger(ExtendedCraft.MODID);

    public ExtendedCraft(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemIni.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        ModBlockEntities.register(bus);
        ModMenuTypes.register(bus);
        bus.addListener(this::addCreative);
        ModRecipes.register(bus);


        System.out.println("--------------------------------------------------------");
        Log.info(Tags.Blocks.NEEDS_KONIUM_TOOL.location().toString());
        MinecraftForge.EVENT_BUS.register(this);

    }


    @Mod.EventBusSubscriber(modid = ExtendedCraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class CreativeTab{
        public static CreativeModeTab EXTCTAB;
        public static CreativeModeTab EXTCTOOL;
        public static CreativeModeTab EXTCARMOR;
        @SubscribeEvent
        public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
            EXTCTAB = event.registerCreativeModeTab(new ResourceLocation(ExtendedCraft.MODID, "extctab"),
                    builder -> builder.icon(() -> new ItemStack(ItemIni.REFINED_KONIUM.get())).title(Component.literal("ExtendedCraft Tab")).build());
            EXTCTOOL = event.registerCreativeModeTab(new ResourceLocation(ExtendedCraft.MODID, "extc_tools"),
                    builder -> builder.icon(() -> new ItemStack(ItemIni.KONIUM_AXE.get())).title(Component.literal("ExtendedCraft Tools")).build());
            EXTCARMOR = event.registerCreativeModeTab(new ResourceLocation(ExtendedCraft.MODID, "extc_armor"),
                    builder -> builder.icon(() -> new ItemStack(ItemIni.KONIUM_HELMET.get())).title(Component.literal("ExtendedCraft Armor")).build());

        }
    }
    private void addCreative(CreativeModeTabEvent.BuildContents event){
        ItemIni.addCreative(event);
    }



    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            MenuScreens.register(ModMenuTypes.TOOL_UPGRADE_STATION_MENU.get(), ToolUpgradeStationScreen::new);
        }
    }

}
