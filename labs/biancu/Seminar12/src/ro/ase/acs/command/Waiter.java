package ro.ase.acs.command;

import java.util.List;
import java.util.Vector;

public class Waiter {
	private List<FoodOrder> orders = new Vector<FoodOrder>();
	
	public void takeOrder(FoodOrder order) {
		orders.add(order);
	}
	
	public void sendOrders() {
		for(FoodOrder order : orders) {
			order.cook();
		}
		orders.clear();
	}
}
