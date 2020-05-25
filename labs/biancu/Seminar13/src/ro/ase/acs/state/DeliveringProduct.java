package ro.ase.acs.state;

public class DeliveringProduct implements State {

	@Override
	public void doAction() {
		System.out.println("Please pickup the product from the tray...");
	}

}
