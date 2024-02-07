package com.learning.java.day7;

public class OwnException extends Throwable{
	
	   private static final long serialVersionUID = 1L;
	   
	   private String message;
	   
	   public OwnException(String message) {
		   this.message = message;
	   }

	public String getMessage() {
	        return message;
	    }

}
