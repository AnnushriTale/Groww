package com.GrowwApp.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	
	@FindBy (xpath ="//input[@id='globalSearch23']")
	private WebElement searchBox ;
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void searchclick()
	{
		searchBox.click();
	}
	
	public void searchSenkdkeys()
	{
		searchBox.sendKeys("Vodafone");
	}
	

	

}
