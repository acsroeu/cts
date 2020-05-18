package ro.ase.acs.command;

public class Chef {
	public void cookPizza(PizzaType type) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The pizza " + type + " is ready!");
	}
	
	public void cookBurger() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The burger is ready");
	}
}
