package com.eiscube.hungergames.blocks;

import com.eiscube.hungergames.HungerGames;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMatPile extends BlockContainer {

	private final int itemID;
	private int itemCount;
	
	protected BlockMatPile(int id,int itemID) {
		super(id,Material.wood);
		this.setCreativeTab(HungerGames.tabHungerGames);
		this.itemID = itemID;
		this.itemCount = 1;
	}
	
	public int getRenderType(){
		return -1;
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
	public boolean renderAsNormalBlock(){
		return false;
	}

	public TileEntity createNewTileEntity(World world) {
		return new TileEntityMatPile();
	}

}
