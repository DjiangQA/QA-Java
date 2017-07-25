package testing;

import main.Books;
import main.ItemManager;
import main.Public;
import main.UserManager;
import main.Users;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestUsermanager {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void addUsers() {

		UserManager U = new UserManager();
		Users p1 = new Public("User1", 1, "01", "Addr1");
		U.addUser(p1);
		assertEquals("User1", U.getName());
	}

	@Test
	public void removeUsers() {
		UserManager U = new UserManager();
		Users p1 = new Public("User1", 1, "01", "Addr1");
		U.addUser(p1);
		U.removeUserById(1);
		assertNull(U.getName());
	}

	
	public void updateUsers() {
		UserManager U = new UserManager();
		Users p1 = new Public("User1", 1, "01", "Addr1");
		U.addUser(p1);
		Users p2 = new Public("User1", 1, "01", "Addr1");
		//U.updateUsers(p2);
		assertEquals("Book4",U.getName());
	}

	
	public void borrowingItems() {

	}

}
