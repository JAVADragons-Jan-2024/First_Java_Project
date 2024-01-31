package com.learning.java.day2;

public class LoopStatements {

	public static void main(String[] args) {
	
		// For Loop 
		// While Loop 
		// Do while 
		
		
		for(int i =0; i < 10; i++) {
			System.out.println("loop");   // 10 time
		}
		// 0 1 2 3 4 5 6 7 8 9     i <=9  10
		for(int j =0; j < 10; j++) {
			System.out.println("loop");   // 10 time
		}
		System.out.println("-------------------------");
		// print only even numbers form 10 to 20     
		
		for(int i =10; i <= 20; i= i+2) {
			System.out.println("loop "+ i);
			System.out.println(i);
		}
		System.out.println("-------------------------");
		//// print only odd numbers form 10 to 20 
		
		for(int i =10; i <= 20; i= i+5) {
			System.out.println("loop "+ i);
			 if(i % 2 ==1) {
				 System.out.println(i);
			 }
		}
		System.out.println("-------------------------");
		
		// print the numbers from 10 9 8 7 6 5 4 3 2 1 | 0 -1 -2 -3 -4
		
//          for(initialization ; condition ; increment/decrement){
//
//
//
//           }
		
		for(int i =10; i >=1 ; i--) {
			System.out.println(i);
		}
		
		// print 10, 20 ,30 ,40 ,50   up to 250 | .......10000
		
		
		for( int i =10; i <=250;i=i+10) {
			System.out.println(i);
		}
		
		
		
		
		for(int i = 1 ; i <= 5 ; i++) {
			
			System.out.println(" This is my outer for Loop "+ i);
			
			for(int j =1; j <=3; j++) {
				System.out.println("InnerLoop: "+ j);
			}
			
			
		}
		
//	/------------------------------------------------While 
	
//		for(initialization ; condition ; increment/decrement)
		
		
//		initialization
		
//		while(condition){
//		
//		
//		
//		   increment/ decrement
//		}
		
		// 1,2,3,4,5,6,7,8,9,10,| 11
		int i=1;
		while(i <=10) {
			System.out.println(i);
			i++;
		}
		
		///while print 450, ...........    650   in reverse order   like 650, 640, 630 .... 450 |....440, 430 420
		
		int z= 650; 
		while(z >= 450) {
			System.out.println(z);
			z=z-10;
		}
		
		
		// --------------------------------------Do while 
		
		
		
//		initialization
//		
//		do {
//			body of block 
//			
//			   increment/ decrement
//		}
//		while (condition);
		
		int j =100;
		do {
			System.out.println("This is loop from 1 : 10");
			j++;
		}
		while(j <=10);
		
		
		
// write a code to assign grades 
		// 90 -80  - A
		// 80- 70  - B
		// 70 -60  - C
		// 60 - 50  - D
	    // <50      - F
		
// write a code to check given year is leap year or not. 
// print values from 1000 to 1 in reverse order   like  1000, 999, 998 .....1
// print values from 231 to 642   like 231, 233, 235 ....... 641
// print a multiples of 5 till 50;
		
		
		
		
	}

}
