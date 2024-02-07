package com.learning.java.day6;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading mo= new MethodOverloading();
		mo.add(10.0,20.0,10.1);
		double output = mo.add(10.0,20.0,10);
		System.out.println(output);

	}

	public void add(int i, int j, int k) {
	System.out.println(i+j+k);
		
	}
	
	public void add(int i, int j) {
		System.out.println(i+j);
			
		}
	
	public void add(double i, double j) {
		System.out.println(i+j);
			
	}
	
	public void add(double i, double j, double k) {
		System.out.println(i+j+k);
			
	}
	
	
	public double add(double i, double j, int k) {
		
		double z= i + j +k;
				
		return z;
			
	}
	
	
	

}
