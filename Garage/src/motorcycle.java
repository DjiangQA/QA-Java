
public class motorcycle extends Vehicle
{
	String bikeName;
	String bikeModle;
	int bikeAge;
	int bikeCost;
	
	public String returninfo()
	{
		return new String ("ID:"+ vehicleID + " Vehicle Name:" + vehicleName + " Vehicle Cost:" + Vehicleprice + " Vehicle Modle:" + bikeModle + " Vehicle age:" + bikeAge);
	}
	
	public motorcycle(int vehicleID, String vehicleName, int Vehicleprice, String bikeModle, int bikeAge)
	{
		super (vehicleID, vehicleName, Vehicleprice);
		this.bikeModle = bikeModle;
		this.bikeAge = bikeAge;
		
		//over load
	}
}
