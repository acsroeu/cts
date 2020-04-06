package ro.ase.acs.factories;

import ro.ase.acs.interfaces.BinaryOperator;
import ro.ase.acs.operators.Substraction;

public class SubstractionFactory extends BinaryOperatorFactory {

	@Override
	public BinaryOperator getBinaryOperator() {
		return new Substraction();
	}

}
