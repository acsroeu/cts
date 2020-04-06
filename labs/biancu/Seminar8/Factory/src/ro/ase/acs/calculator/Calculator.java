package ro.ase.acs.calculator;

import ro.ase.acs.exceptions.InvalidOperationException;
import ro.ase.acs.factories.AdditionFactory;
import ro.ase.acs.factories.BinaryOperatorFactory;
import ro.ase.acs.factories.SimpleBinaryOperatorFactory;
import ro.ase.acs.factories.SubstractionFactory;
import ro.ase.acs.interfaces.BinaryOperator;

//Client
public class Calculator {
	private BinaryOperator operator;
	private double firstValue;
	private double secondValue;
	
	public Calculator(double firstValue, double secondValue, String operation) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		
		//versiunea 1 - Simple Factory
		SimpleBinaryOperatorFactory factory = new SimpleBinaryOperatorFactory();
		try {
			operator = factory.getBinaryOperator(operation);
		} catch (InvalidOperationException e) {
			System.out.println(e.getMessage());
		}
		
		//versiunea 2 - Factory Method
		//se va folosi doar una dintre cele doua
		BinaryOperatorFactory abstractFactory;
		if("+".equals(operation)) {
			abstractFactory = new AdditionFactory();
		}
		else {
			abstractFactory = new SubstractionFactory();
		}
		operator = abstractFactory.getBinaryOperator();
	}
	
	public double calculate() {
		try {
			return operator.apply(firstValue, secondValue);
		} catch (InvalidOperationException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}
}
