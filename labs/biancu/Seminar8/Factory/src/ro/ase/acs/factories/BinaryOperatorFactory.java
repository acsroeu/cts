package ro.ase.acs.factories;

import ro.ase.acs.interfaces.BinaryOperator;

//Abstract Factory
//in acest caz poate fi si interfata
public abstract class BinaryOperatorFactory {
	public abstract BinaryOperator getBinaryOperator();
}
