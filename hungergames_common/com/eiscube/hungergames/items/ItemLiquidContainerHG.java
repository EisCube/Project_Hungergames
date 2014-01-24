package com.eiscube.hungergames.items;

import com.eiscube.hungergames.HungerGames;
import com.eiscube.hungergames.blocks.BlockHG;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemLiquidContainerHG extends Item {

    public ItemLiquidContainerHG(int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(HungerGames.tabHungerGames);
    }
    
    @Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(par2World, par3EntityPlayer, true);

        if (movingobjectposition == null)
        {
            return par1ItemStack;
        }
        else
        {
            if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
            {
                int i = movingobjectposition.blockX;
                int j = movingobjectposition.blockY;
                int k = movingobjectposition.blockZ;

                if (!par2World.canMineBlock(par3EntityPlayer, i, j, k))
                {
                    return par1ItemStack;
                }

                if (!par3EntityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1ItemStack))
                {
                    return par1ItemStack;
                }

                if (par2World.getBlockMaterial(i, j, k) == Material.water)
                {
                    --par1ItemStack.stackSize;

                    if (par1ItemStack.stackSize <= 0)
                    {
                        return new ItemStack(ItemHG.bottleItem);
                    }

                    if (!par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ItemHG.bottleItem)))
                    {
                        par3EntityPlayer.dropPlayerItem(new ItemStack(ItemHG.sharpstoneItem));
                    }
                }
                
                if (par2World.getBlockMaterial(i, j, k) == Material.water && par2World.getBlockId(i, j, k) == BlockHG.mudFluidBlock.blockID)
                {
                    --par1ItemStack.stackSize;

                    if (par1ItemStack.stackSize <= 0)
                    {
                        return new ItemStack(ItemHG.bottleItem);
                    }

                    if (!par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ItemHG.bottleItem)))
                    {
                        par3EntityPlayer.dropPlayerItem(new ItemStack(ItemHG.entchantedstoneItem));  // Warning only for testing! We will use metadata Items
                    }
                }
            }

            return par1ItemStack;
        }
    }

}
