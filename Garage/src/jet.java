
public class jet extends Vehicle {
	String jetModle;
	int jetEngineNum;
	boolean jetIsNew;
	
	public String returninfo()
	{
		return new String ("ID:"+ vehicleID + " Vehicle Name:" + vehicleName + " Vehicle Price:" + Vehicleprice + " Vehicle Modle:" + jetModle +" Jet engine number:"+ jetEngineNum + " Jet is new:" + jetIsNew);
	}
	
	public jet(int vehicleID, String vehicleName, int Vehicleprice, String jetModle, int jetEngineNum, boolean jetIsNew)
	{
		super (vehicleID, vehicleName, Vehicleprice);
		this.jetModle = jetModle;
		this.jetEngineNum = jetEngineNum;
		this.jetIsNew = jetIsNew;
		//over load
	}
}
