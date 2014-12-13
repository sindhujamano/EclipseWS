package com.bayamp.homework.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bayamp.homework.PasswordLogin;

public class LoginTest {
  @Test
  public void passwordcheck() {
	  
	  
	  String password = "$indhu@3";
	  boolean expected = true;
	  boolean actualPassword = PasswordLogin.correctPassword(password);
	  Assert.assertEquals(actualPassword, expected);
  }
}
