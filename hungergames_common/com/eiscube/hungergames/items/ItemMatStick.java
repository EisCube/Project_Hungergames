package com.eiscube.hungergames.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.eiscube.hungergames.HungerGames;
import com.eiscube.hungergames.blocks.BlockHG;
import com.eiscube.hungergames.lib.ID;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMatStick extends Item {

	public ItemMatStick(int par1) {
		super(par1);
		this.setCreativeTab(HungerGames.tabHungerGamesMaterial);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    this.itemIcon = par1IconRegister.registerIcon(HungerGames.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

	/*
	 * It needs to check on which side the player attempts to place the block (WIP)
	 */
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {
    	if(world.getBlockId(x, y, z) == 0){
    		return false;
    	}
        if(world.isBlockOpaqueCube(x, y, z) == true && world.isAirBlock(x, y+1, z) == true )
        {
        	if(this.itemID == ID.ItemWeakstick_ID)
        	{
        		world.setBlock(x, y+1, z, BlockHG.matPileBlockWeakstick1.blockID);
        	}
        	else if(this.itemID == ID.ItemHeavystick_ID)
        	{
        		world.setBlock(x, y+1, z, BlockHG.matPileBlockHeavystick1.blockID);
        	}else
        	{
        		return false;
        	}
        }
        if(world.getBlockId(x, y, z) == BlockHG.matPileBlockWeakstick1.blockID){}
        return false;
    }
}
