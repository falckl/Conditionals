package com.qa.javaintermediate;

public class ClothesFactoryDemo {
	
	public static void main(String[] args) {
		
	      ClothesFactory clothesFactory = new ClothesFactory();

	      //get an object of Jeans and call its make method.
	      Clothes clothing1 = clothesFactory.getClothes("Jeans");

	      //call draw method of Circle
	      clothing1.make();

	      //get an object of Sweater and call its make method.
	      Clothes clothing2 = clothesFactory.getClothes("Sweater");

	      //call draw method of Rectangle
	      clothing2.make();

	      //get an object of Socks and call its make method.
	      Clothes clothing3 = clothesFactory.getClothes("Socks");

	      //call draw method of square
	      clothing3.make();
	   }

}
