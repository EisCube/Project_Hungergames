package com.eiscube.hungergames.blocks;

import com.eiscube.hungergames.HungerGames;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockStick extends Block {

	public BlockStick(int id) {
		super(id,Material.wood);
		this.setCreativeTab(HungerGames.tabHungerGames);
	}

}
