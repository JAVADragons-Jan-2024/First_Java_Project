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
        
        Teacher teacher1 = new Teacher();
        teacher1.name = "Tom";
        teacher1.id = 1;
        teacher1.salary = 50;
        
        
        Driver driver1= new Driver();
        driver1.name = "Kim";
        driver1.id = 1;
        driver1.salary=120;
        
        emp1.work();
        teacher1.work();
        driver1.work();
        
        		 
        
	}

}
