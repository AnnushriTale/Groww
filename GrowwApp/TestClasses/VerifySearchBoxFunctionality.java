package com.GrowwApp.TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.GrowwApp.POMClasses.HomePage;

public class VerifySearchBoxFunctionality extends BaseClass
{
	WebDriver driver;
	HomePage home;
	@Test
	public void SearchBoxFunctionality()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		home =new HomePage(driver);
		home.searchclick();
		home.searchSenkdkeys();
		
	}
	
	

	

}
