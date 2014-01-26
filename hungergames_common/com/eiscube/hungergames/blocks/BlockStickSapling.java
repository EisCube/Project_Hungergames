package com.eiscube.hungergames.blocks;

import java.util.Random;

import com.eiscube.hungergames.HungerGames;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BlockStickSapling extends Block{

	private final Item itemDropped;
	
	public BlockStickSapling(int id,Item itemDropped) {
		super(id,Material.plants);
		this.setCreativeTab(HungerGames.tabHungerGames);
		this.itemDropped = itemDropped;
	}
	
	@Override
    public int getRenderType()
    {
        return 2;
    }
	
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.itemDropped.itemID;
    }
    
    public boolean canPlaceBlockAt(World world,int x,int y,int z){
        return super.canPlaceBlockAt(world, x, y, z) && canBlockStay(world, x, y, z);
    }
    
    public void onNeighborBlockChange(World world, int x, int y, int z, int par5)
    {
        super.onNeighborBlockChange(world, x, y, z, par5);
        this.checkChange(world, x, y, z);
    }
    
    public void updateTick(World world, int x, int y, int z, Random random){
    	checkChange(world, x, y, z);
    }
    
    public void checkChange(World world,int x,int y,int z){
    	if(!canBlockStay(world,x,y,z)){
    		//Drop a item
            world.setBlock(x, y, z, 0, 0, 2);
    	}
    }
    
    public boolean canBlockStay(World world, int x, int y, int z)
    {
    	Block ground = blocksList[world.getBlockId(x, y-1, z)];
    	
    	if(ground != null){
    		if((ground.blockID == Block.grass.blockID || ground.blockID == Block.dirt.blockID)){
    			return true;
    		}
    	}
    	
    	return false;
    	
    }
}
