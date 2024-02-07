package com.learning.java.day6;

public class Employee {
	
	
	String name;
	int id;
	double salary;
	
	
	@Override
	public String toString() {
  
		return "["+id+" "+name + " " + salary+"]";
		
		
	}
	
	
   public boolean equals(Employee obj) {
		
		return  this.id == obj.id && this.name == obj.name;
	}
   
   
   
   
   public void work() {
	   System.out.println(this.name + " is woking.");
   }

}
