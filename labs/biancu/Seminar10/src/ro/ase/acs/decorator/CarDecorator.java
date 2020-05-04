package ro.ase.acs.decorator;

public abstract class CarDecorator implements Car {
	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
}
