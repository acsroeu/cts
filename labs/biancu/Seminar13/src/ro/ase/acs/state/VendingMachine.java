package ro.ase.acs.state;

public class VendingMachine {
	private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void pressButton() {
		if(state == null) {
			state = new AcceptingMoney();
		}
		state.doAction();
	}
}
