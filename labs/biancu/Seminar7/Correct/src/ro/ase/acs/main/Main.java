package ro.ase.acs.main;

import ro.ase.acs.classes.Computer;
import ro.ase.acs.classes.ConsoleReader;
import ro.ase.acs.classes.ConsoleWriter;
import ro.ase.acs.classes.Sum;
import ro.ase.acs.singleton.Logger;

public class Main {

	public static void main(String[] args) {
		Runnable r = () -> { 
			Logger logger = Logger.getInstance();
			logger.log("Message from another thread");
		};
		new Thread(r).start();
		
		Logger logger = Logger.getInstance();
		//this object is the same instance as the one
		//from the lambda expression
		logger.log("Main method started");
		
		
		
		System.out.println("Input some values to do the math:");
		Computer computer = 
				new Computer(new ConsoleReader(), 
						new ConsoleWriter(), 
						new Sum());
		computer.applyOperation();
	}

}
