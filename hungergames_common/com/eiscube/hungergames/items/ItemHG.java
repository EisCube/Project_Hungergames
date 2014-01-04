package com.eiscube.hungergames.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

import com.eiscube.hungergames.lib.ID;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemHG {
	
	
	public static Item weakstickItem;	//stick 0
	public static Item reedstickItem;	//stick I
	public static Item heavystickItem;	//stick II
	public static Item ironstickItem;	//stick III
	
	public static Item weakspikeItem;	//Spike 0
	public static Item reedspikeItem;	//Spike I
	public static Item heavyspikeItem;	//Spike II
	public static Item ironspikeItem;	//Spike III --- Stacheln für evt. Dornenpanzer?
	
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
	
	public static EnumToolMaterial PHG_Weakspike = EnumHelper.addToolMaterial("Weakspike", 0, 20, 1.0F,-2.5F, 0);
	public static EnumToolMaterial PHG_Reedspike = EnumHelper.addToolMaterial("Reedspike", 0, 25, 1.0F,-2.0F, 0);
	public static EnumToolMaterial PHG_Heavyspike = EnumHelper.addToolMaterial("Heavyspike", 0, 30, 1.0F,-1.5F, 0);
	public static EnumToolMaterial PHG_Ironspike = EnumHelper.addToolMaterial("Ironspike", 0, 50, 1.0F,-0.5F, 0);
	
	public static void load()
	{
		
		testItem = new ItemTest(4999).setUnlocalizedName("testItem");
		LanguageRegistry.addName(testItem,"Test Item");
		
		/*
		 *		Tools
		 */
		
		sharpstoneItem = new ItemSharpstone(ID.ItemSharpstone_ID,PHG_Sharpstone).setUnlocalizedName("sharpstoneItem");
		LanguageRegistry.addName(sharpstoneItem,"Sharpstone");
		
		knifeItem = new ItemKnife(ID.ItemKnife_ID,PHG_Knife).setUnlocalizedName("knifeItem");
		LanguageRegistry.addName(knifeItem,"Knife");
		
		sawItem = new ItemSaw(ID.ItemSaw_ID,PHG_Tool).setUnlocalizedName("sawItem");
		LanguageRegistry.addName(sawItem,"Saw");
		
		chiselItem = new ItemChisel(ID.ItemChisel_ID,PHG_Tool).setUnlocalizedName("chiselItem");
		LanguageRegistry.addName(chiselItem,"Chisel");
		
		hammerItem = new ItemHammer(ID.ItemHammer_ID).setUnlocalizedName("hammerItem");
		LanguageRegistry.addName(hammerItem,"Hammer");
		
		wrenchItem = new ItemWrench(ID.ItemWrench_ID).setUnlocalizedName("wrenchItem");
		LanguageRegistry.addName(wrenchItem,"Wrench");
		
		entchantedstoneItem = new ItemEnchantedstone(ID.ItemEnchantedstone_ID).setUnlocalizedName("entchantedstoneItem");
		LanguageRegistry.addName(entchantedstoneItem,"Magic Stone");
		
		toolboxItem = new ItemToolbox(ID.ItemToolbox_ID).setUnlocalizedName("toolboxItem");
		LanguageRegistry.addName(toolboxItem,"Toolbox");
		
		diamondcutterItem = new ItemDiamondcutter(ID.ItemDiamondcutter_ID,PHG_Diamondcutter).setUnlocalizedName("diamondcutterItem");
		LanguageRegistry.addName(diamondcutterItem,"Diamondcutter");
		
		/*
		 * 		Food
		 */
		
		sandwichItem = new ItemFoodSandwich(ID.ItemSandwich_ID,6,10.5F,false).setUnlocalizedName("sandwichItem");
		LanguageRegistry.addName(sandwichItem, "Sanwiche");
		
		/*
		 * 		Material
		 */
		
		weakstickItem = new ItemMatWeakstick(ID.ItemWeakstick_ID).setUnlocalizedName("weakstickItem");
		LanguageRegistry.addName(weakstickItem, "Weak Stick");
		
		reedstickItem = new ItemMatReedstick(ID.ItemReedstick_ID).setUnlocalizedName("reedstickItem");
		LanguageRegistry.addName(reedstickItem, "Reedstick");
		
		heavystickItem = new ItemMatHeavystick(ID.ItemHeavystick_ID).setUnlocalizedName("heavystickItem");
		LanguageRegistry.addName(heavystickItem, "Heavy Stick");
		
		ironstickItem = new ItemMatIronstick(ID.ItemIronstick_ID).setUnlocalizedName("ironstickItem");
		LanguageRegistry.addName(ironstickItem, "Ironstick");
		
		/*
		 * 		Weapons
		 */
		
		//Spikes
		
		weakspikeItem = new ItemWeaponWeakspike(ID.ItemWeakspike_ID,PHG_Weakspike).setUnlocalizedName("weakspikeItem");
		LanguageRegistry.addName(weakspikeItem, "Spiky Weak Stick");
		
		reedspikeItem = new ItemWeaponReedspike(ID.ItemReedspike_ID,PHG_Reedspike).setUnlocalizedName("reedspikeItem");
		LanguageRegistry.addName(reedspikeItem, "Spiky Reedstick");
		
		heavyspikeItem = new ItemWeaponHeavyspike(ID.ItemHeavyspike_ID,PHG_Heavyspike).setUnlocalizedName("heavyspikeItem");
		LanguageRegistry.addName(heavyspikeItem, "Spiky Heavy Stick");
		
		ironspikeItem = new ItemWeaponIronspike(ID.ItemIronspike_ID,PHG_Ironspike).setUnlocalizedName("ironspikeItem");
		LanguageRegistry.addName(ironspikeItem, "Spiky  Ironstick");
		
	}

}
