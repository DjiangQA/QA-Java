import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Garage {

	public static void main(String[] args) {
		car car1 = new car(1, "car1", 100, "M1", true);
		car car2 = new car(2, "car2", 200, "M2", false);
		car car3 = new car(3, "car3", 300, "M3", true);
		car car4 = new car(4, "car4", 400, "M4", false);

		motorcycle Motor1 = new motorcycle(1, "Motor1", 100, "M1", 24);
		motorcycle Motor2 = new motorcycle(2, "Motor2", 200, "M2", 48);
		motorcycle Motor3 = new motorcycle(3, "Motor3", 300, "M3", 24);
		motorcycle Motor4 = new motorcycle(4, "Motor4", 400, "M4", 48);

		jet jet1 = new jet(1, "jet1", 100, "M1", 1, true);
		jet jet2 = new jet(2, "jet2", 200, "M2", 2, false);
		jet jet3 = new jet(3, "jet3", 300, "M3", 1, true);
		jet jet4 = new jet(4, "jet4", 400, "M4", 2, false);
		
		
		
		List<Vehicle> vList = new ArrayList<Vehicle>(); // array list
		vList.addAll(Arrays.asList(car1, Motor1, jet1));
		
		for(Vehicle v : vList)
		{
			System.out.println(v.vehicleName);
			System.out.println(v.Vehicleprice);
		}

		System.out.println();
		// System.out.println(car2.returninfo());
		// System.out.println(Motor4.returninfo());
		// System.out.println(jet3.returninfo());
		
		}
	
	public ArrayList<Vehicle> newVehicle = new ArrayList<Vehicle>();
	
	public void addVehicle (int vehicleID, String vehicleName, int Vehicleprice, String carModle, boolean allWheelDrive)
	{
		newVehicle.add(new car(vehicleID, vehicleName, Vehicleprice, carModle, allWheelDrive));
	}
	public void addVehicle (int vehicleID, String vehicleName, int Vehicleprice, String bikeModle, int bikeAge)
	{
		newVehicle.add(new motorcycle(vehicleID, vehicleName, Vehicleprice, bikeModle, bikeAge));
	}
	public void addVehicle (int vehicleID, String vehicleName, int Vehicleprice, String jetModle, int jetEngineNum, boolean jetIsNew)
	{
		newVehicle.add(new jet(vehicleID, vehicleName, Vehicleprice, jetModle, jetEngineNum, jetIsNew));
	}

}