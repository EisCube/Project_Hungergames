package com.eiscube.hungergames.blocks;

import java.util.Random;

import com.eiscube.hungergames.HungerGames;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockStickBranch extends Block {

	private final Item itemDropped;
	
	public BlockStickBranch(int ID,Item dropped) {
		super(ID, Material.plants);
		this.setCreativeTab(HungerGames.tabHungerGamesFood);
		this.itemDropped=dropped;
	}
	
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.itemDropped.itemID;
    }
	
}
