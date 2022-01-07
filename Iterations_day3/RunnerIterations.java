package com.qa.day3;

public class RunnerIterations {

	public static void main(String[] args) {
		
		Iteration_numbers myIterations = new Iteration_numbers();
		
		System.out.println(myIterations.addDigits(30));
		System.out.println(myIterations.numToString(81));
		
		System.out.println(myIterations.printHundreds(213));
		System.out.println(myIterations.printThousands(2139));
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(myIterations.printThousands(i));
		}
	}
	
}

