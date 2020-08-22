package com.classesandobjects;

public class Car {
	
	//instance variables/class variables(declaration)
    int model;
	String name; 

	public static void main(String[] args) {
		
		//new Car();---> object 1
		Car obj= new Car();//obj is reference variable
		Car obj1= new Car();
		Car obj2= new Car();
		
		obj.model= 112;
		obj.name= "Audi";
		
		obj1.model= 222;
		obj1.name= "BMW";
		
		obj2.model= 422;
		obj2.name= "Maruti";
		
		System.out.println(obj.name);
		
		
		
		

	}

}
