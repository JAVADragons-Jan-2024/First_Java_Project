package com.learning.java.day5;

import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		
//       Scanner class   - > java.util package
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println(" Give me you name: ");
		
		String name = scanner1.nextLine();		
		System.out.println(name);
		
		System.out.println(" Give me loop: ");
		int loop = Integer.parseInt(scanner1.nextLine());
		
		for(int i =0; i <=loop; i++) {
			System.out.print(i + " ");
		}
		
		scanner1.close();
			

		
		
		
		
		
		
		
	}

}
