package ro.ase.acs.operators;

import ro.ase.acs.interfaces.BinaryOperator;

//Produs D
public class Substraction implements BinaryOperator {

	@Override
	public double apply(double firstValue, double secondValue) {
		return firstValue - secondValue;
	}
	
}
