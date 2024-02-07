package com.learning.java.day7;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) {

	}

	public void age() throws OwnException {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a age");

		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println(" Vote");
		} else {
			throw new OwnException("Please come back");
		}

	}
}
