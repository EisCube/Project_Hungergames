package com.eiscube.hungergames.blocks.MatPile;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.eiscube.hungergames.items.ItemHG;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile_Heavystick1;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile_Heavystick2;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile_Heavystick3;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile_Sharpstone1;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile_Sharpstone2;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile_Sharpstone3;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile_Weakstick1;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile_Weakstick2;
import com.eiscube.hungergames.tileenteties.TileEntityMatPile_Weakstick3;

public class BlockMatPile extends BlockContainer {
	
	private static int itemCount;
	private static int itemID;
	
	public BlockMatPile(int id,int itemCount,int itemID) {
		super(id,Material.wood);
		this.itemID = itemID;
		this.itemCount = itemCount;
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
		return tileEntityfromData(itemID,itemCount);
	}
	
	
	private TileEntity tileEntityfromData(int id,int count) {
		if(id == ItemHG.sharpstoneItem.itemID)
		{
			switch(count){
			case 1:return new TileEntityMatPile_Sharpstone1();
			case 2:return new TileEntityMatPile_Sharpstone2();
			case 3:return new TileEntityMatPile_Sharpstone3();
			default:return new TileEntityMatPile();
			}
		}
		
		if(id == ItemHG.weakstickItem.itemID)
		{
			switch(count){
			case 1:return new TileEntityMatPile_Weakstick1();
			case 2:return new TileEntityMatPile_Weakstick2();
			case 3:return new TileEntityMatPile_Weakstick3();
			default:return new TileEntityMatPile();
			}
		}
		
		if(id == ItemHG.heavystickItem.itemID)
		{
			switch(count){
			case 1:return new TileEntityMatPile_Heavystick1();
			case 2:return new TileEntityMatPile_Heavystick2();
			case 3:return new TileEntityMatPile_Heavystick3();
			default:return new TileEntityMatPile();
			}
		}
		
		return new TileEntityMatPile();
	}


}
