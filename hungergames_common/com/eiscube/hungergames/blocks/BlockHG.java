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
	
	public static Block matPileBlockWeakstick1;
	public static Block matPileBlockWeakstick2;
	public static Block matPileBlockWeakstick3;
	public static Block matPileBlockHeavystick1;
	public static Block matPileBlockHeavystick2;
	public static Block matPileBlockHeavystick3;
	
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
        
        Block matPileBlockSharpstone1 = new BlockMatPile(ID.BlockMatPileSharpstone1_ID,1,ItemHG.sharpstoneItem.itemID).setUnlocalizedName("matPileSharpstone1Block");
        registerBlock(matPileBlockSharpstone1,"MatPile Block");
        
        matPileBlockWeakstick1 = new BlockMatPile(ID.BlockMatPileWeakstick1_ID,1,ItemHG.weakstickItem.itemID).setUnlocalizedName("matPileWeakstick1Block");
        registerBlock(matPileBlockWeakstick1,"MatPile Block");
        matPileBlockWeakstick2 = new BlockMatPile(ID.BlockMatPileWeakstick2_ID,2,ItemHG.weakstickItem.itemID).setUnlocalizedName("matPileWeakstick2Block");
        registerBlock(matPileBlockWeakstick2,"MatPile Block");
        matPileBlockWeakstick3 = new BlockMatPile(ID.BlockMatPileWeakstick3_ID,3,ItemHG.weakstickItem.itemID).setUnlocalizedName("matPileWeakstick3Block");
        registerBlock(matPileBlockWeakstick3,"MatPile Block");
        matPileBlockHeavystick1 = new BlockMatPile(ID.BlockMatPileHeavystick1_ID,1,ItemHG.heavystickItem.itemID).setUnlocalizedName("matPileHeavystick1Block");
        registerBlock(matPileBlockHeavystick1,"MatPile Block");
        matPileBlockHeavystick2 = new BlockMatPile(ID.BlockMatPileWeakstick2_ID,2,ItemHG.heavystickItem.itemID).setUnlocalizedName("matPileHeavystick2Block");
        registerBlock(matPileBlockHeavystick2,"MatPile Block");
        matPileBlockHeavystick3 = new BlockMatPile(ID.BlockMatPileWeakstick3_ID,3,ItemHG.heavystickItem.itemID).setUnlocalizedName("matPileHeavystick3Block");
        registerBlock(matPileBlockHeavystick3,"MatPile Block");
        
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
