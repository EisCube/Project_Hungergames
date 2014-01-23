package com.eiscube.hungergames.blocks;

import com.eiscube.hungergames.HungerGames;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluidMud extends BlockFluidClassic {

    public BlockFluidMud(int id) {
        super(id, BlockHG.mudFluid, BlockHG.mudMaterial);
        this.setCreativeTab(HungerGames.tabHungerGames);
        this.setTextureName(HungerGames.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }

}
