package com.learning.java.day1;

public class TypeCasting {

	public static void main(String[] args) {
      
	// wide Casting
	// byte -> short -> char -> int -> long -> float -> double	
		
		int a = 10;
		double b = a;
		System.out.println(a);
		System.out.println(b);
		
		
    // Narrow Casting 
		
    // byte <- short <- char <- int <- long <- float <- double
		
		double c = 120;
		byte d = (byte)c;
		
		System.out.println(c);
		System.out.println(d);

	}

}
