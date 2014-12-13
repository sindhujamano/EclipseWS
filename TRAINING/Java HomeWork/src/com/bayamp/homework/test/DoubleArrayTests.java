package com.bayamp.homework.test;

import org.testng.annotations.Test;

public class DoubleArrayTests {

	@Test
	public void doubleArrayTest1(){
		
		
		int[] singleArray1 = {2,4,5,6};
		int[] singleArray2 = {5,6,1,10};
		int[] singleArray3 = {12,44,55,66};
		int[] singleArray4 = {22,34,45,66};
		
	// or	int[][] multiArrays = { singleArray1,singleArray2,singleArray3,singleArray4};
		
		int[][] multiArrays = {{2,4,5,6}, {5,6,1,10},{12,44,55,66},{22,34,45,66}};
		
	int[] firstArray  = multiArrays[0];
	for(int i=0; i<firstArray.length; i++){
		System.out.println("The" + (i+i) + " element of the first array is" + firstArray[i]);
		
		
	}
	int[] secondArray = multiArrays[1]; 
	int[] thirdArray  =	multiArrays[2];
	int[] fourthArray = multiArrays[3];
		
	}

}
