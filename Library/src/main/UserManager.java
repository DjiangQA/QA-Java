package main;

import java.util.ArrayList;

public class UserManager {
	ArrayList<Users> userList = new ArrayList<Users>();

	public void addUser(Users I) {
		userList.add(I);
	}

	
	
	public void removeUserById(int userID) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).userID == userID) {
				userList.remove(i);
			}
		}
	}

	public void outputUser() {
		for (Users I : userList) {
			System.out.println("User ID:"+I.userID + " User name:"+I.userName+" Item Borrowed:"+ I.borrowedItems);
		}
	}

	public void emptyUser() {
		userList.clear();
	}
}