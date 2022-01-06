package com.qa.exercises;

public class UniqueSum {
	
	//Given 3 integer values, return their sum. 
	//If one value is the same as another value, they do not count towards the sum. 
	//In other words, only return the sum of unique numbers given.
	
	public int blackjack(int a, int b, int c) {
		int sum = 0;
		//if a does not = b, add together.
		//if c does not = a or b, add c.
		if (a != b) {
			sum = a + b;
		}
		
		if ((c != a) & (c != b)) {
			sum += c;
		}
		return sum;
	}

}
