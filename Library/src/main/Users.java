package main;

public abstract class Users {
	String userName;
	int userID;
	String borrowedItems;

	public Users (String userName, int userID, String borrowedItems)
	{
		this.userName = userName;
		this.userID = userID;
		this.borrowedItems = borrowedItems;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getBorrowedItems() {
		return borrowedItems;
	}

	public void setBorrowedItems(String borrowedItems) {
		this.borrowedItems = borrowedItems;
	}
	
	
}
