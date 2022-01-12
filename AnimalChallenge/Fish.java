package com.qa.day4;

public class Fish extends Animal{
	
	private String gills = "I have gills";
	private String noise = "blub";
	
	public String getGills() {
		return gills;
	}
	
	public void setGills(String newGills) {
		this.gills = newGills;
	}
	
	public String getNoise() {
		return noise;
	}
	
	public void setNoise(String newNoise) {
		this.noise = newNoise;
	}

}