package com.GrowwApp.TestClasses;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.GrowwApp.POMClasses.HomePage;
import com.GrowwApp.POMClasses.LoginPage;



public class BaseClass 
{
	WebDriver driver;
	HomePage Home;
	LoginPage login;
	
	Logger log;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.groww.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
		
	@BeforeMethod
	public void loginmethod()
	{
		Logger.getLogger("GrowwApplicationV1");
		PropertyConfigurator.configure("log4j.properties");
		
		login = new LoginPage(driver);
		login.loginRegisterClick();
		login.emailSendkeys();
		login.continueClick();
		login.passwordSendkeys();
		login.submitClick();
		login.codesendkeys();	
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
