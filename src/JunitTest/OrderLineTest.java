package JunitTest;
import static org.junit.Assert.*;

import org.junit.Test;

import Project.Item;
import Project.OrderLine;

public class OrderLineTest {

	@Test
	public void test() {
		Item item = new Item("book",10);
		try {
			OrderLine orderLine = new OrderLine(item,1);
			assertEquals(item.getDescription(),orderLine.getItem().getDescription());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
