package com.qa.day1exercises;

public class Flowcharts {

	public static void main(String[] args) {
		
		int A = 150;
		
		//first line
		if (A > 2000) {
			System.out.println("A");
			
			//second line
			if (A > 6000) {
				System.out.println("C");
				//end of flow
			} else {
				System.out.println("B");
				//third line
				if (A > 4000) {
					System.out.println("D");
					//end of flow
				} else {
					System.out.println("E");
					//end of flow
				}
				
			}
			
		} else {
			System.out.println("1");
			//second line
			if (A > 100) {
				System.out.println("3");
				//third line
				if (A > 600) {
					System.out.println("5");
					//end of flow
				} else {
					System.out.println("4");
					//fourth line
					if (A > 500) {
						System.out.println("6");
						//end of flow
					} else {
						System.out.println("7");
						//end of flow
					}
				}
			} else {
				System.out.println("2");
				//end of flow
			}
		}
		//
		
		
	}
	
	
}
