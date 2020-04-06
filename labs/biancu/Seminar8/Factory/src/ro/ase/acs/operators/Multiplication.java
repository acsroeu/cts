package ro.ase.acs.operators;

import ro.ase.acs.interfaces.BinaryOperator;

//Produs C
public class Multiplication implements BinaryOperator {

	@Override
	public double apply(double firstValue, double secondValue) {
		return firstValue * secondValue;
	}
	
}
