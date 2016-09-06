package JunitTest;
import static org.junit.Assert.*;

import org.junit.Test;

import Project.Item;
import Project.Order;
import Project.OrderLine;

public class OrderTest {

	@Test
	public void test() {
		Order order = new Order();
		Item item1 = new Item("book",(float)12.49);
		Item item2 = new Item("music CD",(float)14.99);
		Item item3 = new Item("chocolate bar", (float) 0.85);
		try {
			order.add(new OrderLine(item1, 1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			order.add(new OrderLine(item2, 1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			order.add(new OrderLine(item3, 1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(item1.getDescription(),order.get(0).getItem().getDescription());
		assertEquals(item2.getDescription(),order.get(1).getItem().getDescription());
		assertEquals(item3.getDescription(),order.get(2).getItem().getDescription());
	}

}
