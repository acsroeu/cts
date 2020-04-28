package ro.ase.acs.facade;

public class Engine {
	boolean isInServiceMode = false;
	
	public void startEngine() {
		System.out.println("The engine has started");
	}
	
	public void stopEngine() {
		System.out.println("The engine has stopped");
	}
	
	public void increaseRpm() {
		System.out.println("Vrrrrmmmm");
	}
	
	public void activateServiceMode() {
		isInServiceMode = true;
	}
}
