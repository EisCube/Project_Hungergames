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
		this.setCreativeTab(HungerGames.tabHungerGames);
		this.itemDropped = idDropped;
	}
	
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return itemDropped;
    }
   
}
