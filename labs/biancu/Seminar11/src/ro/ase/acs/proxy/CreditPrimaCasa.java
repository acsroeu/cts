package ro.ase.acs.proxy;

public class CreditPrimaCasa implements Credit {
	private int income = 0;
	
	public CreditPrimaCasa(int income) {
		this.income = income;
	}
	
	@Override
	public boolean approved() {
		return income > 5000;
	}
}
