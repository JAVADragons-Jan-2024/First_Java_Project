package com.learning.java.day7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExampleClass {

	public static void main(String[] args) throws OwnException {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(" Enter a Value");
//		
//		int a = scanner.nextInt();
//		System.out.println(" Enter b Value");
//		int b = scanner.nextInt();
//		
//	
//		
//		try {
//			int c = a/b;
//			System.out.println("a/b " + c);
//		}catch (Exception e) {
//			// TODO: handle exception
//			
//			System.out.println(" You can not divide with Zero");
//		} finally {
//			System.out.println(" Exception is rised and handled");
//		}
//		
//		int d = a+b;
//		int e = a-b; 
//		int f = a*b;
//		
//		
//		System.out.println("a+b " + d);
//		System.out.println("a-b " + e);
//		System.out.println("a*b " + f);
//		
//		scanner.close();
		
		
		
		ThrowExample ex = new ThrowExample();
		
	   try {
			ex.age();
	} catch (Exception e) {
		
		
		
//     	e.printStackTrace();
		
		System.out.println(e.getMessage());
		
//		System.out.println(e);
		
		System.out.println(" we will come back next year");
	}
		

	}

}
