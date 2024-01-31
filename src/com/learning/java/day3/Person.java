package com.learning.java.day3;

public class Person {
	
	 String name;
	 int age; 
	 String dob;
	 double salary; 
	 
  final static int no_of_eyes =2;
	 static int no_of_legs =2;
	 static boolean ishuman = true; 
	 
	 // Empty Constructor

	 public Person(){
		 
	 }

	 // Parameterized Constructor 
	 
       public Person(int ageinput, String nameInput ){
    	   name = nameInput;
    	   age = ageinput;
		 
	   }

	 
	public static void main(String[] args) {
//		
		Person shiksi = new Person(33, "shiksi" );
		
		Person metie = new Person(35, "Metie");
		
		Person anuj = new Person(12, "anuj");
	    
		
		Person pavani = new Person();

		
		System.out.println(shiksi.name);
		
		System.out.println(metie.name);
		System.out.println(anuj.name);
		
		System.out.println(anuj.no_of_eyes);
		System.out.println(metie.no_of_eyes);
		

	}
	
	
	

}
