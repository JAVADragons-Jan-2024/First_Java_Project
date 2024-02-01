package com.learning.java.day3;

// create a class calculator 
public class Calculator {
	// - > 2 non static variables 
	int x;
    int y;
    
	// - > 2 static variables 
    static int z =20;
    static int w =12;
	
	public static void main(String[] args) {
		  
//		 // static
//		  Calculator.add();
//		  Calculator.sub();
//		  
		  System.out.println(Calculator.z);
//		  System.out.println(Calculator.w);
		  
		  // non -static                       
		  
		  Calculator calc1= new Calculator();
//		  calc1.sub();
//		  calc1.div();
		  calc1.x = 10;
		  calc1.y = 52;
		  calc1.z = 20;
		  calc1.mul(12, 4);
		  Calculator calc2= new Calculator();
		  
		  System.out.println(calc2.z);
		
	}

	
	 // create 2 static methods  - > add , sub ->  print -> addition of static variables , sub ->  sub of static variables
	
	
	public static void add() {
		
		System.out.println(Calculator.z +Calculator.w);
		
	}
	
	public static void sub() {
		
		System.out.println(Calculator.z - Calculator.w);
		
	}
	
	 // create 2 non static methods  -> in body of method -> create a two variables  -> do mul in method, Div in another method
	

	public  void mul(int a, int b) {
	
		
		System.out.println(a*b);

	}
	
	public  void div() {
		int a=10; int b=5;
		
		System.out.println(a/b);

	}
	
}
