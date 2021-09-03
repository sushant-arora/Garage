package garage;

public class Trucks  extends Vehicles {
	
	public int volCapacity;
	
	public String use;

	

	public Trucks(int iD, String name, int numWheels, boolean streetlegal, int age, int volCapacity, String use) {
		super(iD, name, numWheels, streetlegal, age);
		this.volCapacity = volCapacity;
		this.use = use;
	}



	@Override
	public float bill() {
		
		int totalbill = 1000;
		 
		if (volCapacity <= 10000) {
			
			totalbill += 3000;
		}
		else {
			totalbill += 5500;
		}
		 
		
		totalbill += (1500 + numWheels*50);
		
		
		// TODO Auto-generated method stub
		return totalbill;
		
		// TODO Auto-generated method stub
	
	}
	
	
	

}
