package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Reader;
import ro.ase.acs.interfaces.Writer;
import ro.ase.acs.interfaces.Operation;

public class Computer {
	
	private Reader reader;
	private Writer writer;
	private Operation operation;
	
	public Computer(Reader reader, 
			Writer writer,
			Operation operation) {
		this.reader = reader;
		this.writer = writer;
		this.operation = operation;
	}
	
	public void applyOperation() {
		writer.write(operation.compute(reader.read()));
	}	
	
}
