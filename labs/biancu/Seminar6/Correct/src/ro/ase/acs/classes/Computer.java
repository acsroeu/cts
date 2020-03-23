package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Reader;
import ro.ase.acs.interfaces.Writer;

import java.security.InvalidParameterException;

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
		if(reader == null || writer == null || operation == null) {
			throw new InvalidParameterException();
		}
		writer.write(operation.compute(reader.read()));
	}	
	
}
