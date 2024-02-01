package com.learning.java.day4;

public class IntroToAccessModifiers {

	public static void main(String[] args) {
	
		// public 
		
//		Types of Access Modifiers  : 4  - > 
//		1. Public 
//		2. private
//		3. default
//		4. Protected
		
		
//		1. Public  - this is a keyword we use as access modifier, it is used to set the access level for Class, attributes, methods  and constructors.
//                     Accessible to all

//		2. private  - it can only be accessible within that particular class. we can not access these outside of class.
//      3. default  - it can only be accessible within that particular package. we can not access these outside of package.
//		4. Protected - it can only be accessible within that particular package and subclasses. we can not access these outside of package and subclasses.
		
//		Non- Access Modifiers :
		
		
//		1. Final 
//		2. Static
//		3. abstract
//		4. transient 
//		5. synchronized
//		6. volatile
		
		
		Employee emp = new Employee("hemanth", 55, 10000000);
		emp.method1();
		emp.method2();
//		emp.method3();
		int age = emp.age;
		int noOfHours = emp.noOfhours;
		
		
		
		
		

	}

}
