package com.ETFONEHOME.modtest.init;

import java.util.ArrayList;
import java.util.List;

import com.ETFONEHOME.modtest.blocks.BlockBase;

import CustomModStuff.CustomEnergyCell;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// 	public static final Block ENERGY_TEST_BLOCK = new BlockBase("energy_test__block", Material.IRON);
	public static final Block ENERGY_TEST_BLOCK = new CustomEnergyCell("energy_test_block", Material.IRON);
	public static final Block JEWELED_NETHER_STAR_BLOCK = new JeweledNetherStarBlock("jeweled_nether_star_block", Material.IRON);

}
