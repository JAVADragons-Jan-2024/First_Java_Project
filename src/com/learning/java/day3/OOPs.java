package com.learning.java.day3;

public class OOPs {

	public static void main(String[] args) {
	
		//OOP stands for Object-Oriented Programming.
		
		//-  Class   - > Objects 
		//------------------------------------------------------------------------------------------
		// --  Car    - > Volo , Toyota, Audi
		
		// car  -  This is the Car Class 
		//       ^
        //       |  ->  name, color, model, mfgyear, mileage 
		
		//what happens if I create a Object out of Car class
		
		// Car Object ->     Toyota - > name: xyz,  color: white, model rx 350, mfgYear: 2024, mileage: 0 miles
		
		
		
		//------------------------------------------------------------------------------------------
		// Animal - > this is a Animal Class 
		//   gender, type, no_legs, no_teeth 
		
		// Animal  Object   -> Cat  -> gender : female, type : xyz,   no_legs : 4, no_teeth : 24
		
		//------------------------------------------------------------------------------------------
		// Class  - > simple template for a Object. 
		
		// Attributes - > are declared with in a class, variables with a class 
		
		
		// Methods  -> are declared with in a class and that are used to perform certain actions
		
		//------------------------------------------------------------------------------------------
		
		
//		public class Car {
//			//name, color, model, mfgyear, mileage 
//			String name; 
//			String color; 
//			String model;
//			int mfgyear;
//			int mileage;
		
//			
//		}
		
		
	}
	
	
	// public void  methodName() {
	//      body of Method
    //  }
	public void driveCar() {
		System.out.println("This car is in Drive mode");
	}
	
	
	public void startCar() {
		
	}
	
	
	
//	Special Method called Constructors -> To Initialize the Objects.  - > it will be used to set the initial values of Object Attributes. 
//      Constructor is called to create an object.
	
	
//	How to create a Constructor
	
//      ClassName(){
//	
//	
//        }
	
//	
//      class 
//      Objects 
//      methods 
//      attributes
//      defining a class 
//      defing a methods
//      how to create an object 
//      how to call a method 
//      special method Constructors
//      diff between static and on static
//	    different types of Constructors
//	    final intro. 
	

	// How to create a Object from Class
//	     className   ObjectReferenceName  = new   className() ;
	  
	  

		// How to call a non static Method 
		
	  // ObjectReferenceOfMethod.methodName();	
//		toyota.startCar();
		
		// How to call a static Method 
		
		//ClassName.methodName();
		// Car.turnOnLights();
		 
		 
		// difference between static and non-static variables /methods
		// -> when it is static it belongs to that class
		// -> non static variables /methods, nothing but a variables /methods without
		// keyword "static"
		// these are belong to instances of class.
	
	
//		 // Empty Constructor
//
//		 public Person(){
//			 
//		 }
//
//		 // Parameterized Constructor 
//		 
//	       public Person(int ageinput, String nameInput ){
//	    	   name = nameInput;
//	    	   age = ageinput;
//			 
//		   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
}
