package com.learning.java.day1;

public class Operators {

	public static void main(String[] args) {
// We have 5 types of Operators 

//		1. Arithmetic operators  -      +   , - , * , / , % (Modulus) , ++ , --
//		2. Assignment Operators  -     =, += , -=, *=, /= , %=, &=, |=, ^= , >>=, <<=
//		3. Comparison Operators  -    ==, !=, >, <, <=, >=
//		4. Logical Operators     -    && -> AND, || -> OR, ! -> NOT
//		5. Bitwise Operators

		
		
//		1. Arithmetic operators  -      +   , - , * , / , % (Modulus) , ++ , --
		
		int a =10;
		int b = 21;
		int sum = a+b;
		int sub = b-a;
		int mul = a*b;
		int div = b/a;    // 20 /10 = 2.1
		int mod = b%a;    //20 % 10 = 1             10 | 21 | 2.1
//		                                                  20
//		                                                  -----
//		                                                  10
//		                                                  10
//		                                                  ------
//		                                                   0
		 
		a++; //( a = a+1)   11
		a++; // 12
		a++; //13
		int inc  = a;  //13
		
		     b--; // b = b-1  ; 21-1 = 20
		int dec  = b;
		
		
		
		int c = 12; 
		int d = 12;
		
		c++;  // 13
		c--;  // 12 ------------------------12
		d++;
		d--;  // 12 ------------------------12
	
	int e=	c++ + c++ + c++;
	
	      //12  + 13   + 14
	
	int f =  ++d + ++d + ++d;
	      //  13 + 14 + 15
	
	System.out.println("e :" + e);
	System.out.println("c :" + c);
	System.out.println("f :" + f);
	System.out.println("d :" +  d);
	
	
//1.  create a Java project -> 5 different packages  - > each package -> 5 classes 
//	  2.  create 5 variables with each type - > beside write the which data type it is in comments
//	  3.  above variables interchange by using typecasting.
//    4.  do some Arithmetic operations
		
		
	
//	2. Assignment Operators
	
	int x = 10;   // x=10
	
	    x += 12;  //x +=12; -> x=x+12   10 +12  = 22
	    
	   
	   int y = 5;
	    y-=1;   // y = y-1;  5-1=4;
	    
	    y *=2;  //  y = y*2 ; 8
	    
	   int z = y/2; //   z = 8/2 = 4; y =8;
	   
	   
	   
	   int k= y/z;  // k = 2 ? y = 8 ? z = 4?
	   
	   
	   // y =?   z= ?
	   
	   y %= 2;   // y = y%2; 
	   
	   // y =0

//		3. Comparison Operators  ==, !=, >, <, <=, >=    the result of comparison will always boolean (true or false) 
	   
	   
	  // check if x is equal to y and assign it to comparisonVar1
	   
	   boolean comparisonVar1 = (x==y);
	   System.out.println(x);
	   System.out.println(y);
	   boolean comparisonVa2 = (x!=y);
	   System.out.println(comparisonVar1);
	   System.out.println(comparisonVa2);
	   
	  System.out.println(!(x!=y));  //->  not (   x not equal y )  ->      not(true) -> false
	  System.out.println(!(x==y));  // x=22, y=0->  not (   x equal y )  ->      not(false) -> true
	                                //if x=22 , y==2->  not (   x equal y )  ->      not(true) -> false	   
	       
	   
	  y=22;
	  System.out.println(x >= y);  
	    
//		4. Logical Operators     -    && -> AND, || -> OR, ! -> NOT	    the result of comparison will always boolean (true or false)
	  
	                        //for Ex: true && true   && true    -> true    Other than this combo, it will give false
	                        //        false    false     false 
	                        //         false    false     true
	                        //          false     true     true
	                        //          false     true     true
	   boolean comparisonVa33 =  (x == y)  && (y > 10) && (x<10); 
	   
	   // || -> OR,      for Ex: false || false  ||  true     - > true 
	   
	   // !  -> NOT      for Ex : !true -> false      
	
	
		
	}

}
