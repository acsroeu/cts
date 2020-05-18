package ro.ase.acs.command;

public class PizzaOrder implements FoodOrder {
	private Chef chef;
	private PizzaType pizzaType;
	
	public PizzaOrder(Chef chef, PizzaType pizzaType) {
		this.chef = chef;
		this.pizzaType = pizzaType;
	}

	@Override
	public void cook() {
		chef.cookPizza(pizzaType);
	}
}
