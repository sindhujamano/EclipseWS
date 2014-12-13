package com.bayamp.homework;

public class FibonaciiSeries {

	public static int[] generateFibonacii(int quantity){
		if(quantity<=0)
			return null;
		
		int[] myArray = new int[quantity];
		
		if(quantity==1)
			myArray[0]=0;
		
		if(quantity==2){
			myArray[0]=0;
			myArray[1]=1;
		}
		if(quantity>=5){
			myArray[0]=0;
			myArray[1]=1;
			/*if(quantity==1)
				myArray[0]=0;

			else
				myArray[0]=0;
			    myArray[1]=1;
			 */
			for(int i=2; i<quantity; i++){
				myArray[i] = myArray[i -1] + myArray[i-2];	
				System.out.print( "print fibonnaci series "+ myArray[i]);
				
			}
		}
		return myArray;	
	}



}
