package ro.ase.acs.main;

import ro.ase.acs.classes.Computer;
import ro.ase.acs.classes.ConsoleReader;
import ro.ase.acs.classes.ConsoleWriter;
import ro.ase.acs.classes.Sum;

public class Main {

	public static void main(String[] args) {
		Computer computer = 
				new Computer(new ConsoleReader(), 
						new ConsoleWriter(), 
						new Sum());
		computer.applyOperation();
	}

}
