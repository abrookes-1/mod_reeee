package CustomModStuff;

import net.minecraftforge.energy.EnergyStorage;

public class CustomEnergyStorage extends EnergyStorage {
	
	public CustomEnergyStorage(int capacity, int maxReveive) {
		super(capacity, maxReveive, 0);
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public void consumePower(int energy) {
		this.energy -= energy;
		if (this.energy <= 0) {
			this.energy = 0;
		}
	}
}
