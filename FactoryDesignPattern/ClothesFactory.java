package com.qa.javaintermediate;

public class ClothesFactory {
	
	//use getClothes method to get object of type Clothes
	public Clothes getClothes(String clothingType){
		
	      if(clothingType == null){
	         return null;
	      }		
	      if(clothingType.equalsIgnoreCase("Jeans")){
	         return new Jeans();
	         
	      } else if(clothingType.equalsIgnoreCase("Sweater")){
	         return new Sweater();
	         
	      } else if(clothingType.equalsIgnoreCase("Socks")){
	         return new Socks();
	      }
	      return null;
	      
	   }

}
