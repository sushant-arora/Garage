package garage;

public class runner {
	
	
	public static void main(String[] args) {
		
		Garage mygarage = new Garage();
		
		
		Vehicles vehicle1 = new Cars(1023, "McLaren P1", 4, true, 2019, 2);
		
		Vehicles vehicle2 = new Cars(1024, "Ferrari Enzo", 4, true, 1999, 2);
		
		Vehicles vehicle3 = new Cars(1025, "Jeep", 4, true, 2019, 4);
		
		Vehicles vehicle4 = new Trucks(1026, "Merc Lorry", 16, true, 2014, 12000, "Commercial Use");
		
		Vehicles vehicle5 = new Bikes(1027, "Ducati 250SE ", 2, true, 2021 , 250);
		
		mygarage.addToGarage(vehicle1);
		mygarage.addToGarage(vehicle2);
		mygarage.addToGarage(vehicle3);
		mygarage.addToGarage(vehicle4);
		mygarage.addToGarage(vehicle5);
		
		System.out.println("");
		System.out.println(" ----------------------------------------------------");
		
		System.out.println("");
		mygarage.totalrepaircost(vehicle1);
		
		
		
		
		
		
		
		
	
	}

}
