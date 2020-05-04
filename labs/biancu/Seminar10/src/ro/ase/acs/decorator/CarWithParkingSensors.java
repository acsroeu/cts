package ro.ase.acs.decorator;

public class CarWithParkingSensors extends CarDecorator {
	
	public CarWithParkingSensors(Car car) {
		super(car);
	}
	
	@Override
	public void start() {
		car.start();
		System.out.println("The parking sensors are active");
	}

}
