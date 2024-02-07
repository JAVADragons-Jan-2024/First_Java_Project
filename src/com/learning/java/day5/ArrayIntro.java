package com.learning.java.day5;

public class ArrayIntro {

	public static void main(String[] args) {
	
//   Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
		
		
		String[]  persons = new String[4];
//		                     0        1      2       3
		String[]   pets = {"pet1", "pet2", "pet3", "pet4"};
		
		pets[3] ="pet5";
		
		
		persons[0] = "person1";
		
		for(int i=0; i < pets.length; i++) {
			System.out.println(pets[i]);
		}
		
		for(String pet : pets) {
			System.out.println(pet);
		}
		
		
		int[] idAry = new int[10];
		
		System.out.println("size of if array is " + idAry.length);
		
		
	}

}
