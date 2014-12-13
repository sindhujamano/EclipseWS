package com.bayamp.homework.test;

import java.util.StringTokenizer;
import com.bayamp.homework.*;
import com.bayamp.training.utilities.StringArrayReversing;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TestingReversingAnString {


	@Test
	public  void reverseTheStringTest() {

		String garage = "RACECAR";
		boolean expected = true;
		Reporter.log(" Print my reversed String : " + garage);
		//Palindrome myObject = new Palindrome();
		//boolean actualReversed = myObject.palindromeMethod(garage);
		
		boolean actualReversed = Palindrome.isPalindrome(garage);
		Assert.assertEquals(actualReversed, expected);

	}
	
	@Test
	public void reverseTheStringTest2(){
		String garage = null;
		boolean expected = false;
		Palindrome myObject = new Palindrome();
		Reporter.log("Print my reversed " + garage);
		boolean actualReversed = myObject.palindromeMethod(garage);
		Assert.assertEquals(actualReversed, expected);

	}

	@Test
	public void test1(){
		 String myFruits = new String("apples bananas oranges");


	}

	private String reverseMethod1(String original){

		return new StringBuffer(original).reverse().toString();
	}	

	private String reverseMethod2(String original){

		StringTokenizer tokens = new StringTokenizer(original, " ");
		StringBuffer buff = new StringBuffer();
		while(tokens.hasMoreTokens()){
			String temp = tokens.nextToken();
			buff.append(new StringBuffer(temp).reverse());
			buff.append(" ");
			
		}
		return buff.toString();
		
		}




	}
















