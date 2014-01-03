package com.eiscube.hungergames.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

import com.eiscube.hungergames.*;

public class ItemHG {
	
	
	public static Item testItem;
	public static Item sharpstoneItem;	   //crafting item 0
	public static Item knifeItem;		   //crafting item I
	public static Item sawItem;			   //crafting item II (wood)
	public static Item chiselItem;		   //crafting item III (stone)
	public static Item hammerItem;		   //crafting item IV (metall)
	public static Item wrenchItem;		   //crafting item VI (technologie)
	public static Item entchantedstoneItem;//crafting item VII (magic)
	public static Item toolboxItem;		   //crafting item SPECIAL
	public static Item diamondcutterItem;  //crafting item FINAL (diamond)
	
	public static Item sandwichItem;	   //food ca30% sat II
	
	
	public static EnumToolMaterial PHG_Knife = EnumHelper.addToolMaterial("Knife", 0, 25, 1.0F,-1.5F, 0); // 3 Schaden 25 uses
	public static EnumToolMaterial PHG_Sharpstone = EnumHelper.addToolMaterial("Knife", 0, 10, 1.0F,-1.5F, 0); // 3 Schaden 10 uses
	public static EnumToolMaterial PHG_Diamondcutter = EnumHelper.addToolMaterial("Diamondcutter", 1, 100, 2.0F, 0.5F, 0); // 6 Schaden 100 uses
	public static EnumToolMaterial PHG_Tool = EnumHelper.addToolMaterial("Tool", 0, 50, 1.0F, -2.0F, 0);  // 2 Schaden 50 uses
	
	public static void load()
	{
		
		testItem = new ItemTest(5000).setUnlocalizedName("testItem");
		LanguageRegistry.addName(testItem,"Test Item");
		
		sharpstoneItem = new ItemSharpstone(5001,PHG_Sharpstone).setUnlocalizedName("sharpstoneItem");
		LanguageRegistry.addName(sharpstoneItem,"Sharpstone");
		
		knifeItem = new ItemKnife(5002,PHG_Knife).setUnlocalizedName("knifeItem");
		LanguageRegistry.addName(knifeItem,"Knife");
		
		sawItem = new ItemSaw(5003,PHG_Tool).setUnlocalizedName("sawItem");
		LanguageRegistry.addName(sawItem,"Saw");
		
		chiselItem = new ItemChisel(5004,PHG_Tool).setUnlocalizedName("chiselItem");
		LanguageRegistry.addName(chiselItem,"Chisel");
		
		hammerItem = new ItemHammer(5005).setUnlocalizedName("hammerItem");
		LanguageRegistry.addName(hammerItem,"Hammer");
		
		wrenchItem = new ItemWrench(5006).setUnlocalizedName("wrenchItem");
		LanguageRegistry.addName(wrenchItem,"Wrench");
		
		entchantedstoneItem = new ItemEnchantedstone(5007).setUnlocalizedName("entchantedstoneItem");
		LanguageRegistry.addName(entchantedstoneItem,"Magic Stone");
		
		toolboxItem = new ItemToolbox(5008).setUnlocalizedName("toolboxItem");
		LanguageRegistry.addName(toolboxItem,"Toolbox");
		
		diamondcutterItem = new ItemDiamondcutter(5009,PHG_Diamondcutter).setUnlocalizedName("diamondcutterItem");
		LanguageRegistry.addName(diamondcutterItem,"Diamondcutter");
		
		//food
		sandwichItem = new ItemFoodSanwich(5010,6,10.5F,false).setUnlocalizedName("sandwichItem");
		LanguageRegistry.addName(sandwichItem, "Sanwiche");
		
	}

}
