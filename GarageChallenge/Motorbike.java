package com.qa.garage;

public class Motorbike extends Vehicle {
	
	//independent attributes
	//cc 
	//type - moped/motorbike
	
	private int cc;
	private String type;

	public Motorbike(String name, String colour, double price, String fuel, String gears, int cc, String type) {
		super(name, colour, price, fuel, gears);
		this.cc = cc;
		this.type = type;
		// TODO Auto-generated constructor stub
	}
	
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		//if cc correct (50, 125, 250, 400, 600, 800, 1000)
		if (cc == 50 || cc == 125 || cc == 250 || cc == 400 || cc == 600 || cc == 800 || cc == 1000) {
			this.cc = cc;
		} else {
			System.out.println("Error - out of range");
		}
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void bikeSummary() {
		this.vehicleSummary();
		System.out.println("\tType = " + this.getType() + ". Engine size = " + this.getCc());
	}
	

}
