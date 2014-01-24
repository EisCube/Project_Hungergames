package com.eiscube.hungergames.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

import com.eiscube.hungergames.HungerGames;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDiamondcutter extends ItemSword {

	public ItemDiamondcutter(int par1,EnumToolMaterial mat ) {
		super(par1,mat);
		this.setCreativeTab(HungerGames.tabHungerGames);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon(HungerGames.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
