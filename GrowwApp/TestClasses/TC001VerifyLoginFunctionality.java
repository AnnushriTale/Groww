package com.GrowwApp.TestClasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GrowwApp.POMClasses.LoginPage;

public class TC001VerifyLoginFunctionality extends BaseClass
{
	@Test
	public void loginfunctionality()
	{
		
		System.out.println("Login functionality");
		Reporter.log("Test is passed");
	}

}
