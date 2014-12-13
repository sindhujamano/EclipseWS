package com.bayamp.homework;

import org.testng.annotations.Test;

public class DeleteMe {
	
	@Test
	public void f1(){
		
		//int quantity=5;
		//int[] myArray = new int[quantity];
		
		int[] myArray = {4,10,2,23};
		int[] reversedArray = reverseArray(myArray);
		
		
/*		System.out.println(quantity);
		System.out.println(myArray);
		
		initializeArray(myArray);
		
		
		setFirstAndLastElement(myArray,40);
		
		System.out.println("The first element in the array is "+ myArray[0]);
		System.out.println("The last element in the array is "+ myArray[myArray.length-1]);*/
		
	}
	
	private void initializeArray(int[] temp){
		
		for(int i=0;i<temp.length-1;i++){
			temp[i]=0;
		}
	}
	
	private void setFirstAndLastElement(int[] temp, int value){
		temp[0]=value;
		temp[temp.length-1]=value;
		
	}
	
	private int[] reverseArray(int[] temp){
		
		
		return null;
	}

}
