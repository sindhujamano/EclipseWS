package com.bayamp.homework;

public class PrimeNumber {
	
	public static boolean checkIfPrimeNumber(int number){
		/*if(number%2==0)
		return false;
		return true;
		*/
	     for(int i=2; i<number;i++){
			
			if(number%i ==0)
			return false;}
			
		return true;
	}

}
