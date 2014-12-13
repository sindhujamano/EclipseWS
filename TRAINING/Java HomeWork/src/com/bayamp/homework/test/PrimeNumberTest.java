package com.bayamp.homework.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.homework.PrimeNumber;

public class PrimeNumberTest {
	
  @Test
  public void checkForPrimeNumber() {
	  
	  int number = 3;
	  boolean expectedMyObject = true;

	  System.out.println("Print my prime number is " + expectedMyObject);
	  boolean result = PrimeNumber.checkIfPrimeNumber(number);  
	  Assert.assertEquals(result, expectedMyObject);
  }
}
