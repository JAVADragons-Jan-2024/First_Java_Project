package com.learning.java.day2;

public class HwDay2 {

	public static void main(String[] args) {
		// write a code to assign grades 
				//  > 90     - O
		         // 90 -80  - A
				// 80- 70  - B
				// 70 -60  - C
				// 60 - 50  - D
			    // <50      - F
				
		// write a code to check given year is leap year or not. 
		// print values from 1000 to 1 in reverse order   like  1000, 999, 998 .....1
		// print values from 231 to 642   like 231, 233, 235 ....... 641
		// print a multiples of 5 till 50;
		
		
		int marks = 76;
		
		if(marks > 90) {
			System.out.println("Grade is : O");
		}else if(marks <=90 && marks > 80) {
			System.out.println("Grade is : A");
		}else if(marks <=80 && marks > 70) {
			System.out.println("Grade is : B");
		}else if(marks <=70 && marks > 60) {
			System.out.println("Grade is : C");
		}else if(marks <=60 && marks > 50) {
			System.out.println("Grade is : D");
		}else {
			System.out.println("Grade is : F");
		}
		
		for(int i =1000; i > 0 ; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		int j=231; 
		
		while(j <= 641) {
			System.out.print(j+" ");
			j= j+2;
		}
		
		System.out.println();
		for(int i =5; i <=50; i=i+5) {
			System.out.println(i);
		}
		
		for(int i =1; i <=10; i++) {
			System.out.println(i*5);
		}
		
		
		//write a code to check given year is leap year or not. 
		/// (div by 4 and  not by 100) or div by 400
		
		int year = 1888;
		
		if(  (year % 4 == 0 && year % 100 != 0) || year % 400 == 0    ) {
			System.out.println(" This is a Leap Year");
		}else {
			System.out.println(" This is not a Leap Year");
		}
			
		int age= 18; 
		
		if( age < 18) {
			System.out.println(" minor");
		}else {
			System.out.println("not a minor");
		}
		
		
		
	
	}

}
