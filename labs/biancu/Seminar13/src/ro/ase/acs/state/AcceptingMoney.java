package ro.ase.acs.state;

public class AcceptingMoney implements State {

	@Override
	public void doAction() {
		System.out.println("Plase input money...");
	}

}
