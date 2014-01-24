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
	public static Block weakStickBlock;    //I want the same block for an sapling thing and a branch thing (metadata Blocks)
	public static Block heavyStickBlock;
	public static Block tinderBlock;
	public static Block hgironoreBlock;
	
	public static Block mudFluidBlock;
	public static Fluid mudFluid;
	public static Material mudMaterial;
	
	public static void load(){
		
		hgreedBlock = new BlockHungerGamesReed(ID.BockReed_ID).setUnlocalizedName("hgreedBlock");
		registerBlock(hgreedBlock,"Reed Block");
		
		hgironoreBlock = new BlockHungerGamesIronOre(ID.BlockIronOre_ID).setUnlocalizedName("hgironoreBlock");
        registerBlock(mudFluidBlock,"Mud");
        
        weakStickBlock = new BlockStick(ID.BlockWeakStick_ID).setUnlocalizedName("weakStickBlock");
        registerBlock(weakStickBlock,"Weak Branch");
        heavyStickBlock = new BlockStick(ID.BlockHeavyStick_ID).setUnlocalizedName("heavyStickBlock");
        registerBlock(heavyStickBlock,"Heavy Branch");
        
	}
	

    public static void preInit() {
        
        mudFluid = new Fluid("mud").setBlockID(ID.FluidMud_ID);
        FluidRegistry.registerFluid(mudFluid);
   
        mudFluidBlock = new BlockFluidMud(ID.FluidMud_ID).setUnlocalizedName("mudFluidBlock");
    }
    
	
	private static void registerBlock(Block block,String name){
	       GameRegistry.registerBlock(block,Reference.MOD_ID + "_" + block.getUnlocalizedName().substring(5));
	        LanguageRegistry.addName(block, name);
	}
	
}
