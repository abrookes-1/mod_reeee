package com.ETFONEHOME.modtest.init;

import java.util.ArrayList;
import java.util.List;

import com.ETFONEHOME.modtest.items.ItemBase;
import com.ETFONEHOME.modtest.items.tools.ToolHoe;
import com.ETFONEHOME.modtest.items.tools.ToolPickaxe;
import com.ETFONEHOME.modtest.items.tools.ToolSpade;
import com.ETFONEHOME.modtest.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Mats
	public static final ToolMaterial MATERIAL_JEWELED_NETHER_STAR = EnumHelper.addToolMaterial("matreal_jeweled_nether_star", 3, -1, 64.0F, 5.0F, 10);
	
	//Items
	public static final Item JEWELED_NETHER_STAR = new ItemBase ("jeweled_nether_star");
	
	//Tools
	public static final ItemSword JEWELED_NETHER_STAR_SWORD = new ToolSword ("jeweled_nether_star_sword", MATERIAL_JEWELED_NETHER_STAR);
	public static final ItemSpade JEWELED_NETHER_STAR_SPADE = new ToolSpade ("jeweled_nether_star_spade", MATERIAL_JEWELED_NETHER_STAR);
	public static final ItemPickaxe JEWELED_NETHER_STAR_PICKAXE = new ToolPickaxe ("jeweled_nether_star_pickaxe", MATERIAL_JEWELED_NETHER_STAR);
	public static final ItemHoe JEWELED_NETHER_STAR_HOE = new ToolHoe ("jeweled_nether_star_hoe", MATERIAL_JEWELED_NETHER_STAR);
}