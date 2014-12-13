package com.bayamp.homework.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.homework.BinarySearch;

public class BinarySearchTest {
	
  @Test
  public static void BinarySearchTest(){
 
  String[] valName = {"C++" , "Java" , "Pearl", "Unix", "Networking"};
  String inputSearchVal= "Pearl";
  boolean expectedSearchResult = true;
  
  Reporter.log(" print me the expected result" + expectedSearchResult);
  boolean actualOutput = BinarySearch.binarySearchMethod(valName, inputSearchVal); 
  
  Assert.assertEquals(actualOutput, expectedSearchResult);
  
 
  }
  
  
 @Test
  
  public void findTheBook(){
	  
	  String[] valName = {"Principles Of Accounting", " Cost Accounting" , "Income Tax", "Management Book"};
	  String findMe = " Accounting Of Principles";
	  
	  boolean expectedResult = false;
	  
	  boolean actualsearchedBook= BinarySearch.binarySearchMethod(valName, findMe);
	  Assert.assertEquals(actualsearchedBook, expectedResult);
  }
  
  
  
}
