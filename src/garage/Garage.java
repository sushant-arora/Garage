package garage;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicles> vehicle = new ArrayList<>();
	
	public void addToGarage(Vehicles machine) {
		
		vehicle.add(machine);
		System.out.println( machine.getName() + " has been added to the Garage!");
		
		
			
			
			
		}

	public void totalrepaircost() {	
		
		for(Vehicles machine : vehicle) {
			
			System.out.println("Total repair cost - " +machine.bill());
		}
		
	}
	
	
}
