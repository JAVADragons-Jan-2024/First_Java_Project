package com.learning.java.day4.FourPillarsOfOOPs;

public abstract class Account {
	String accountHolderName;
	int accountNumber;
	int routingNumber;
	String dateOfOpining;
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}
	public String getDateOfOpining() {
		return dateOfOpining;
	}
	public void setDateOfOpining(String dateOfOpining) {
		this.dateOfOpining = dateOfOpining;
	}
	
	
	
	
}
