package ro.ase.acs.classes;

import java.security.InvalidParameterException;
import java.util.List;

import ro.ase.acs.interfaces.Operation;

public class Sum implements Operation {

	@Override
	public Double compute(List<Integer> values) {
		if(values == null) {
			return null;
		}
		double result = 0;
		for(Integer i : values) {
			if(result + i > 5_000_000) {
				throw new InvalidParameterException();
			}
			result += i;
		}
		return result;
	}
	
}
