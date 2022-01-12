package com.qa.day5;

public class Runner {
	
	public static void main(String[] args) {
		
		//create example objects for Person class
		
		Person person1 = new Person("John", 29, "Baptist");
		Person person2 = new Person("Stacy", 42, "Mom");
		Person person3 = new Person("Frodo", 34, "Adventurer");
		
		
		//add to list
		PersonList myList = new PersonList();
		myList.addPeople(person1);
		myList.addPeople(person2);
		myList.addPeople(person3);
		myList.addPeople(new Person("Jojo", 18, "Student"));
		
		myList.printPeople();
		
		myList.getPeople();
		
		System.out.println(myList.searchPeople("Jojo"));
		System.out.println(myList.searchPeople("Jamie"));
		
		System.out.println(person1.toString());
	}

}
