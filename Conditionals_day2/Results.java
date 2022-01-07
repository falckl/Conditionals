package com.qa.day1exercises;

public class Results {
	int physics;
	int chemistry;
	int biology;
	int total;
	int result;
		
	public void totalMark() {
		
		total = physics + chemistry + biology;
		System.out.println("Physics mark = " + physics);
		System.out.println("Chemistry mark = " + chemistry);
		System.out.println("Biology mark = " + biology);
		System.out.println("Total mark = " + total);

	}
	
	public void percentage() {
		totalMark();
		int failcounter = 0;
		
		if ((physics * 100 / 150) < 60) {
			failcounter ++;
		}
		if ((biology * 100 / 150) < 60) {
			failcounter ++;
		}
		if ((chemistry * 100 / 150) < 60) {
			failcounter ++;
		}
		
		result = total * 100 / 450;
		
		if (failcounter ==0) {
		// don't need to check if total percentage is under pass mark as this is included in the above.
			System.out.println("Percentage = " + result + "% \nCongratulations, you have passed all subjects!");
			
		} else {
			System.out.println("Percentage = " + result + "% \nUnfortunately you have failed in " + failcounter + " subject(s)");
		}
	}
	

}
