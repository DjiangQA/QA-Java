package main;

public class Main {

	public static void main(String[] args) {
		ItemManager I = new ItemManager();
		UserManager U = new UserManager();
		
		Books b1 = new Books("Book1", 1, 10, "date1", "G1");
		Books b2 = new Books("Book2", 2, 20, "date2", "G2");
		Books b3 = new Books("Book3", 3, 30, "date3", "G3");
		Books b4 = new Books("Book4", 4, 40, "date4", "G4");
		Newspaper n1 = new Newspaper("Newspaper1", 5, 10, "date1", "P1", false);
		Newspaper n2 = new Newspaper("Newspaper2", 6, 20, "date2", "P1", true);
		Newspaper n3 = new Newspaper("Newspaper3", 7, 30, "date3", "P1", false);
		Newspaper n4 = new Newspaper("Newspaper4", 8, 40, "date4", "P1", true);
		Maps m1 = new Maps("map1", 9, 10, "date1", "L1", "AC1");
		Maps m2 = new Maps("map2", 10, 20, "date2", "L1", "AC2");
		Maps m3 = new Maps("map3", 11, 30, "date3", "L1", "AC3");
		Maps m4 = new Maps("map4", 12, 40, "date4", "L1", "AC4");
		
		Public p1 = new Public("User1", 01, "Addr1", "book1");
		Public p2 = new Public("User2", 02, "Addr2", "book2");
		Public p3 = new Public("User3", 03, "Addr3", "book3");
		Public p4 = new Public("User4", 04, "Addr4", "book4");
		Staff s1 = new Staff("Staff1", 101, "book5", 1);
		Staff s2 = new Staff("Staff2", 102, "book6", 2);
		Staff s3 = new Staff("Staff3", 103, "book7", 3);
		Staff s4 = new Staff("Staff4", 104, "book8", 4);
		
		
		

		I.addItem(b1);
		I.addItem(b2);
		I.addItem(b3);
		I.addItem(b4);
		I.addItem(n1);
		I.addItem(n2);
		I.addItem(n3);
		I.addItem(n4);
		I.addItem(m1);
		I.addItem(m2);
		I.addItem(m3);
		I.addItem(m4);
		//I.emptyItem();
		//I.addItem(m4);
		//I.removeItemById(2);
		I.outputItem();
		
		
		
		U.addUser(p1);
		U.addUser(p2);
		U.addUser(p3);
		U.addUser(p4);
		U.addUser(s1);
		U.addUser(s2);
		U.addUser(s3);
		U.addUser(s4);
		U.outputUser();
		
		

	}

}