package com.learning.java.day6;

public class ObjectsIntro {

	public static void main(String[] args) {
		
// Object is pearent class for all the objects. Java.lang
		
//		toString() - 
		
		Employee emp1 = new Employee();
		emp1.name = "xyz";
		emp1.id = 12;
		emp1.salary = 100.00;
		
		Employee emp2 = new Employee();
		emp2.name = "xyz";
		emp2.id = 12;
		emp2.salary = 100.00;
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println();
        emp1.hashCode();
       
        System.out.println( emp1.equals(emp2));
        
        
        
        		 
        
	}

}
