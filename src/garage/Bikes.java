package garage;

public class Bikes extends Vehicles {
	
	public int engineCC;

	@Override
	public float bill() {
		
		int totalbill = 500;
		 
		if (engineCC <= 300) {
			
			totalbill += 100;
		}
		else {
			totalbill += 200;
		}
		 
		
		totalbill += (200 + numWheels*50);
		
		return totalbill;
		
	}

	public Bikes(int iD, String name, int numWheels, boolean streetlegal, int age, int engineCC) {
		super(iD, name, numWheels, streetlegal, age);
		this.engineCC = engineCC;
	}

	
	
}
	
	
	
	


