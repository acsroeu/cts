package ro.ase.acs.main;

import java.util.Scanner;

import ro.ase.acs.calculator.Calculator;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input an operation in the following format:");
		System.out.println("a + b");
		System.out.println();
		
		String response = "Y";
		while("Y".equals(response)) {
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");
			if(tokens.length > 2) {
				double firstValue = Double.parseDouble(tokens[0]);
				String operation = tokens[1];
				double secondValue = Double.parseDouble(tokens[2]);
				
				Calculator calculator = new Calculator(firstValue, secondValue, operation);
				System.out.printf("Result: %.4f", calculator.calculate());
				System.out.println();
				System.out.println("Do you want to continue? Y/N");
				response = scanner.next();
			}
		}
		
		scanner.close();
	}

}
