package CustomModStuff;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.ETFONEHOME.modtest.blocks.BlockBase;

import CustomModStuff.CustomEnergyStorage;

public class CustomEnergyCell extends BlockBase implements ITickable{
	
	Minecraft mc = Minecraft.getMinecraft();
	World world = mc.world;
	private CustomEnergyStorage storage;
	
	public CustomEnergyCell(String name, Material material) {
		super(name, material);
		this.storage = new CustomEnergyStorage(1000, 100);
	}
	
	@Override
	public void update() {
		
		if(!world.isRemote) {
			
			//par1EntityPlayer.addChatComponent(new ChatComponentText("Hello, World!"));
		}
		
// requires cjcore
//		if(this.world != null) {
//			if(!this.world.isRemote) {
//				this.storage.extractEnergy(EnergyUtils.giveEnergyAllFaces(this.world, this.pos, 1000, EnergyUnits.FORGE_ENERGY, false), false) needs CJcore
//			}
//		}
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		playerIn.experience += 100;
		// TODO Auto-generated method stub
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
	}
	
}


