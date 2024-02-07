package com.learning.java.day5;

public class StringsIntro {

	public static void main(String[] args) {

//      String 
//		  - > Non primitive data type 
//		  - >  " " , New
//		  -> A String variable contains a collection of characters 
		
		
// some of RAM in our system will be divided into two parts 
		
//		1. Heap Memory  - > All the java Object will store in this memory
//		   1.1 - > String leteral Pool 
		
//		2. Stack Memory - > Execution flow of the application. 
		
		
		
//		  index      012345678910
		String s1 = "BinaryLogic"; 
		String s2 = new String("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = "BinaryLogic";
		String s4 = "Good morning";
		String s5 = new String("BinaryLogic");
		 
		
//		concat 
				
				System.out.println(s4 +" "+ s3);
				
				
				int a = 10 ;
				 int b = 20; 
				 int c = a+b;
				 
				 System.out.println(" This is sum of a & b :"+ c);
				 
				 System.out.println(0 + a+b + " This is sum of a & b :");
				 System.out.println(" This is sum of a & b :"+ a + b);
				 
//	 	==  equals 
				 
				System.out.println(s1  == s3);
				System.out.println(s1  == s5);
				
				System.out.println(s1.equals(s5));
				
//		length
				
				System.out.println(s1.length());
				
//		indexOf
				
				System.out.println(s1.indexOf('L'));
				
// upperCase 
				System.out.println(s1.toUpperCase());
				
//	lower case 
				System.out.println(s1.toLowerCase());
		
//  get  char at position / index  
				
				System.out.println(s1.charAt(4));
				
				
	}

}
