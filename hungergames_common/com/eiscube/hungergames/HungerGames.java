package com.eiscube.hungergames;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.eiscube.hungergames.blocks.BlockHG;
import com.eiscube.hungergames.crafting.Recipes;
import com.eiscube.hungergames.items.ItemHG;
import com.eiscube.hungergames.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class HungerGames {
	
	public static final String modid = Reference.MOD_ID;
	
	public static Item ironhookItem;	//material for an Ropehook
	
	public static Item reedlianebowItem; //bow II|I
	public static Item reedplantbowItem; //bow II|II
	public static Item reedropebowItem;	 //bow II|III
	public static Item reedbowItem;		 //bow II|IV
	public static Item heavylianebowItem;//bow III|I
	public static Item heavyplantbowItem;//bow III|II
	public static Item heavyropebowItem; //bow III|III
	public static Item heavybowItem;	 //bow III|IV
	public static Item ironplantbowItem; //bow IV|II
	public static Item ironropebowItem;	 //bow IV|III
	public static Item ironbowItem;		 //bow IV|IV
	
	public static CreativeTabs tabHungerGames;

	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
		tabHungerGames = new CreativeTabs("PHG"){
			@SideOnly(Side.CLIENT)
			public int getTabIconItemIndex(){
				return ItemHG.entchantedstoneItem.itemID;
			}
		};
		
		LanguageRegistry.instance().addStringLocalization(tabHungerGames.getTranslatedTabLabel(),"Project HungerGames");
		
		BlockHG.load();
		
		ItemHG.load();

		Recipes.loadRecipes();
		
	}

}
