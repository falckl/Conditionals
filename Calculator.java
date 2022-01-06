package com.qa.day1exercises;

public class Calculator {
	
	public int sumOfNums(int i1, int i2) {
		int sum = i1 + i2;
		return sum;
	}
	
	public int multiply(int i1, int i2) {
		int product = i1 * i2;
		return product;
	}
	
	public int subtract(int i1, int i2) {
		int result = i1 - i2;
		return result;
	}
	
	public double divide(double i1, double i2) {
		double result = 0;
		if (i1 >= i2) {
			result = i1/i2;
		} else {
			System.out.println("Error - division cannot be performed");
		}
		return result;
	}
	
	public int sumOrProduct(int i1, int i2, boolean bool) {
		int result = 0;
		if (bool == true) {
			result = i1 + i2;
		} else if (bool == false) {
			result = i1 * i2;
		}
		return result;
	}
	

}

