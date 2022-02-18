package com.GrowwApp.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver ;
	
	@FindBy (xpath ="//span[text()='Login/Register']")
	private WebElement loginRegister;
	
	@FindBy (xpath ="//input[@id='login_email1']")
	private WebElement email;
	
	@FindBy (xpath ="(//div[@class='absolute-center btn51ParentDimension'])[1]")
	private WebElement continueButton;
	
	@FindBy (xpath ="//input[@id='login_password1']")
	private WebElement password; 
	
	@FindBy (xpath ="(//span[@class='absolute-center'])[1]")
	private WebElement submitButton;
	
	@FindBy (xpath ="//div[@id='otpinput88parent']")
	private WebElement code;
	
	@FindBy (xpath = "(//input[@class='otpinput88'])[1]")
	private WebElement a; 
	
	@FindBy (xpath = "(//input[@class='otpinput88'])[2]")
	private WebElement b;
	
	@FindBy (xpath = "(//input[@class='otpinput88'])[3]")
	private WebElement c;
	
	@FindBy (xpath = "(//input[@class='otpinput88'])[4]")
	private WebElement d;
	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginRegisterClick()
	{
		loginRegister.click();
	}
	public void emailSendkeys()
	{
		email.click();
		email.sendKeys("annushristale@gmail.com");
	}
	public void continueClick()
	{
		continueButton.click();
	}
	public void passwordSendkeys()
	{
		password.click();
		password.sendKeys("Software@123");
	}
	public void submitClick()
	{
		submitButton.click();
	}
	

	public void codesendkeys() {
		// TODO Auto-generated method stub
		a.sendKeys("1");
		b.sendKeys("9");
		c.sendKeys("6");
		d.sendKeys("4");
	}

}
