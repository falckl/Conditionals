package com.qa.day1exercises;

public class Runner {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		Results myResults = new Results();
		
		System.out.println(myCalculator.sumOfNums(2,3));
		System.out.println(myCalculator.multiply(2,3));
		System.out.println(myCalculator.subtract(2,3));
		System.out.println(myCalculator.divide(9,3));
		
		myResults.biology = 25;
		myResults.chemistry = 100;
		myResults.physics = 80;
		//myResults.totalMark();
		myResults.percentage();
		
		System.out.println(myCalculator.sumOrProduct(3, 5, true));
		
		
	}
	
}
