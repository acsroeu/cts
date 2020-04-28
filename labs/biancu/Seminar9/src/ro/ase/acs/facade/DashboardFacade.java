package ro.ase.acs.facade;

public class DashboardFacade {
	private Engine engine = new Engine();
	private CoolingSystem cooling = new CoolingSystem();
	private BrakingSystem breakingSystem = new BrakingSystem();
	private SteeringSystem steering = new SteeringSystem();
	
	public void startCar() {
		engine.startEngine();
		cooling.startCoolingSystem();
	}
	
	public void stopCar() {
		engine.stopEngine();
	}
	
	public void accelerate() {
		engine.increaseRpm();
	}
	
	public void brake() {
		breakingSystem.applyBrakes();
	}
	
	public void turnLeft() {
		steering.steerLeft();
	}
	
	public void turnRight() {
		steering.steerRight();
	}
}
