package com.eiscube.hungergames.blocks;

import com.eiscube.hungergames.HungerGames;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BlockStick extends Block{

	public BlockStick(int id) {
		super(id,Material.plants);
		this.setCreativeTab(HungerGames.tabHungerGames);
	}
	
	@Override
    public int getRenderType()
    {
        return 1;
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
    
    public boolean canPlaceBlockAt(World world,int x,int y,int z){
        return super.canPlaceBlockAt(world, x, y, z) && canBlockStay(world, x, y, z);
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
