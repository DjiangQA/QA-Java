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

	public void checkOutItems() {

	}

	public void checkInItems() {

	}
	
	@Test
	public void updateItems() {
		ItemManager I = new ItemManager();
		Books b1 = new Books("Book1", 1, 10, "date1", "G1");
		I.addItem(b1);
		Books b1 = new Books("Book10", 10, 100, "date10", "G10");
		I.addItem(b1);
		
		assertEquals("Book10", I.getName());
	}

	public void displayItems() {

	}

}
