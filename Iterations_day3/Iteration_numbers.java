package com.qa.day3;

public class Iteration_numbers {
	int thousandscount;
	int hundredscount;
	int tenscount;
	int onescount;
	
	//take a number 10-99, add the two digits together 
	
	public int addDigits(int num) {
		int result = 0;
		if ((num > 9) == true & (num < 100) == true) {
			result = num/10 + num%10;
		}
		return result;
	}
	
	//given the number 1-99 returns a String representation of this number
	
	public String numToString(int num) {
		String numaswords = "Not a valid number";
		boolean done = false;
		while (done == false) {
		if ((num > 0) == true & (num < 100) == true) {
			
			int digit1 = num/10;
			int digit2 = num%10;
			
			// if between 1 and 9, make numaswords blank
			if (digit1 == 0) {
				numaswords = "";
			}
			
			//10 - 19
			if (digit1 == 1) {
				switch(digit2) {
				case 0:
					numaswords = "ten";
					break;
				case 1:
					numaswords = "eleven";
					break;
				case 2:
					numaswords = "twelve";
					break;
				case 3:
					numaswords = "thirteen";
					break;
				case 4:
					numaswords = "fourteen";
					break;
				case 5:
					numaswords = "fifteen";
					break;
				case 6:
					numaswords = "sixteen";
					break;
				case 7:
					numaswords = "seventeen";
					break;
				case 8:
					numaswords = "eighteen";
					break;
				case 9:
					numaswords = "nineteen";
					break;
				}
				done = true;
			}
			
			//20 - 99
			if (digit1 > 1) {
				switch(digit1) {
				case 2:
					numaswords = "twenty ";
					break;
				case 3:
					numaswords = "thirty ";
					break;
				case 4:
					numaswords = "fourty ";
					break;
				case 5:
					numaswords = "fifty ";
					break;
				case 6:
					numaswords = "sixty ";
					break;
				case 7:
					numaswords = "seventy ";
					break;
				case 8:
					numaswords = "eighty ";
					break;
				case 9:
					numaswords = "ninety ";
					break;
				}
			}
			//add ending of string (unless digit1 = 1)
			if (digit1 != 1) {
				switch(digit2) {
				case 0:
					numaswords += "";
					break;
				case 1:
					numaswords += "one";
					break;
				case 2:
					numaswords += "two";
					break;
				case 3:
					numaswords += "three";
					break;
				case 4:
					numaswords += "four";
					break;
				case 5:
					numaswords += "five";
					break;
				case 6:
					numaswords += "six";
					break;
				case 7:
					numaswords += "seven";
					break;
				case 8:
					numaswords += "eight";
					break;
				case 9:
					numaswords += "nine";
					break;
				}
				done = true;
			}	
		} //if valid number loop ends
		} //while done loop ends
		return numaswords;
	}
	
	//next method
	//given the number 1-999 returns a String representation of this number
	//method gethundreds
	//method gettens
	//method getspecial
	//method get ones
	
	public String getThousands(int num) {
		thousandscount = 0;
		String thousands = "";
		while (num >= 1000) {
			num -= 1000;
			thousandscount += 1;
		}
		if (thousandscount > 0) {
			switch(thousandscount) {
			case 1:
				thousands = "one thousand ";
				break;
			case 2:
				thousands = "two thousand ";
				break;
			case 3:
				thousands = "three thousand ";
				break;
			case 4:
				thousands = "four thousand ";
				break;
			case 5:
				thousands = "five thousand ";
				break;
			case 6:
				thousands = "six thousand ";
				break;
			case 7:
				thousands = "seven thousand ";
				break;
			case 8:
				thousands = "eight thousand ";
				break;
			case 9:
				thousands = "nine thousand ";
				break;
			}
		}
		return thousands;
	}
	
	public String getHundreds(int num) {
		hundredscount = 0;
		String hundreds = "";
		while (num >= 100) {
			num -= 100;
			hundredscount += 1;
		}
		if (hundredscount > 0) {
			switch(hundredscount) {
			case 1:
				hundreds = "one hundred ";
				break;
			case 2:
				hundreds = "two hundred ";
				break;
			case 3:
				hundreds = "three hundred ";
				break;
			case 4:
				hundreds = "four hundred ";
				break;
			case 5:
				hundreds = "five hundred ";
				break;
			case 6:
				hundreds = "six hundred ";
				break;
			case 7:
				hundreds = "seven hundred ";
				break;
			case 8:
				hundreds = "eight hundred ";
				break;
			case 9:
				hundreds = "nine hundred ";
				break;
			}
		}
		return hundreds;
	}
	
	public String getTens(int num) {
		tenscount = 0;
		String tens = "";
		while (num >= 10) {
			num -= 10;
			tenscount += 1;
		}
		if (tenscount > 1) {
			switch(tenscount) {
			case 2:
				tens = "twenty ";
				break;
			case 3:
				tens = "thirty ";
				break;
			case 4:
				tens = "fourty ";
				break;
			case 5:
				tens = "fifty ";
				break;
			case 6:
				tens = "sixty ";
				break;
			case 7:
				tens = "seventy ";
				break;
			case 8:
				tens = "eighty ";
				break;
			case 9:
				tens = "ninety ";
				break;
			}
		}
		return tens;
	}
	
	public String getOnes(int num) {
		String ones = "";
		onescount = 0;
		while (num >= 1) {
			num -= 1;
			onescount += 1;
		}
		if (onescount >= 0) {
			switch(onescount) {
			case 0:
				ones += "";
				break;
			case 1:
				ones += "one";
				break;
			case 2:
				ones += "two";
				break;
			case 3:
				ones += "three";
				break;
			case 4:
				ones += "four";
				break;
			case 5:
				ones += "five";
				break;
			case 6:
				ones += "six";
				break;
			case 7:
				ones += "seven";
				break;
			case 8:
				ones += "eight";
				break;
			case 9:
				ones += "nine";
				break;
			}
		}
		return ones;
		
	}
	
	public String getSpecial(int num) {
		String teens = "";
		if (num < 20 & num > 9) {
			switch(num) {
			case 10:
				teens = "ten";
				break;
			case 11:
				teens = "eleven";
				break;
			case 12:
				teens = "twelve";
				break;
			case 13:
				teens = "thirteen";
				break;
			case 14:
				teens = "fourteen";
				break;
			case 15:
				teens = "fifteen";
				break;
			case 16:
				teens = "sixteen";
				break;
			case 17:
				teens = "seventeen";
				break;
			case 18:
				teens = "eighteen";
				break;
			case 19:
				teens = "nineteen";
				break;
			}
		}
		return teens;
	}
	
	public String printHundreds(int num) {
		String printNumber = "";
		
		//if over 100, print hundreds
		//if over 19, print tens
		//if in teens, print special
		//print ones
		getHundreds(num);
		if (hundredscount > 0) {
			printNumber += getHundreds(num);
			num = num - hundredscount*100;
		}
		getTens(num);
		if (tenscount == 1) {
			printNumber += getSpecial(num);
			num = 0;
		}
		if (tenscount > 1) {
			printNumber += getTens(num);
			num = num - tenscount*10;
		}
		getOnes(num);
		if (onescount > 0) {
			printNumber += getOnes(num);
		}
		
		return printNumber;
	}
	
	public String printThousands(int num) {
		String printNumber = "";
		
		//if over 100, print hundreds
		//if over 19, print tens
		//if in teens, print special
		//print ones
		getThousands(num);
		if (thousandscount > 0) {
			printNumber += getThousands(num);
			num = num - thousandscount*1000;
		}
		getHundreds(num);
		if (hundredscount > 0) {
			printNumber += getHundreds(num);
			num = num - hundredscount*100;
		}
		getTens(num);
		if (tenscount == 1) {
			printNumber += getSpecial(num);
			num = 0;
		}
		if (tenscount > 1) {
			printNumber += getTens(num);
			num = num - tenscount*10;
		}
		getOnes(num);
		if (onescount > 0) {
			printNumber += getOnes(num);
		}
		
		return printNumber;
	}
	
}

		

