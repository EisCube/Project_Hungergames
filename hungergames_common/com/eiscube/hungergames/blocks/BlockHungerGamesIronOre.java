package com.eiscube.hungergames.blocks;

import com.eiscube.hungergames.HungerGames;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHungerGamesIronOre extends Block {

	public BlockHungerGamesIronOre(int par1) {
		super(par1,Material.rock);
		this.setCreativeTab(HungerGames.tabHungerGamesFood);
	}

}
