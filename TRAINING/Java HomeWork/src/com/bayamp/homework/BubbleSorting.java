package com.bayamp.homework;

import java.util.Arrays;

public class BubbleSorting {
	
	public static int[] bubbleSort(int[] unSortedNumbers){
		
		int len = unSortedNumbers.length;
		for(int pass=1; pass<len; pass++){
			for(int current = 0; current <len-pass ; current++){
				if(unSortedNumbers[current] > unSortedNumbers[current+1]);
				//Swap unsortedNumbers[current] & unsortedNumbers[current+1]
				 int temp = unSortedNumbers[current];
				unSortedNumbers[current] = unSortedNumbers[current+1];
				unSortedNumbers[current+1] = temp;
			}
		}
		System.out.println(" print me the sorted array" + unSortedNumbers);
		
	
		
		return unSortedNumbers;
		
	}
	
	
	public static void main (String[] args){
		
		int[] unSortedNumbers = {3,8,9,10,7,4,6,1,2,5};
		int[] mySortedArray = bubbleSort(unSortedNumbers);
		
		
	}
	

	
}
