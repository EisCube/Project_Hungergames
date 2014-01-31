package com.eiscube.hungergames.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import com.eiscube.hungergames.HungerGames;
import com.eiscube.hungergames.items.ItemHG;

public class BlockStickSapling extends BlockFlower{

	private int itemDropped;
	
	public BlockStickSapling(int id,int idDropped) {
		super(id);
		this.setCreativeTab(HungerGames.tabHungerGamesFood);
		this.itemDropped = idDropped;
		this.setBlockBounds(0 + (1/16), 0 + (1/16), 0 + (1/16), 1 - (1/16), 1 - (1/16), 1 - (1/16));
	}
	
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return itemDropped;
    }
   
}
