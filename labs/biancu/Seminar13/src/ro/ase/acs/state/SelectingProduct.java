package ro.ase.acs.state;

public class SelectingProduct implements State {

	@Override
	public void doAction() {
		System.out.println("Please select the product...");
	}
	
}
