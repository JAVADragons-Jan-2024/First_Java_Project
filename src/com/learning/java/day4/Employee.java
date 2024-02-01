package com.learning.java.day4;

public class Employee {

	// create a public employee class - > name, age , phonenumber as public ,
	// - private salary, bonus, Protected noOfhours
	// parameterized Constructor with name and age, salary
	// 2 public methods
	// 2 private methods
	// 1 private static parameterized method
	// 1 public non static parameterized method
	// write a method to return the employee salary + bonus.

	private String name;
	public int age;
	public int phonenumber;
	private double salary;
	private double bonus;
	protected int noOfhours;
	
	
	public Employee(String name, int age,double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void method1() {
		System.out.println("This is a public method");
	}
	
	public void method2() {
		System.out.println("This is a public method");
	}
	
	private void method3() {
		System.out.println("This is a private method");
	}
	
	private void method4() {
		System.out.println("This is a private method");
	}
	
	private static void method5(int xyz, int ghj) {
		System.out.println(xyz+ghj);;
	}
	
	public void method6(String newName) {
		method4();
		this.name = newName;
	}
	
	// write a method to return the employee salary + bonus.
	
	public double AdditionOfSalaryAndBonus() {
		return this.salary + this.bonus;
	}
	
}
