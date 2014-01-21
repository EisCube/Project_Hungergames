package com.eiscube.hungergames.items;

import com.eiscube.hungergames.HungerGames;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//Short Description: Can be collected with sharpstone from Tindermushroomblocks. Is used in combination with Flintstone to make an onetime Tinderbox(wich will probaly fall back to an flintstone.  
//Pls work...
public class ItemTinder extends Item{
	public ItemTinder(int par1) {
		super(par1);
		this.setCreativeTab(HungerGames.tabHungerGames);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon(HungerGames.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
