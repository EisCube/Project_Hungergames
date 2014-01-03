package com.eiscube.hungergames.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTest extends Block {

	public BlockTest(int pId, Material pMaterial) {
		super(pId, pMaterial);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

}
