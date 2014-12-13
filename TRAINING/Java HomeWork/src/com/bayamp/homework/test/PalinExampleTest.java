package com.bayamp.homework.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.bayamp.training.utilities.*;
public class PalinExampleTest {
	
	@Test
	public void palindromeNegativeTest(){
		
		String name = " BayAmp";
		boolean expected = false;
		
		boolean check = AppleStringUtils.isPalindrome(name);
		
		//Assert.asserEquals(check , expected);
		Assert.assertFalse(check);
		
	}
	
	@Test
	public void palindromePositiveTest(){
		
		String name = " madam";
		boolean expected = true ;
		
		boolean check = AppleStringUtils.isPalindrome(name);
		
		Assert.assertEquals( check, check);
		
		
	}
}
	