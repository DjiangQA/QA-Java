package main;

import java.util.ArrayList;

public class UserManager {
	ArrayList<Users> userList = new ArrayList<Users>();
	
	static Public p1 = new Public("User1", 01, "Addr1", "book1");
	static Public p2 = new Public("User2", 02, "Addr2", "book2");
	static Public p3 = new Public("User3", 03, "Addr3", "book3");
	static Public p4 = new Public("User4", 04, "Addr4", "book4");
	static Staff s1 = new Staff("Staff1", 101, "book5", 1);
	static Staff s2 = new Staff("Staff2", 102, "book6", 2);
	static Staff s3 = new Staff("Staff3", 103, "book7", 3);
	static Staff s4 = new Staff("Staff4", 104, "book8", 4);

	public void addUser(Users U) {
		userList.add(U);
	}
	
	public void updateItem(Users U) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).userID == U.userID) {
				userList.remove(i);
			}
			userList.add(U);
		}
	}
	
	
	public void removeUserById(int userID) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).userID == userID) {
				userList.remove(i);
			}
		}
	}

	public void outputUser() {
		for (Users U : userList) {
			System.out.println("User ID:"+U.userID + " User name:"+U.userName+" Item Borrowed:"+ U.borrowedItems);
		}
	}

	public void emptyUser() {
		userList.clear();
	}
	
	public String getName() {
		for (Users U : userList) {
			return U.userName;

		}
		return null;
	}
	
	public int getID() {
		for (Users U : userList) {
			return U.userID;

		}
		return 000;
	}
	
	public String getItemBorrowed() {
		for (Users U : userList) {
			return U.borrowedItems;
		}
		return null;
	}
}