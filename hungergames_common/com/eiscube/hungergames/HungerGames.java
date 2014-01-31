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
	
	public static CreativeTabs tabHungerGamesMaterial;
	public static CreativeTabs tabHungerGamesWeapons;
	public static CreativeTabs tabHungerGamesTools;
	public static CreativeTabs tabHungerGamesFood;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)throws IOException{
	    
	    BlockHG.preInit();
	    
	}

	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
		tabHungerGamesMaterial = new CreativeTabs("PHG_M"){
			@Override
			@SideOnly(Side.CLIENT)
			public int getTabIconItemIndex(){
				return ItemHG.heavystickItem.itemID;
			}
		};
		tabHungerGamesWeapons = new CreativeTabs("PHG_W"){
			@Override
			@SideOnly(Side.CLIENT)
			public int getTabIconItemIndex(){
				return ItemHG.knifeItem.itemID;
			}
		};
		tabHungerGamesTools = new CreativeTabs("PHG_T"){
			@Override
			@SideOnly(Side.CLIENT)
			public int getTabIconItemIndex(){
				return ItemHG.entchantedstoneItem.itemID;
			}
		};
		tabHungerGamesFood = new CreativeTabs("PHG_F"){
			@Override
			@SideOnly(Side.CLIENT)
			public int getTabIconItemIndex(){
				return ItemHG.sandwichItem.itemID;
			}
		};
		
		LanguageRegistry.instance().addStringLocalization(tabHungerGamesMaterial.getTranslatedTabLabel(),"Project HungerGames Materials");
		LanguageRegistry.instance().addStringLocalization(tabHungerGamesWeapons.getTranslatedTabLabel(),"Project HungerGames Weapons");
		LanguageRegistry.instance().addStringLocalization(tabHungerGamesTools.getTranslatedTabLabel(),"Project HungerGames Tools");
		LanguageRegistry.instance().addStringLocalization(tabHungerGamesFood.getTranslatedTabLabel(),"Project HungerGames Food");
		
		ItemHG.preload();

		BlockHG.load();
		
		ItemHG.load();

		Recipes.loadRecipes();
		
	}

}
