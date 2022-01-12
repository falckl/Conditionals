package com.qa.garage;

public class Car extends Vehicle {

	//type - hatchback/saloon/SUV etc.
	//doors
	//engine size
	private String bodyType;
	private int doors;
	private double engineSize;
	
	public Car(String name, String colour, double price, String fuel, String gears, String bodyType, int doors, double engineSize) {
		super(name, colour, price, fuel, gears);
		this.bodyType = bodyType;
		this.doors = doors;
		this.engineSize = engineSize;
	
		// TODO Auto-generated constructor stub
	}
	
	public String getBodyType() {
		return bodyType;
	}
	
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		if (doors > 1 && doors <=6) {
			this.doors = doors;
		} else {
			System.out.println("Error - out of range");
		}
	}
	
	public double getEngineSize() {
		return engineSize;
	}
	
	public void setEngineSize(double engineSize) {
		//if between 0.9 and 8.4
		if (engineSize >= 0 && engineSize <= 8.4) {
			this.engineSize = engineSize;
		} else {
			System.out.println("Error - out of range");
		}
	}
	
	public void carSummary() {
		this.vehicleSummary();
		System.out.println("\tType = " + this.getBodyType() + " car. Doors = " + this.getDoors() + ". Engine size = " + this.getEngineSize());
	}
	
	

}
