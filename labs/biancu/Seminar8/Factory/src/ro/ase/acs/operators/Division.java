package ro.ase.acs.operators;

import ro.ase.acs.exceptions.InvalidOperationException;
import ro.ase.acs.interfaces.BinaryOperator;

//Produs B
public class Division implements BinaryOperator {

	@Override
	public double apply(double firstValue, double secondValue) throws InvalidOperationException {
		if(secondValue != 0) {
			return firstValue / secondValue;
		}
		else {
			throw new InvalidOperationException("You cannot divide by zero!");
		}
	}

}
