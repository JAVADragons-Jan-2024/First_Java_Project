package com.learning.java.day4.FourPillarsOfOOPs;



public class PersonPaymentDetails {
	 private String name;
	 private int cardNumber;
	 private int cvv;
	 private boolean paymentStatus;
	 private String  paymentDate;

	 
	 
	 public String getName() {
		 return this.name;
	 }
	 
	 public void setName(String updatedName) {
		 this.name = updatedName;
	 }

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	 
	 
	 
	 
}
