package com.qa.day5;

import java.util.ArrayList;
import java.util.List;

//import com.qa.day5.Person; <<<only needed if in different package.


public class PersonList {
	
	
	//make the list private so it can't be changed
	private List<Person> people = new ArrayList<>();
	
	public void printPeople() {
		for (Person p : this.people) {
			p.getAttributes();
		}
	}
	
	//public method to add people
	public void addPeople(Person p) {
		this.people.add(p);
		
	}
	
	//public method to find people
	public String searchPeople(String nameToSearch) {
		for (Person p : people) {
			if (p.getName().equals(nameToSearch)) {
				return nameToSearch + " is in the list";
			} 
		}
		return nameToSearch + " is not in the list";
		
	}
	
	public void getPeople() {
		for (Person p : people) {
			System.out.println(p.getName());
		}
	}
	

}

