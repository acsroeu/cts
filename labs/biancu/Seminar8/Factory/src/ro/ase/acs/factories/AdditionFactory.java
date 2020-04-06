package ro.ase.acs.factories;

import ro.ase.acs.interfaces.BinaryOperator;
import ro.ase.acs.operators.Addition;

public class AdditionFactory extends BinaryOperatorFactory {

	@Override
	public BinaryOperator getBinaryOperator() {
		return new Addition();
	}

}
