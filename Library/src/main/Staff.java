package main;

public class Staff extends Users{
	
	int clearanceLevel;

	public Staff(String userName, int userID, String borrowedItems, int clearanceLevel) {
		super(userName, userID, borrowedItems);
		this.clearanceLevel = clearanceLevel;
		
	}

	public int getClearanceLevel() {
		return clearanceLevel;
	}

	public void setClearanceLevel(int clearanceLevel) {
		this.clearanceLevel = clearanceLevel;
	}
	

}
