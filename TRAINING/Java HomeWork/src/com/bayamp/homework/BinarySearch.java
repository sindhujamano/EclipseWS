package com.bayamp.homework;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		String[] valName = {"C++" , "Java" , "Pearl", "Unix", "Networking"};
		String searchVal = "Java";
		boolean searchedBook = binarySearchMethod( valName,searchVal);
		System.out.println("print my searched book is :"+ searchedBook);


		String[] valName1 = {"C++" , "Java" , "Pearl", "Unix", "Networking"};
		String searchVal1 ="Networking";
		int searchedBookIndex= libraryIndex(valName1,searchVal1);
		System.out.println("print my searched book index is " + searchedBookIndex);

	}

	public static boolean binarySearchMethod(String[] valName, String searchVal){

		boolean search = false;
		for(int i=0; i<valName.length; i++ ){
			if (valName[i] == searchVal){
				search = true;
				break;
			}
		}
		return search;	
	}

	public static int libraryIndex(String[] valName, String searchVal){

		int bookIndex = -1;
		for(int i=0; i<valName.length; i++ ){
			if (valName[i] == searchVal){
				bookIndex = i;
				break;
			}
		}
		return bookIndex;	

	}


	int[] data;
	int size;

	public boolean binarySearch(int key) {
	
		int low = 0;
		int high = size - 1;

		while(high >= low) {
			int middle = (low + high) / 2;
			if(data[middle] == key) {
				return true;
			}
			if(data[middle] < key) {
				low = middle + 1;            
			}if(data[middle] > key) {
				high = middle - 1;
			}
		}
		return false;  

	}
}