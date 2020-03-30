package com.ETFONEHOME.modtest.items.tools;

import com.ETFONEHOME.modtest.Main;
import com.ETFONEHOME.modtest.init.ModItems;
import com.ETFONEHOME.modtest.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel 
{
	public ToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
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