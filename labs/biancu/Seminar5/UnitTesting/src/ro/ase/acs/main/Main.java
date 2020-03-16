package ro.ase.acs.main;

import java.util.List;
import java.util.Vector;

import ro.ase.acs.classes.Sum;

public class Main {

	public static void main(String[] args) {
		Sum sum = new Sum();
		List<Integer> list = new Vector<Integer>();
		list.add(3);
		list.add(7);
		list.add(-1);
		
		//Right BICEP
		//B - Boundary Checks
		//I - Inverse Relations
		//C - Cross Check
		//E - Error Conditions
		//P - Performance Characteristics
		
		double result = sum.applyOperation(list);
		if(result == 9) {
			System.out.println("OK");
		}
		else {
			System.out.println("Not OK");
		}
	}

}
