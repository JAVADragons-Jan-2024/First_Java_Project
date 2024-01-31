package com.learning.java.day2;

public class SwitchCondition {

	public static void main(String[] args) {
	
	// instead of writing many if..else , we will use switch statement
		
		// switch (expression){
		//  case : 
		//      ...write the code here 
		//    break;
		//
		//
		//
		//
		//
		//   default:
		//     ...write the code here
		// }
		
		  // We can have any number of case statements
		  // below is default statement, used when none of the cases is true. 
		  // No break is needed in the default case.
		
		  int dayNumber = 10 ;              // 0 - > Sunday 
   		                                   // 1 - > Monday
		                                   // 2 -> Tuesday   ......  6 -> Saturday
		          
		  switch (dayNumber) {
		  case 0 :
			  System.out.println("Sunday");
			  break;
		  case 1:
			  System.out.println("Monday");
			  break;
		  case 2:
			  System.out.println("Tuesday");
			  break;
		  case 3:
			  System.out.println("Wednesday");
			  break;
		  case 4:
			  System.out.println("Thursday");
			  break;
		  case 5:
			  System.out.println("Friday");
			  break;
		  case 6:
			  System.out.println("Saturday");
			  break;
		   default:
			   System.out.println("Please provide valid Input");
		  }
		  
		  
		  
	     // 10 , 20, 30, 40 ,50 ,60	    print if the given number is same else ask for valid input
		  
		  int numbervar = 50;
		  
		  switch(numbervar) {
		  case 10 :
			  System.out.println("This is number 10");
		      break;
		  case 20 :
			  System.out.println("This is number 20");
			  break;
		  case 30 :
			  System.out.println("This is number 30");
			  break;
		  case 40 :
			  System.out.println("This is number 40");
			  break;
		  case 50 :
			  if(numbervar % 2 == 0 ) {
				  System.out.println("This number is 50 and its even");
			  }else {
				  System.out.println("This number is 50 and its odd"); 
			  }
			  
			  System.out.println(" I am writing something here");
			  break;
		  case 60:
			  System.out.println("This is number 60");
			  break;
		  default:
			  System.out.println("Please provide values between 10 and 60");
		  }
		  
		  
		  
		  
      
	}

}
