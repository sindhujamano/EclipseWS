package com.bayamp.homework.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.bayamp.homework.*;

public class FactorialTest {
  @Test
  public void factorialTest() {
	  
	  //factorial of 5 = 5*4*3*2*1
	 // int factorial = 5*4*3*2*1;// this is not the efficient way
	  
	  int number = 5;
	  int expectedReturn = 120;
	  int factorial = Factorial.getFactorial(number);
			  
	 System.out.println(" The factorial is "+ factorial);
	  Assert.assertEquals(factorial, expectedReturn);
  }
  

}
