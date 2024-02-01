package com.learning.java.day4;

public class Person {
	
	public String name;
	protected String Dob;
	public int creditScore;
	private int ssn;
	private int creditBal;
	private int noOfCreditCards;
	
	
	public Person(String name,int ssn, int creditBal, int noOfCreditCards ) {
	
		this.name = name;
		this.ssn = ssn;
		this.creditBal = creditBal;
		this.noOfCreditCards = noOfCreditCards;
		
	}
	
	
	public int creditCheck() {
		int updatedcreditScore = ssn*creditBal/noOfCreditCards;
	
		if(this.creditScore < updatedcreditScore) {
			return updatedcreditScore;
		}
		
		return this.creditScore;
		
		
	}
	
	public void insurenceInfo() {
		healthInfo();
		 
	}
	
	public boolean insurencecheck() {
		healthInfo();
		insurenceInfo();
		
		return true;
		
	}
	
	private void healthInfo() {
		System.out.println(" This is my ealth report");
	}
	
	
	
	
	

}
