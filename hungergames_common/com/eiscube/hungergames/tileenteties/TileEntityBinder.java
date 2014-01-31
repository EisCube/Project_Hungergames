package com.eiscube.hungergames.tileenteties;

import com.eiscube.hungergames.items.ItemHG;
import com.eiscube.hungergames.renderer.RendererMatPile;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityBinder {

	@SideOnly(Side.CLIENT)
	public void load()
	{
		GameRegistry.registerTileEntity(TileEntityMatPile_Sharpstone2.class,"MatPile");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMatPile_Sharpstone1.class, new RendererMatPile(1,ItemHG.sharpstoneItem.itemID));
		
		GameRegistry.registerTileEntity(TileEntityMatPile.class,"MatPile");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMatPile_Sharpstone2.class, new RendererMatPile(2,ItemHG.sharpstoneItem.itemID));
		
		GameRegistry.registerTileEntity(TileEntityMatPile.class,"MatPile");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMatPile_Sharpstone3.class, new RendererMatPile(3,ItemHG.sharpstoneItem.itemID));
		
		GameRegistry.registerTileEntity(TileEntityMatPile.class,"MatPile");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMatPile_Sharpstone1.class, new RendererMatPile(1,ItemHG.sharpstoneItem.itemID));
		
		GameRegistry.registerTileEntity(TileEntityMatPile.class,"MatPile");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMatPile_Sharpstone2.class, new RendererMatPile(2,ItemHG.sharpstoneItem.itemID));
		
		GameRegistry.registerTileEntity(TileEntityMatPile.class,"MatPile");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMatPile_Sharpstone3.class, new RendererMatPile(3,ItemHG.sharpstoneItem.itemID));
	}

	
}
