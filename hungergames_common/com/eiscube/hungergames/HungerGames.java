package com.eiscube.hungergames;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

import com.eiscube.hungergames.blocks.BlockTest;
import com.eiscube.hungergames.crafting.Recipes;
import com.eiscube.hungergames.items.ItemChisel;
import com.eiscube.hungergames.items.ItemDiamondcutter;
import com.eiscube.hungergames.items.ItemEnchantedstone;
import com.eiscube.hungergames.items.ItemHammer;
import com.eiscube.hungergames.items.ItemKnife;
import com.eiscube.hungergames.items.ItemHG;
import com.eiscube.hungergames.items.ItemSaw;
import com.eiscube.hungergames.items.ItemSharpstone;
import com.eiscube.hungergames.items.ItemTest;
import com.eiscube.hungergames.items.ItemToolbox;
import com.eiscube.hungergames.items.ItemWrench;
import com.eiscube.hungergames.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

// kekse

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class HungerGames {
	
	public static final String modid = Reference.MOD_ID;
	
	public static Block testBlock;
	
	public static Item ironhookItem;	//material for an Ropehook
	
	public static Item weakstickItem;	//stick 0
	public static Item reedstickItem;	//stick I
	public static Item heavystickItem;	//stick II
	public static Item ironstick;		//stick III
	
	public static Item lianeItem;		//rope 0
	public static Item planfibreItem;	//rope I
	public static Item ropeItem;		//rope II
	public static Item bowstring;		//rope III (bow)
	
	public static Item weaklianebowItem; //bow I|I
	public static Item weakplantbowItem; //bow I|II
	public static Item weakropebowItem;  //bow I|III
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
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		testBlock = new BlockTest(500, Material.rock).setUnlocalizedName("testBlock");
		GameRegistry.registerBlock(testBlock,Reference.MOD_ID + "_" + testBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(testBlock, "Test Block");
		
		ItemHG.load();

		Recipes.loadRecipes();
	}

}
