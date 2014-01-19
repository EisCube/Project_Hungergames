package com.eiscube.hungergames.items;

import com.eiscube.hungergames.HungerGames;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;

public class ItemWeaponWeakplantbow extends ItemWeaponWeaklianebow{

	public ItemWeaponWeakplantbow(int par1,double Damage) {
		super(par1,Damage);
		this.setCreativeTab(HungerGames.tabHungerGames);
	}

}
