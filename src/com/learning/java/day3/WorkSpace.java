package com.learning.java.day3;

public class WorkSpace {

	public static void main(String[] args) {

// How to create a Object from Class
//     className   ObjectReferenceName  = new   className() ;
	
		Car toyota = new Car();
		toyota.name = "x";
		toyota.model = "Gx";
		toyota.color = "white";
		toyota.mfgyear = 2024;
		toyota.mileage = 100;

		Car acura = new Car();
		acura.name = "y";
		acura.color = "red";
		acura.model = "rdx";
		acura.mfgyear = 2012;
		acura.mileage = 1000000;

		// How to call a non static Method 
		
	  // ObjectReferenceOfMethod.methodName();	
		toyota.startCar();
		
		// How to call a static Method 
		
		//ClassName.methodName();
		 Car.turnOnLights();
		 
		 WorkSpace workSpace1 = new WorkSpace();
		 
		 workSpace1.addNumbers();
		 

	}

	
	 public  void addNumbers() {
		 int a=10; int b=20;
		 
		 System.out.println(a+b);
	 }
	 
	 
	 
	 

	 // - > 2 non static variables 
	 // - > 2 static variables 
	 
	 // create 2 static methods  - > add , sub ->  print -> addition of static variables , sub ->  sub of static variables
	 
	 // create 2 non static methods  -> in body of method -> create a two variables  -> do mul in method, Div in another method
	 
	 
//	 Calling a non-static  method 
	 
//	 ObjectRef.methodName();
	 	 
// 	 ObjectRef.methodName(parameters);   parameters like (int a , int b, int c)    or  (float y, boolean x)
	 
	 
	 
}
