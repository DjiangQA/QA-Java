
public class car extends Vehicle {
	String carName;
	String carModle;
	boolean allWheelDrive;
	
	public String returninfo()
	{
		return new String ("ID:"+ vehicleID + " Vehicle Name:" + vehicleName + " Vehicle Price:" + Vehicleprice + " CarModle: " + carModle + " AllWheelDrive:" + allWheelDrive);
	}
	
	public car(int vehicleID, String vehicleName, int Vehicleprice, String carModle, boolean allWheelDrive)
	{
		super (vehicleID, vehicleName, Vehicleprice);
		this.carName = carName;
		this.carModle = carModle;
		this.allWheelDrive = allWheelDrive;
		//over load
	}
	
}
