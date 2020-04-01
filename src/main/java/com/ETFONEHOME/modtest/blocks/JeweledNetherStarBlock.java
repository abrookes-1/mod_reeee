package com.ETFONEHOME.modtest.init;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class JeweledNetherStarBlock extends BlockBase 
{

    public JeweledNetherStarBlock(String name, Material material) 
    {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(7.0F);
    }
    
}
