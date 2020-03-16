package ro.ase.acs.classes;

import java.security.InvalidParameterException;
import java.util.List;

import ro.ase.acs.interfaces.Operation;

public class Sum implements Operation {

	@Override
	public double compute(List<Integer> values) {
		if(values == null) {
			throw new InvalidParameterException();
		}
		double result = 0;
		for(Integer i : values) {
			result += i;
		}
		return result;
	}
	
}
