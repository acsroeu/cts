package ro.ase.acs.factories;

import ro.ase.acs.exceptions.InvalidOperationException;
import ro.ase.acs.interfaces.BinaryOperator;
import ro.ase.acs.operators.Addition;
import ro.ase.acs.operators.Division;
import ro.ase.acs.operators.Multiplication;
import ro.ase.acs.operators.Substraction;

//Simple Factory
public class SimpleBinaryOperatorFactory {
	
	public BinaryOperator getBinaryOperator(String operation) throws InvalidOperationException {
		if("+".equals(operation)) {
			return new Addition();
		}
		else if ("-".equals(operation)) {
			return new Substraction();
		}
		else if ("*".equals(operation)) {
			return new Multiplication();
		}
		else if ("/".equals(operation)) {
			return new Division();
		}
		else {
			throw new InvalidOperationException("Operation not supported!");
		}
	}
}
