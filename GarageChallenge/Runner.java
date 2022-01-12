package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create motorbikes
		Motorbike bike1 = new Motorbike("Suzuki", "green", 1200, "Petrol", "Manual", 125, "Moped");
		bike1.bikeSummary();
		
		
		//create cars
		Car car1 = new Car("Mini", "yellow", 12000, "Petrol", "Manual", "Hatchback", 3, 1.4);
		Car car2 = new Car("Audi","black", 14000, "Diesel", "Manual", "Hatchback", 5, 1.6);
		Car car3 = new Car("BMW", "white", 34000, "Electric", "Automatic", "Sports", 3, 0);
		car1.carSummary();
		car2.carSummary();
		car3.carSummary();
		
		//create motorhomes
		Motorhome m1 = new Motorhome("Mercedes", "grey", 43000, "Diesel", "Manual", 4);
		m1.vehicleSummary();
		m1.motorhomeSummary();
		
		//add all vehicles to list.
		Garage garage1 = new Garage();
		
		garage1.addVehicle(m1);
		garage1.addVehicle(bike1);
		garage1.addVehicle(car1);
		garage1.addVehicle(car2);
		garage1.addVehicle(car3);
		
		//check calculateBill method
		System.out.println(garage1.calculateBill(car1));
		System.out.println(garage1.calculateBill(m1));
		System.out.println(garage1.calculateBill(bike1));
		
//		garage1.iterateBills();
//		garage1.getList();
//		garage1.removeVehicle(car1);
//		garage1.removeByType("Motorbike");
//		garage1.getList();
//		garage1.emptyGarage();
		garage1.getList();
		
		System.out.println(car1);
		
	}

}
