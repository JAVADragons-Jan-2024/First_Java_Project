package com.learning.java.day5;

import java.util.Scanner;

public class ScannerClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Name : BINARY
//		Id : 123
//		Mobile :  ********
//		Address :  xyz
		
		Scanner mySacnner = new Scanner(System.in);  //"123";
		
		
		String name = mySacnner.nextLine();
		int   id = mySacnner.nextInt(); //Integer.parseInt("123");
		int   mobile = mySacnner.nextInt();
		String address = mySacnner.next();
		
		
		System.out.println("Name : "+ name.toUpperCase());
		System.out.println("Id : "+ id);
		System.out.println("Mobile : "+ mobile);
		System.out.println("Address : "+ address.toUpperCase());
		
		mySacnner.close();

	}

}
