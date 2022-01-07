package com.qa.exercises;

public class Taxes {
	double salary;
	double percent;
	
	//Method 1 - which takes a salary and works out the percentage by which the salary will be taxed.
	//Method 2 - which works out the exact amount that the user will be taxed using a similar process 
	//to that in the first method. That amount should be returned and output to the console.
	//These 2 methods should be able to work independently, so it is fine in this case if some of the code is repeated.*
	
//	0 - 14,999 : 0% tax
//	15,000 - 19,999 : 10% tax
//	20,000 - 29,999 : 15% tax
//	30,000 - 44,999 : 20% tax
//	45,000+ : 25% tax
	
	public String taxablePercent(double salary) {
		if (salary < 15000) {
			percent = 0;
		} else if (salary < 20000){
			percent = 10;
		} else if (salary < 30000){
			percent = 15;
		} else if (salary < 45000){
			percent = 20;
		} else {
			percent = 25;
		}
		String percentString = percent + "%";
		return percentString;
	}
	
	public double AmountTaxed(double salary) {
		double amount = 0;
		if (salary < 15000) {
			percent = 0;
		} else if (salary < 20000){
			percent = 0.10;
		} else if (salary < 30000){
			percent = 0.15;
		} else if (salary < 45000){
			percent = 0.2;
		} else {
			percent = 0.25;
		}
		amount = salary * percent;
		return amount;
	}
	
	public double amountTaxed2(double salary) {
		double amount = 0;
		taxablePercent(salary);
		amount = salary * percent / 100;
		return amount;
		
	}
}
