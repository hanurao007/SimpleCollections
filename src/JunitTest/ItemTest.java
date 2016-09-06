package JunitTest;
import static org.junit.Assert.*;

import org.junit.Test;

import Project.Item;

public class ItemTest {

	@Test
	public void test() {
		Item item =  new Item("book",10);
		assertEquals("book",item.getDescription());
	}

}
