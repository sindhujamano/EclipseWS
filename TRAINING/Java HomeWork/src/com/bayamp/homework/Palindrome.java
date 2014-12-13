package com.bayamp.homework;

public class Palindrome {
	
	public boolean palindromeMethod(String parking){

		StringBuffer myGarage = new StringBuffer(parking);
		String myObject = myGarage.reverse().toString();
		if(parking.equals(myObject))
			return true; 
		else	  
			return false;
	}
	
	public static boolean isPalindrome(String temp){
		
		if(temp==null)
			return false;
		
		StringBuffer myGarage = new StringBuffer(temp);
		String myObject = myGarage.reverse().toString();
		if(temp.equals(myObject))
			return true; 
		else	  
			return false;
		
		
	}

}
