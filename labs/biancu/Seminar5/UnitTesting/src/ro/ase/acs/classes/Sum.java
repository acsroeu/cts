package ro.ase.acs.classes;

import java.security.InvalidParameterException;
import java.util.List;

import ro.ase.acs.interfaces.Operation;

public class Sum implements Operation, Cloneable {

	@Override
	public Double applyOperation(List<Integer> list) {
		if(list == null) {
			return null;
		}
		Double result = 0d;
		for(Integer x : list) {
			if(result + x > 5_000_000) {
				throw new InvalidParameterException();
			}
			result += x;
		}
		return result;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
