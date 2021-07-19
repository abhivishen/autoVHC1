package com.autoVHC1.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

	//Finding the webelements by using page factory class

	@FindBy(xpath="//input[@placeholder='Sitecode']") public WebElement siteCode;

	@FindBy(xpath="//input[@placeholder='Username']") public WebElement userName;

	@FindBy(xpath="//input[@placeholder='Password']") public WebElement password;

	@FindBy(xpath="//button[contains(text(),'Sign In')]") public WebElement signIn;

	//Initializing the elements

	public LoginPage(WebDriver remoteDriver) {
		PageFactory.initElements(remoteDriver,this);
		//JavascriptExecutor js = (JavascriptExecutor)remoteDriver; 
	}
	
	

	//Now we are writing the action methods here

	public void setSiteCode(String siteValue)
	{
		siteCode.sendKeys(siteValue);
	}

	public void setUserName(String uName)
	{
		userName.sendKeys(uName);
	}

	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}

	public void clickSignin()
	{
		password.sendKeys(Keys.ENTER);
	}
}
