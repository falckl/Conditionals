package com.qa.day4;

public class Animal implements Sleep, Drinks {
	
	private int numberOfEyes = 2;
	private boolean breathes = true;
	private String whatAmI = "I'm an animal";
	
	public void sleep() {
		System.out.println("zzz");
	}
	
	public void drinks() {
		System.out.println("slurp");
	}
	
	public void move() {
		System.out.println("I can move");
	}
	
	public boolean getBreathes() {
		return breathes;
	}
	
	public void setBreathes(boolean canBreathe) {
		this.breathes = canBreathe;
	}
	
	public int getEyes() {
		return numberOfEyes;
	}
	
	public void setEyes(int howManyEyes) {
		this.numberOfEyes = howManyEyes;
	}
	
	public String getWhatAmI() {
		return whatAmI;
	}


}
