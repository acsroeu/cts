package ro.ase.acs.interfaces;

import ro.ase.acs.exceptions.InvalidOperationException;

//InterfataProdus
public interface BinaryOperator {
	public double apply(double firstValue, double secondValue) throws InvalidOperationException;
}
