package com.qa.exercises;

import com.qa.day3.Coins;

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
		
		UniqueSum myBlackjack = new UniqueSum();
		System.out.println(myBlackjack.blackjack(1, 1, 3));
		
		Taxes myTaxes = new Taxes();
		System.out.println(myTaxes.taxablePercent(29000));
		System.out.println(myTaxes.amountTaxed2(29000));
		
		Coins myChange = new Coins();
		System.out.println(myChange.changeToGive(4.58, 20));
		
		Fizzbuzz myFBz = new Fizzbuzz();
		myFBz.fizzBuzz(5);
		myFBz.fizzBuzz(3);
		myFBz.fizzBuzz(1);
		myFBz.fizzBuzz(15);
		
		Blackjack myBlackJack = new Blackjack();
		System.out.println(myBlackJack.blackjack(10, 21));
		System.out.println(myBlackJack.blackjack(20, 18));
		System.out.println(myBlackJack.blackjack(1, 22));
		System.out.println(myBlackJack.blackjack(22, 23));
	}
	
}
