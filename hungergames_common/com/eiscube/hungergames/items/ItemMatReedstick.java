package com.eiscube.hungergames.items;

import com.eiscube.hungergames.HungerGames;
import com.eiscube.hungergames.blocks.BlockHG;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;

public class ItemMatReedstick extends ItemReed {

	public ItemMatReedstick(int par1) {
		super(par1, BlockHG.hgreedBlock);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon(HungerGames.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
