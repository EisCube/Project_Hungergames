package com.eiscube.hungergames.items;

import com.eiscube.hungergames.HungerGames;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;

public class ItemWeaponWeakropebow extends ItemWeaponWeaklianebow {

	public ItemWeaponWeakropebow(int par1,double Damage) {
		super(par1,Damage);
		this.setCreativeTab(HungerGames.tabHungerGames);
	}

}
