package com.eiscube.hungergames.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.eiscube.hungergames.items.ItemHG;

import cpw.mods.fml.common.registry.GameRegistry;

// kekse

public class Recipes {
	
	public static void loadRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond), new Object[]{
			new ItemStack(Item.stick),new ItemStack(Block.dirt)
		});
		
		/*
		 * 		Spikes
		 */
		//weakspike
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.weakspikeItem),new Object[]{
			new ItemStack(ItemHG.weakstickItem),new ItemStack(ItemHG.sharpstoneItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.weakspikeItem),new Object[]{
			new ItemStack(ItemHG.weakstickItem),new ItemStack(ItemHG.knifeItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.weakspikeItem),new Object[]{
			new ItemStack(ItemHG.weakstickItem),new ItemStack(ItemHG.diamondcutterItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.toolboxItem),new Object[]{
			new ItemStack(ItemHG.weakstickItem),new ItemStack(ItemHG.sharpstoneItem)
		});
		
		//reedspike
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.reedspikeItem),new Object[]{
			new ItemStack(ItemHG.reedstickItem),new ItemStack(ItemHG.sharpstoneItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.reedspikeItem),new Object[]{
			new ItemStack(ItemHG.reedstickItem),new ItemStack(ItemHG.knifeItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.reedspikeItem),new Object[]{
			new ItemStack(ItemHG.reedstickItem),new ItemStack(ItemHG.diamondcutterItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.reedspikeItem),new Object[]{
			new ItemStack(ItemHG.reedstickItem),new ItemStack(ItemHG.toolboxItem)
		});
		
		//heavyspike
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.heavyspikeItem),new Object[]{
			new ItemStack(ItemHG.heavystickItem),new ItemStack(ItemHG.knifeItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.heavyspikeItem),new Object[]{
			new ItemStack(ItemHG.heavystickItem),new ItemStack(ItemHG.diamondcutterItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.heavyspikeItem),new Object[]{
			new ItemStack(ItemHG.heavystickItem),new ItemStack(ItemHG.toolboxItem)
		});
		
		//ironspike
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.ironspikeItem),new Object[]{
			new ItemStack(ItemHG.ironstickItem),new ItemStack(ItemHG.diamondcutterItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.ironspikeItem),new Object[]{
			new ItemStack(ItemHG.ironstickItem),new ItemStack(ItemHG.hammerItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.ironspikeItem),new Object[]{
			new ItemStack(ItemHG.ironstickItem),new ItemStack(ItemHG.toolboxItem)
		});
		
		/*
		 * 		Tools
		 */
		
		
		GameRegistry.addRecipe(new ItemStack(ItemHG.sawItem), new Object[]{
			"XYY",
			'X',Item.stick,'Y',Item.ingotIron
		});
		
		//Toolbox
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.toolboxItem),new Object[]{
			new ItemStack(ItemHG.knifeItem),new ItemStack(ItemHG.chiselItem),new ItemStack(ItemHG.hammerItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.toolboxItem,5),new Object[]{
			new ItemStack(ItemHG.sawItem),new ItemStack(ItemHG.entchantedstoneItem),new ItemStack(ItemHG.wrenchItem)
		});
		
		//Ironstick
		
		//Tinderbox
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.tinderboxItem), new Object[]{
			new ItemStack(ItemHG.tinderItem), new ItemStack(Item.flint)});
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.ironstickItem),new Object[]{
			new ItemStack(ItemHG.ironchunkItem),new ItemStack(ItemHG.hammerItem)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemHG.ironstickItem),new Object[]{
			new ItemStack(ItemHG.ironchunkItem),new ItemStack(ItemHG.toolboxItem)
		});
	
	}

}
