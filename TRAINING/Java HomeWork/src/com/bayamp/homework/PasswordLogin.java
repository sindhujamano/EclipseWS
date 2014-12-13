package com.bayamp.homework;

public class PasswordLogin {
	public static final String SPECIAL_CHARACTERS = "!@#$";
	public static final int MIN_PASSWORD_LENGTH = 6;
	public static final int MAX_PASSWORD_LENGTH = 8;
	
	
	public static boolean correctPassword(String password){
		if(password==null){
		System.out.println("empty String");
		return false;
		}		
          password = password.trim();
          int len = password.length();
  	    if(len < MIN_PASSWORD_LENGTH || len > MAX_PASSWORD_LENGTH) {
  	       System.out.println("The Password most contain least 6 characters and not more than 8 characters.");
  	        return false;
  	    }
  	    char[] aC = password.toCharArray();
  	    for(char c : aC) {
  	        if (Character.isUpperCase(c)) {
  	            System.out.println(c + " is uppercase.");
  	        } else
  	        if (Character.isLowerCase(c)) {
  	            System.out.println(c + " is lowercase.");
  	        } else
  	        if (Character.isDigit(c)) {
  	            System.out.println(c + " is digit.");
  	        } else
  	        if (SPECIAL_CHARACTERS.indexOf(String.valueOf(c)) >= 0) {
  	            System.out.println(c + " is valid symbol.");
  	        } else {
  	            System.out.println(c + " is an invalid character in the password.");
  	            return false;
  	        }
  	    }
  	    return true;
  	
  
			
			
			
			
		}
		
		
		
		
	}

