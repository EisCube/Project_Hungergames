package com.eiscube.hungergames.blocks;

import com.eiscube.hungergames.HungerGames;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockFluidMud extends BlockFluidClassic {

    public BlockFluidMud(int id) {
        super(id, BlockHG.mudFluid, Material.water);
        this.setCreativeTab(HungerGames.tabHungerGamesFood);
        this.setTextureName(HungerGames.modid + ":" + (this.getUnlocalizedName().substring(5)));
        this.setDensity(10000);
    }

}
