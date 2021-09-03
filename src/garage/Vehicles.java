package garage;

public abstract class Vehicles {
	
	


	public int ID;
	public String name;
	public int numWheels;
	public boolean streetlegal;
	public int age;
	public static String terrain = "Land";
	
	
		
	public Vehicles(int iD, String name, int numWheels, boolean streetlegal, int age) {
		super();
		ID = iD;
		this.name = name;
		this.numWheels = numWheels;
		this.streetlegal = streetlegal;
		this.age = age;
		
		ID++;
	}

	
		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}
		
	

	

	public Vehicles(String name, int numWheels, boolean streetlegal) {
		super();
		this.name = name;
		this.numWheels = numWheels;
		this.streetlegal = streetlegal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public boolean isStreetlegal() {
		return streetlegal;
	}

	public void setStreetlegal(boolean streetlegal) {
		this.streetlegal = streetlegal;
	}

	public static String getTerrain() {
		return terrain;
	}

	public static void setTerrain(String terrain) {
		Vehicles.terrain = terrain;
	}
	
	public abstract float bill();
	
}	
	
