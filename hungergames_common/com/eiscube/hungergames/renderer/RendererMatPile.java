package com.eiscube.hungergames.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.eiscube.hungergames.items.ItemHG;
import com.eiscube.hungergames.lib.Reference;
import com.eiscube.hungergames.models.MatPile1Model;
import com.eiscube.hungergames.models.MatPile2Model;
import com.eiscube.hungergames.models.MatPile3Model;
import com.eiscube.hungergames.models.ModelBaseExtended;

public class RendererMatPile extends TileEntitySpecialRenderer {
	
	public static ResourceLocation texture;//(new ResourceLocation(Reference.MOD_ID + ":" + "textures/items/sharpstoneItem.png"));
	
	private  ModelBaseExtended model;

	public RendererMatPile(int itemCount,int itemId){
		switch(itemCount)
		{
		case 1:this.model = new MatPile1Model();break;
		case 2:this.model = new MatPile2Model();break;
		case 3:this.model = new MatPile3Model();break;
		}
		if(itemId == ItemHG.sharpstoneItem.itemID){
			texture =(new ResourceLocation(Reference.MOD_ID + ":" + "textures/items/sharpstoneItem.png"));
		}
		if(itemId == ItemHG.weakstickItem.itemID){
			texture =(new ResourceLocation(Reference.MOD_ID + ":" + "textures/items/sharpstoneItem.png"));
		}
		if(itemId == ItemHG.heavystickItem.itemID){
			texture =(new ResourceLocation(Reference.MOD_ID + ":" + "textures/items/sharpstoneItem.png"));
		}
	}

	public void renderTileEntityAt(TileEntity tileentity,double x,double y,double z,float f)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		GL11.glRotatef(180, 0, 0, 1);
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		GL11.glPushMatrix();
		model.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

}
