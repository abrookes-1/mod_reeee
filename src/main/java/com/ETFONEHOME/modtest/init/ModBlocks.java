package com.ETFONEHOME.modtest.init;

import java.util.ArrayList;
import java.util.List;

import com.ETFONEHOME.modtest.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ENERGY_TEST_BLOCK = new BlockBase("energy_test__block", Material.IRON);
}