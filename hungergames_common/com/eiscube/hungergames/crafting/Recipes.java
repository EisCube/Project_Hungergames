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
		
		GameRegistry.addRecipe(new ItemStack(ItemHG.sawItem), new Object[]{
			" XX","Y  ",'Y' ,new ItemStack(Item.stick),'X', new ItemStack(Item.ingotIron)
		});
	}

}
