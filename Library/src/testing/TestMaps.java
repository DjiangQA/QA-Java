package testing;
import main.Books;
import main.Maps;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.junit.Before;
import org.junit.Test;

public class TestMaps {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetLocation()
	{
		Maps m = new Maps("book1", 01, 10, "21/07/2017", "Sheffield", "AC5");
		assertEquals("Sheffield", m.getLocation());
	}

}
