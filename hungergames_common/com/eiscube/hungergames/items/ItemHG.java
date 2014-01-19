package com.eiscube.hungergames.items;

import net.minecraft.block.Block;
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
	
	public static Item ironchunkItem;
	
	public static Item weakspikeItem;	//Spike 0
	public static Item reedspikeItem;	//Spike I
	public static Item heavyspikeItem;	//Spike II
	public static Item ironspikeItem;	//Spike III --- Stacheln für evt. Dornenpanzer? --- STACHELFALLEN YEAH !!!
	
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
	
	public static Item lianeItem;		//rope 0
	public static Item planfibreItem;	//rope I
	public static Item ropeItem;		//rope II
	public static Item bowstringItem;		//rope III (bow)
	
	
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
		
		//Sticks
		
		weakstickItem = new ItemMatWeakstick(ID.ItemWeakstick_ID).setUnlocalizedName("weakstickItem");
		LanguageRegistry.addName(weakstickItem, "Weak Stick");
		
		reedstickItem = new ItemMatReedstick(ID.ItemReedstick_ID).setUnlocalizedName("reedstickItem");
		LanguageRegistry.addName(reedstickItem, "Reedstick");
		
		heavystickItem = new ItemMatHeavystick(ID.ItemHeavystick_ID).setUnlocalizedName("heavystickItem");
		LanguageRegistry.addName(heavystickItem, "Heavy Stick");
		
		ironstickItem = new ItemMatIronstick(ID.ItemIronstick_ID).setUnlocalizedName("ironstickItem");
		LanguageRegistry.addName(ironstickItem, "Ironstick");
		
		//Misc.
		
		ironchunkItem = new ItemMatIronchunk(ID.ItemIronChunk_ID).setUnlocalizedName("ironchunkItem");
		LanguageRegistry.addName(ironchunkItem, "Iron Chunk");
		
		//Ropes
		
		lianeItem = new ItemMatLiane(ID.ItemLiane_ID).setUnlocalizedName("lianeItem");
		LanguageRegistry.addName(lianeItem, "Liane");
		
		planfibreItem = new ItemMatPlantfibre(ID.ItemPlantfibre_ID).setUnlocalizedName("planfibreItem");
		LanguageRegistry.addName(planfibreItem, "Plantfibre");
		
		ropeItem = new ItemMatRope(ID.ItemRope_ID).setUnlocalizedName("ropeItem");
		LanguageRegistry.addName(ropeItem, "Rope");
		
		bowstringItem = new ItemMatBowstring(ID.ItemBowstring_ID).setUnlocalizedName("bowstringItem");
		LanguageRegistry.addName(bowstringItem, "Bowstring");
		
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
		
		//Bows weak ...
		
		weaklianebowItem = new ItemWeaponBow(ID.ItemWeaklianeBow_ID, 0.5 ).setUnlocalizedName("weaklianebowItem");
		LanguageRegistry.addName(weaklianebowItem, "Weak Liane Bow");
		
		weakplantbowItem = new ItemWeaponBow(ID.ItemWeakplantBow_ID,1.0D).setUnlocalizedName("weakplantbowItem");
		LanguageRegistry.addName(weakplantbowItem, "Weak Plantfibre Bow");
		
		weakropebowItem = new ItemWeaponBow(ID.ItemWeakropeBow_ID,1.5D).setUnlocalizedName("weakropebowItem");
		LanguageRegistry.addName(weakropebowItem, "Weak Rope Bow");
		
		reedlianebowItem = new ItemWeaponBow(ID.ItemReedlianeBow_ID, 1.5D).setUnlocalizedName("reedlianebowItem");
		LanguageRegistry.addName(reedlianebowItem, "Reed Liane Bow");
		
		reedplantbowItem = new ItemWeaponBow(ID.ItemReedplantBow_ID,2.0D).setUnlocalizedName("reedplantbowItem");
		LanguageRegistry.addName(reedplantbowItem, "Reed Plantfibre Bow");
		
		reedropebowItem = new ItemWeaponBow(ID.ItemReedropeBow_ID,2.5D).setUnlocalizedName("reedropebowItem");
		LanguageRegistry.addName(reedropebowItem, "Reed Rope Bow");
		
		reedbowItem = new ItemWeaponBow(ID.ItemReedBow_ID,2.5D).setUnlocalizedName("reedbowItem");
		LanguageRegistry.addName(reedbowItem, "Reed Bow");
		
		heavylianebowItem = new ItemWeaponBow(ID.ItemHeavylianeBow_ID, 2.5D).setUnlocalizedName("heavylianebowItem");
		LanguageRegistry.addName(heavylianebowItem, "Heavy Liane Bow");
		
		heavyplantbowItem = new ItemWeaponBow(ID.ItemHeavyplantBow_ID,3.0D).setUnlocalizedName("heavyplantbowItem");
		LanguageRegistry.addName(heavyplantbowItem, "Heavy Plantfibre Bow");
		
		heavyropebowItem = new ItemWeaponBow(ID.ItemHeavyropeBow_ID,3.5D).setUnlocalizedName("heavyropebowItem");
		LanguageRegistry.addName(heavyropebowItem, "Heavy Rope Bow");
		
		heavybowItem = new ItemWeaponBow(ID.ItemHeavyBow_ID,4.0D).setUnlocalizedName("heavybowItem");
		LanguageRegistry.addName(heavybowItem, "Heavy Bow");
		
		ironplantbowItem = new ItemWeaponBow(ID.ItemIronplantBow_ID,4.0D).setUnlocalizedName("ironplantbowItem");
		LanguageRegistry.addName(ironplantbowItem, "Iron Plantfibre Bow");
		
		ironropebowItem = new ItemWeaponBow(ID.ItemIronropeBow_ID,4.5D).setUnlocalizedName("ironropebowItem");
		LanguageRegistry.addName(ironropebowItem, "Iron Rope Bow");
		
		ironbowItem = new ItemWeaponBow(ID.ItemIronBow_ID,5.0D).setUnlocalizedName("ironbowItem");
		LanguageRegistry.addName(ironbowItem, "Iron Bow");
	}

}
