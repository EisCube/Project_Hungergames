package com.eiscube.hungergames.items;

import com.eiscube.hungergames.HungerGames;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemWeaponSpike extends ItemSword {

	public ItemWeaponSpike(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(HungerGames.tabHungerGamesWeapons);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon(HungerGames.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

}
