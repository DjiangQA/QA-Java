
public abstract class Vehicle {
	int vehicleID;
	String vehicleName;
	int Vehicleprice;
	
	public Vehicle(int vehicleID, String vehicleName, int Vehicleprice)
	{
		this.vehicleID = vehicleID;
		this.vehicleName = vehicleName;
		this.Vehicleprice = Vehicleprice;
		//over load
	}
}
