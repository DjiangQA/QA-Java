package testing;

import main.Books;
import main.ItemManager;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestItemmanager {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void addItems() {
		ItemManager I = new ItemManager();
		Books b1 = new Books("Book1", 1, 10, "date1", "G1");
		I.addItem(b1);
		assertEquals("Book1", I.getName());
	}

	@Test
	public void removeItems() {
		ItemManager I = new ItemManager();
		Books b1 = new Books("Book1", 1, 10, "date1", "G1");
		I.addItem(b1);
		I.removeItemById(1);
		assertNull(I.getName());
	}
	
	@Test
	public void updateItems() {
		ItemManager I = new ItemManager();
		Books b1 = new Books("Book1", 1, 10, "date1", "G1");
		I.addItem(b1);
		Books b2 = new Books("Book4", 1, 10, "date1", "G1");
		I.updateItem(b2);
		assertEquals("Book4",I.getName());
		
	}
	
	@Test
	public void checkOutItems() {
		ItemManager I = new ItemManager();
		Books b1 = new Books("Book1", 1, 10, "date1", "G1");
		I.addItem(b1);
		Books b2 = new Books("Book1", 1, 9, "date1", "G1");
		I.updateItem(b2);
		System.out.println(I.getAvailable());
		assertEquals(9,I.getAvailable());
	}
	
	@Test
	public void checkInItems() {
		ItemManager I = new ItemManager();
		Books b1 = new Books("Book1", 1, 10, "date1", "G1");
		I.addItem(b1);
		Books b2 = new Books("Book1", 1, 11, "date1", "G1");
		I.updateItem(b2);
		System.out.println(I.getAvailable());
		assertEquals(11,I.getAvailable());
	}

}
