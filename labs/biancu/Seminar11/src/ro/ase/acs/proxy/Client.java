package ro.ase.acs.proxy;

public class Client {
	private String name;
	private int income;
	
	public Client(String name, int income) {
		this.name = name;
		this.income = income;
	}
	
	public int getIncome() {
		return income;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [name=");
		builder.append(name);
		builder.append(", income=");
		builder.append(income);
		builder.append("]");
		return builder.toString();
	}
}
