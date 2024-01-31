package com.learning.java.day2;

public class IfElseConditions {

	public static void main(String[] args) {
		
		
		//       - the result of this condition has to be true or false
		// if(condition){
		// 
		// body of block
		//
		//} else {
		//
		//  Another block of Code
		//
        //}
		
		
		// how to check given number is a Even or Odd 
		
		// rem -> 0 when you div that number by 2 
		                                                    //    2 | 11  | 5
		//    (number % 2)  == 0    -> true                                  10
//		                                                             -----
//		            1                                                   1
		
		
		int numberVar = 11;
		
		if((numberVar % 2) == 0) {
			System.out.println("This is a Even Number");
		}else {
			System.out.println("This is a Odd Number");
		}
		
		
		//  timeArrive = 8
		//   early 
		//   late 
		//   ontime 
		
		int timeArrive = 9;
		int timeForDinner = 8;
		
		
		if(timeArrive == timeForDinner) {
			System.out.println(" We are ontime for Dinner");
		}else if(timeArrive <= timeForDinner) {
			System.out.println(" We are early or ontime for Dinner");
		}else if(timeArrive >= timeForDinner){
			System.out.println(" We are late or ontime for Dinner");
		}
		
		System.out.println("-------------------------------------------");
		
		if(timeArrive == timeForDinner) {
			System.out.println(" We are timeFordinner for Dinner");
		}
		
		if(timeArrive <= timeForDinner) {
			System.out.println(" We are early or ontime for Dinner");
		}
		
		if(timeArrive >= timeForDinner) {
			System.out.println(" We are late or ontime for Dinner");
		}
		
		
		
		
		// check and number if its even or odd 
		//  - > check and result number id div by 5
		// else its odd - >  add the value 13 to it   - > check and result number
		
		
		
	int anotherNumber = 15;
	
	  if( anotherNumber %2 ==0) {
		  
		  
		  if(anotherNumber % 5 == 0) {
			  System.out.println(" The result is div by 5 and its even");
		  }else {
			  System.out.println(" The result is not div by 5 and its even");  
		  }
		  
		  
		    
	  }else {
		  
		  
		  if(anotherNumber % 5 == 0) {
			  System.out.println(" The result is div by 5 and its Odd");
		  }else {
			  System.out.println(" The result is not div by 5 and its Odd");  
		  }
		  
		  
	  }
		
		
		
		

	}

}
