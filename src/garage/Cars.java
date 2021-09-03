package garage;

public class Cars extends Vehicles {

	public int noSeats;
	
	
	public Cars(int iD, String name, int numWheels, boolean streetlegal, int age, int noSeats) {
		super(iD, name, numWheels, streetlegal, age);
		this.noSeats = noSeats;
	}






	@Override
	public float bill() {
		
		int totalbill = 1000;
		 
		if (age <= 2000) {
			
			totalbill += 3000;
		}
		else {
			totalbill += 1500;
		}
		 
		
		totalbill += (500 + numWheels*50 + 400*noSeats);
		
		
		// TODO Auto-generated method stub
		return totalbill;
	}
	
	

}
