package com.junipergroup.extc.screen;

import com.junipergroup.extc.ExtendedCraft;
import com.junipergroup.extc.block.entity.ToolUpgradeStationBlockEntity;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.CraftingScreen;
import net.minecraft.client.gui.screens.inventory.FurnaceScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.Timer;
import java.util.TimerTask;

public class ToolUpgradeStationScreen extends AbstractContainerScreen<ToolUpgradeStationMenu> {
    int p = 0;
    int tks = 0;
    private static final ResourceLocation TEXTURE = new ResourceLocation(ExtendedCraft.MODID, "textures/gui/tool_upgrade_station_gui.png");

    public ToolUpgradeStationScreen(ToolUpgradeStationMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
    }

    @Override
    protected  void init(){
        super.init();


    }

    @Override
    protected void renderBg(PoseStack pStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        RenderSystem.setShaderTexture(0, TEXTURE);

        this.blit(pStack, x, y, 0, 0, imageWidth, imageHeight);
        this.titleLabelX = 70;
        this.titleLabelY = 7;
        this.inventoryLabelY = 75;
        blit(pStack, x+48, y+36, 176, p, 16, 16);






    }




    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {

        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
        if(p >= 64 && tks > 20){
            p = 0;
            tks = 0;
        } else if (tks > 20) {
            p+=16;
            tks = 0;
        }
        tks++;
    }

}
