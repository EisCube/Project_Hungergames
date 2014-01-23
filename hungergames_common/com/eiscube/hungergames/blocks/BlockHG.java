package com.eiscube.hungergames.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.eiscube.hungergames.lib.ID;
import com.eiscube.hungergames.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHG {

	public static Block hgreedBlock;
	
	public static Block hgironoreBlock;
	
	public static Block mudFluidBlock;
	public static Fluid mudFluid;
	public static Material mudMaterial;
	
	public static void load(){
		
		hgreedBlock = new BlockHungerGamesReed(ID.BockReed_ID).setUnlocalizedName("hgreedBlock");
		GameRegistry.registerBlock(hgreedBlock,Reference.MOD_ID + "_" + hgreedBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(hgreedBlock, "Reed Block");
		
		hgironoreBlock = new BlockHungerGamesIronOre(ID.BlockIronOre_ID).setUnlocalizedName("hgironoreBlock");
		
		mudFluid = new Fluid("mud").setBlockID(ID.FluidMud_ID);
		FluidRegistry.registerFluid(mudFluid);
		
		mudMaterial = new MaterialLiquid(MapColor.dirtColor);
		
		mudFluidBlock = new BlockFluidMud(ID.FluidMud_ID).setUnlocalizedName("mudFluidBlock");
		GameRegistry.registerBlock(mudFluidBlock,Reference.MOD_ID + "_" + mudFluidBlock.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(mudFluidBlock, "Mud");


	}
	
}
