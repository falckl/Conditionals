package com.qa.garage;

public class Vehicle {
	
	//Vehicle attributes:
	//name
	//colour
	//price
	//fuel type
	//gears - automatic or manual
	private String name;
	private String colour;
	private double price;
	private String fuel;
	private String gears;
	
	//class constructor
	public Vehicle(String name, String colour, double price, String fuel, String gears) {
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.fuel = fuel;
		this.gears = gears;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		//price must be above 0
		if (price >= 0) {
			this.price = price;
		}
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getGears() {
		return gears;
	}

	public void setGears(String gears) {
		this.gears = gears;
	}
	
	public void vehicleSummary() {
		System.out.println("Vehicle specs for " + this.getName() + ":\n\t" + this.getColour() + ", £" + this.getPrice() + ". " + this.getFuel() + ", " + this.getGears() ); 
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", colour=" + colour + ", price=" + price + ", fuel=" + fuel + ", gears="
				+ gears + "]";
	}
	
	
	

}
