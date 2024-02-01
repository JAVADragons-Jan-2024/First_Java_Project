package com.learning.java.day4;

public class ClassWorkOfAccessModifiers {

	
	public static void main(String[] args) {
		Person person1 = new Person("x", 12, 100, 2);
		
		
//		person1.ssn
		person1.insurenceInfo();
		
		String dob = person1.Dob;
		
		boolean checkforPerson1 = person1.insurencecheck();
		int updatedCreditScoreForPerson1 = person1.creditCheck();
	}
	
	
	// create a public  employee class  - > name, age , phonenumber as public ,    
    //	       - private   salary, bonus,   Protected noOfhours 
	// parameterized Constructor with name and age, salary
	// 2 public methods 
	// 2 private methods 
	// 1 private static parameterized method
	// 1 public non static  parameterized method
	// write a method to return the employee salary + bonus.
}
