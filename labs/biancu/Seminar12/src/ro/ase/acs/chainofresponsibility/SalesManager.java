package ro.ase.acs.chainofresponsibility;

public class SalesManager extends Handler {

	@Override
	public void handle() {
		System.out.println("The refund was handled by the sales manager");
	}	
}
