package com.ETFONEHOME.modtest.items;

import com.ETFONEHOME.modtest.Main;
import com.ETFONEHOME.modtest.init.ModItems;
import com.ETFONEHOME.modtest.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel  
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModles() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	
}
