package com.qa.day3;

public class Iteration_Flowcharts {
	
	public static void main(String[]args) {
		
		//task1
		
		for (int A = 100; A <= 200; A++) {
			System.out.println("A");
		}
		
		//task2
		
		for (int A = 100; A <= 200; A++) {
			if (A%2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
		
		
		//task 3 method that can print out the numbers 1-10 10 times each.
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < i; j++) {
				System.out.println(j);
			}
		}
		
		//task 5 Create a method to print the numbers 1 to 10 as many times as the value of that number
		for (int num = 1; num < 11; num++) {
			for (int times = 1; times <= num; times++) {
				System.out.println(num);
			}
			
		}
	}

}
