package com.eiscube.hungergames.blocks;

import net.minecraft.block.Block;

import com.eiscube.hungergames.lib.ID;
import com.eiscube.hungergames.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHG {

	public static Block hgreedBlock;
	
	public static void load(){
		
		hgreedBlock = new BlockHungerGamesReed(ID.BockReed_ID).setUnlocalizedName("hg-reedBlock");
		GameRegistry.registerBlock(hgreedBlock,Reference.MOD_ID + "_" + hgreedBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(hgreedBlock, "Reed Block");
		
	}
	
}
