package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Writer;

public class ConsoleWriter implements Writer {
	
	@Override
	public void write(double d) {
		System.out.printf("%.2f", d);
	}
	
}
