package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	//store all vehicles in a private list
	
	private List<Vehicle> vehicles = new ArrayList<>();
	private List<Vehicle> toRemove = new ArrayList<>();
	//method to add vehicles to list.
	
	public void addVehicle(Vehicle v) {
		vehicles.add(v);
	}
	
	//method to remove vehicles to list.
	
	public void removeVehicle(Vehicle v) {
		vehicles.remove(v);
	}
	
	public void removeByType(String type) {
		for (Vehicle v : vehicles) {
			if (v.getClass().getSimpleName().equals(type)) {
				//add to remove list
				toRemove.add(v);
			}
		}
		//remove vehicles
		vehicles.removeAll(toRemove);
	}
	
	//bills method depending on type of vehicle = same as "fix" method
	
	public double calculateBill(Vehicle v) {
		if (v.getClass().getSimpleName().equals("Car")) {
			return v.getPrice()*0.1;
		} else if (v.getClass().getSimpleName().equals("Motorbike")) {
			return v.getPrice()*0.2;
		} else if (v.getClass().getSimpleName().equals("Motorhome")) {
			return v.getPrice()*0.05;
		}
		return 0;
	}
	
	//iterate through each vehicle in list to calculate it's bill
	public void iterateBills() {
		for (Vehicle v : vehicles) {
			System.out.println(calculateBill(v));
		}
	}
	
	public void getList() {
		for (Vehicle v : vehicles) {
			System.out.println(v);
		}
	}
	
	public void emptyGarage() {
		vehicles.clear();
	}
	

}
