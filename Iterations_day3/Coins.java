package com.qa.day3;

public class Coins {
	
	//Given a cost and an amount, work out the change given in specific coinage.
	
	//cost variable
	//amount variable
	//amount - cost
	//£50, £20, £10, £5, £2, £1, 50p, 20p, 10p, 5p, 2p, 1p.
	
	public String changeToGive(double cost, double amount) {
		String changesummary = "";
		if (cost <= amount) {
			
			cost = cost*100;
			int costint = (int)cost;
			amount = amount*100;
			int amountint = (int)amount;
			
			double remainder = amountint - costint;
			int hundreds = 0;
			int fifties = 0;
			int twenties = 0;
			int tens = 0;
			int fives = 0;
			int twos = 0;
			int ones = 0;
			int fiftyps = 0;
			int twentyps = 0;
			int tenps = 0;
			int fiveps = 0;
			int twops = 0;
			int onep = 0;
		
			while (remainder > 0) {
				if (remainder >= 10000) {
					remainder -= 10000;
					hundreds ++;
				} else if (remainder >= 5000) {
					remainder -= 5000;
					fifties ++;
				} else if (remainder >= 2000) {
					remainder -= 2000;
					twenties ++;
				} else if (remainder >= 1000) {
					remainder -= 1000;
					tens ++;
				} else if (remainder >= 500) {
					remainder -= 500;
					fives ++;
				} else if (remainder >= 200) {
					remainder -= 200;
					twos ++;
				} else if (remainder >= 100) {
					remainder -= 100;
					ones ++;
				} else if (remainder >= 50) {
					remainder -= 50;
					fiftyps ++;
				} else if (remainder >= 20) {
					remainder -= 20;
					twentyps ++;
				} else if (remainder >= 10) {
					remainder -= 10;
					tenps ++;
				} else if (remainder >= 5) {
					remainder -= 5;
					fiveps ++;
				} else if (remainder >= 2) {
					remainder -= 2;
					twops ++;
				} else if (remainder >= 1) {
					remainder -= 1;
					onep ++;
				} //end of remainder if's.
			} //while loop ends
	
			//if statements to add to changesummary as required
			if (hundreds > 1) {
				changesummary += hundreds + " £100 notes\n";
			} else if (hundreds > 0) {
				changesummary += hundreds + " £100 note\n";
			}
			if (fifties > 1) {
				changesummary += fifties + " £50 notes\n";
			} else if (fifties > 0) {
				changesummary += fifties + " £50 note\n";
			}
			if (twenties > 1) {
				changesummary += twenties + " £20 notes\n";
			} else if (twenties > 0) {
				changesummary += twenties + " £20 note\n";
			}
			if (tens > 1) {
				changesummary += tens + " £10 notes\n";
			} else if (tens > 0) {
				changesummary += tens + " £10 note\n";
			}
			if (fives > 1) {
				changesummary += fives + " £5 notes\n";
			} else if (fives > 0) {
				changesummary += fives + " £5 note\n";
			}
			if (twos > 1) {
				changesummary += twos + " £2 coins\n";
			} else if (twos > 0) {
				changesummary += twos + " £2 coin\n";
			}
			if (ones > 1) {
				changesummary += ones + " £1 coins\n";
			} else if (ones > 0) {
				changesummary += ones + " £1 coin\n";
			}
			if (fiftyps > 1) {
				changesummary += fiftyps + " 50p coins\n";
			} else if (fiftyps > 0) {
				changesummary += fiftyps + " 50p coin\n";
			}
			if (twentyps > 1) {
				changesummary += twentyps + " 20p coins\n";
			} else if (twentyps > 0) {
				changesummary += twentyps + " 20p coin\n";
			}
			if (tenps > 1) {
				changesummary += tenps + " 10p coins\n";
			} else if (tenps > 0) {
				changesummary += tenps + " 10p coin\n";
			}
			if (fiveps > 1) {
				changesummary += fiveps + " 5p coins\n";
			} else if (fiveps > 0) {
				changesummary += fiveps + " 5p coin\n";
			}
			if (twops > 1) {
				changesummary += twops + " 2p coins\n";
			} else if (twops > 0) {
				changesummary += twops + " 2p coin\n";
			}
			if (onep > 0) {
				changesummary += onep + " 1p coin\n";
			}
				
		} // if true ends
		else {
			changesummary = "Not enough cash";
		}
		
		return changesummary;
	} // change method ends
	
	
} // class ends
