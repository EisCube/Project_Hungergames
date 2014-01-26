package com.eiscube.hungergames;

import java.io.IOException;

import net.minecraft.creativetab.CreativeTabs;

import com.eiscube.hungergames.blocks.BlockHG;
import com.eiscube.hungergames.crafting.Recipes;
import com.eiscube.hungergames.items.ItemHG;
import com.eiscube.hungergames.lib.Reference;
import com.eiscube.hungergames.renderer.RendererMatPile;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class HungerGames {
	
	public static final String modid = Reference.MOD_ID;
	
	public static CreativeTabs tabHungerGames;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)throws IOException{
	    
	    BlockHG.preInit();
	    
	}

	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
		tabHungerGames = new CreativeTabs("PHG"){
			@Override
			@SideOnly(Side.CLIENT)
			public int getTabIconItemIndex(){
				return ItemHG.entchantedstoneItem.itemID;
			}
		};
		
		LanguageRegistry.instance().addStringLocalization(tabHungerGames.getTranslatedTabLabel(),"Project HungerGames");
		
		GameRegistry.registerTileEntity(TileEntityMatPile.class,"MatPile");
		
		ItemHG.preload();
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMatPile.class, new RendererMatPile(2,ItemHG.sharpstoneItem.itemID));

		BlockHG.load();
		
		ItemHG.load();

		Recipes.loadRecipes();
		
	}

}
