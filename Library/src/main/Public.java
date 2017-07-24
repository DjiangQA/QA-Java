package main;

public class Public extends Users{
	
	String address;

	public Public(String userName, int userID, String borrowedItems, String address) {
		super(userName, userID, borrowedItems);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
