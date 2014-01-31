package com.eiscube.hungergames.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.eiscube.hungergames.blocks.MatPile.BlockMatPile;
import com.eiscube.hungergames.items.ItemHG;
import com.eiscube.hungergames.lib.ID;
import com.eiscube.hungergames.lib.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockHG {

	public static Block hgreedBlock;
	public static Block weakStickGroundBlock;
	public static Block heavyStickGroundBlock;
	public static Block weakStickTreeBlock;
	public static Block heavyStickTreeBlock;
	public static Block tinderBlock;
	public static Block hgironoreBlock;
	
	public static Block matPileBlock;
	
	public static Block mudFluidBlock;
	public static Fluid mudFluid;
	public static Material mudMaterial;
	
	public static void load(){
		
		hgreedBlock = new BlockHungerGamesReed(ID.BockReed_ID).setUnlocalizedName("hgreedBlock");
		registerBlock(hgreedBlock,"Reed Block");
		
		hgironoreBlock = new BlockHungerGamesIronOre(ID.BlockIronOre_ID).setUnlocalizedName("hgironoreBlock");
        registerBlock(mudFluidBlock,"Mud");
        
        weakStickGroundBlock = new BlockStickSapling(ID.BlockWeakStick_ID,ItemHG.weakstickItem.itemID).setUnlocalizedName("weakStickBlock");
        registerBlock(weakStickGroundBlock,"Weak Sapling");
        heavyStickGroundBlock = new BlockStickSapling(ID.BlockHeavyStick_ID,ItemHG.heavystickItem.itemID).setUnlocalizedName("heavyStickBlock");
        registerBlock(heavyStickGroundBlock,"Heavy Sapling");
        weakStickTreeBlock = new BlockStickBranch(ID.BlockWeakTreeStick_ID,ItemHG.weakstickItem).setUnlocalizedName("weakStickTreeBlock");
        registerBlock(weakStickTreeBlock,"Weak Branch");
        heavyStickTreeBlock = new BlockStickBranch(ID.BlockHeavyTreeStick_ID,ItemHG.heavystickItem).setUnlocalizedName("heavyStickTreeBlock");
        registerBlock(heavyStickTreeBlock,"Heavy Branch");
       /* Adding it later if i am more skilled then
        Block matPileBlockSharpstone1 = new BlockMatPile(ID.BlockMatPileSharpstone_ID,1,ItemHG.sharpstoneItem.itemID).setUnlocalizedName("matPileSharpstone1Block");
        registerBlock(matPileBlockSharpstone1,"MatPile Block");
        */
        tinderBlock = new BlockTinder(ID.BlockTinder_ID).setUnlocalizedName("tinderBlock");
        registerBlock(tinderBlock,"Tinder");
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
