
public class main {

	public static void main(String[] args) {
		Garage garage1 = new Garage();
		
		garage1.addVehicle(05, "BMW", 3000, "M3", true);
		garage1.addVehicle(05, "Bike5", 300, "M1", 24);
		garage1.addVehicle(05, "jet5", 30000, "M1", 2, true);
		
		for (Vehicle v: garage1.newVehicle)
		{
			System.out.println(v.vehicleID);
			System.out.println(v.vehicleName);
			System.out.println(v.Vehicleprice);
		}
		
	}

}