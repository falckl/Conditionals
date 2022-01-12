package com.qa.garage;

public class Motorhome extends Vehicle {

	//berth (number of beds)

	private int berth;
	
	public Motorhome(String name, String colour, double price, String fuel, String gears, int berth) {
		super(name, colour, price, fuel, gears);
		this.berth = berth;
		// TODO Auto-generated constructor stub
	}

	public int getBerth() {
		return berth;
	}

	public void setBerth(int berth) {
		if (berth <= 10 && berth > 0) {
			this.berth = berth;
		} else {
			System.out.println("Error - out of range");
		}
	}
	
	public void motorhomeSummary() {
		this.vehicleSummary();
		System.out.println("\tType = Motorhome. Berth = " + this.getBerth());
	}
	
	
	
}
