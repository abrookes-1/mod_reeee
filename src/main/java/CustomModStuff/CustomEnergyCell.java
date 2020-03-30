package CustomModStuff;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ITickable;
import net.minecraft.world.World;
import CustomModStuff.CustomEnergyStorage;

public class CustomEnergyCell implements ITickable{
	
	Minecraft mc = Minecraft.getMinecraft();
	World world = mc.world;
	private CustomEnergyStorage storage;
	
	public CustomEnergyCell() {
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
	
}
