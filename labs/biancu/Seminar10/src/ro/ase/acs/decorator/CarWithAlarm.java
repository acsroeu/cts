package ro.ase.acs.decorator;

public class CarWithAlarm extends CarDecorator {
	private boolean isAlarmOn;
	
	public CarWithAlarm(Car car) {
		super(car);
	}
	
	@Override
	public void start() {
		car.start();
		isAlarmOn = false;
	}
	
	public void activateAlarm() {
		isAlarmOn = true;
	}
	
	public void deactivateAlarm() {
		isAlarmOn = false;
	}
	
	public boolean getAlarmStatus() {
		return isAlarmOn;
	}
}
