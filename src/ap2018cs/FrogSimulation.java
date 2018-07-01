package ap2018cs;

import java.util.Random;

public class FrogSimulation {
	
	private int goalDistance;
	private int maxHops;
	
	private Random rand;

	public FrogSimulation(int goalDistance, int maxHops) {
		super();
		this.goalDistance = goalDistance;
		this.maxHops = maxHops;
		rand = new Random();
	}
	
	private int hopDistance(){
		// Randomly generate int between -8  +31
		int low = -8;
		int high = 31;
		int range = high - low + 1;
		int hopDistance = rand.nextInt(range) + low;
		
		return hopDistance;
	}

	public boolean simulate(){
		int position = 0;
		for(int hops = 0; hops < maxHops; hops++){
			position += hopDistance();
			if(position >= goalDistance) return true; // Reached goal.
			if(position < 0) return false; // Reached negative position.
		}
		// Ran out of hops;
		return false;
	}
	
	public double runSimulations(int num){
		double successful = 0;
		for(int i=0; i<num; i++){
			if(simulate()) successful++;
		}
		return successful/num;
	}

	public static void main(String[] args) {
		FrogSimulation fsim = new FrogSimulation(40, 5);
		
		System.out.println(fsim.runSimulations(3));
	}
	
	

}
