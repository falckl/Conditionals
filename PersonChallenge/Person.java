package com.qa.day5;

public class Person{
	
	private String name;
	private int age;
	private String jobTitle;
	
	//class constructor.
	public Person(String name, int age, String jobTitle) {
	this.name = name;
	this.age = age;
	this.jobTitle = jobTitle;

	}
	
	public void getAttributes() {
		System.out.println("My name is " + name + ", I am " + age + " years old. I am a " + jobTitle + ".");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getJob() {
		return jobTitle;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public void setJob(String newJob) {
		this.jobTitle = newJob;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "My name is " + name + ", I am " + age + " years old. I am a " + jobTitle + ".";
	}
	// ^ overriding the toString method which is already present by default with java.
	
	
}
