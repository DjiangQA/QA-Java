package main;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		ItemManager I = new ItemManager();
		UserManager U = new UserManager();
		
		Maps m4 = new Maps("map10", 12, 40, "date4", "L1", "AC4");

		I.addItem(ItemManager.b1);
		I.addItem(ItemManager.b2);
		I.addItem(ItemManager.b3);
		I.addItem(ItemManager.b4);
		I.addItem(ItemManager.n1);
		I.addItem(ItemManager.n2);
		I.addItem(ItemManager.n3);
		I.addItem(ItemManager.n4);
		I.addItem(ItemManager.m1);
		I.addItem(ItemManager.m2);
		I.addItem(ItemManager.m3);
		I.addItem(ItemManager.m4);
		//I.emptyItem();
		//I.addItem(ItemManager.m4);
		//I.removeItemById(2);
		//I.updateItem(m4);
		//I.outputItem();
		I.Writer();
		I.Reader();
		
		
		
		
		
		U.addUser(UserManager.p1);
		U.addUser(UserManager.p2);
		U.addUser(UserManager.p3);
		U.addUser(UserManager.p4);
		U.addUser(UserManager.s1);
		U.addUser(UserManager.s2);
		U.addUser(UserManager.s3);
		U.addUser(UserManager.s4);
		//U.outputUser();

	}

}
