package com.eiscube.hungergames.blocks;

import java.util.Random;

import com.eiscube.hungergames.HungerGames;
import com.eiscube.hungergames.items.ItemHG;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockReed;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.IPlantable;

public class BlockHungerGamesReed extends BlockReed implements IPlantable {

	protected BlockHungerGamesReed(int par1) {
		super(par1);
		
		/*
		 * only for testing
		 */
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ItemHG.reedstickItem.itemID;
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    this.blockIcon = par1IconRegister.registerIcon(HungerGames.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}
	

}
