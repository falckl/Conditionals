package com.qa.exercises;

public class Blackjack {

	//Given 2 integer values greater than 0,
	//return whichever is closest to 21 without going over 21. 
	//If they both go over 21 then return 0.
	public int blackjack(int a, int b) {
		int score = 0;
		int diffa = 21 - a;
		int diffb = 21 - b;
		
		if ((diffa >= 0) & (diffb >=0)) {
			//if both valid, choose smaller diff.
			if (diffa <= diffb) {
				score = a;
			} else {
				score = b;
			}
		} else if ((diffa >= 0) | (diffb >=0)) {
			if (diffa >= 0){
				score = a;
			} else {
				score = b;
			}
		}
		//else score remains 0 as defined before
		return score;
	}
	
}
