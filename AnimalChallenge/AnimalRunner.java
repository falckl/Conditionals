package com.qa.day4;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//use Animal methods (set up animal). Use sleep and drink interfaces.
		Animal dog = new Animal();
		dog.sleep();
		dog.drinks();
		dog.move();
		dog.setWhatAmI("I am a dog!");
		dog.getWhatAmI();
		
		//Use Fish methods
		Fish salmon = new Fish();
		salmon.sleep();
		salmon.move();
		System.out.println(salmon.getGills());
		salmon.setNoise("blubbedy blub");
		System.out.println(salmon.getNoise());
		
		//Use Bird methods
		Bird robin = new Bird();
		robin.getFeathers();
		
		//Use Insect methods
		Insect spider = new Insect();
		System.out.println(spider.getCrawls());
		spider.setEyes(8);
		System.out.println(spider.getEyes());
		
		

	}

}
