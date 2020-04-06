package ro.ase.acs.operators;

import ro.ase.acs.interfaces.BinaryOperator;

//ProdusA
public class Addition implements BinaryOperator {

	@Override
	public double apply(double firstValue, double secondValue) {
		return firstValue + secondValue;
	}
	
}
