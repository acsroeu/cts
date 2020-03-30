package ro.ase.acs.singleton;

public class Logger {
	//static and private single instance of the class
	private static Logger instance = null;
	
	//private constructor so it cannot be initialized
	//from outside the class
	private Logger() {
	}
	
	//method for obtaining the single instance
	//thread-safe implementation
	public static synchronized Logger getInstance() {
		//lazy implementation of the pattern
		//the instance is created when it is needed
		//for the first time
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	//public method that will be called
	//on the same instance every time
	public void log(String message) {
		System.out.println(message);
	}
}
