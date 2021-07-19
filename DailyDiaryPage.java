package com.autoVHC1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DailyDiaryPage {
	

	@FindBy(css=".active > .myAvIcon") public WebElement hamBurger;
	@FindBy(css="[href='\\/settings'] svg") public WebElement settings;
	@FindBy(xpath="//span[contains(text(),'Users')]") public WebElement users;
	@FindBy(xpath="//span[contains(text(),'AddUser')]") public WebElement addUsers;
	@FindBy(xpath="//input[@formcontrolname='FirstName']") public WebElement firstName;
	@FindBy(xpath="//input[@formcontrolname='SurName']") public WebElement lastName;
	@FindBy(xpath="//input[@formcontrolname='LoginId']") public WebElement userName;
	@FindBy(xpath="//input[@formcontrolname='Email']") public WebElement email;
	@FindBy(xpath="//input[@formcontrolname='siteUserPassword']") public WebElement newPassword;
	
	//Creation of a VHC
	@FindBy(xpath="//span[contains (text(),'Add VHC')]") public WebElement addNewVHC;
	@FindBy(xpath="//span[contains(text(),'Add Manually')]") public WebElement addManually;
	//Create/fill Customer details
	
	
	
	
	public DailyDiaryPage(WebDriver remoteDriver) {
		
		PageFactory.initElements(remoteDriver,this);
		
	}
	
	public void clickHamburger() {
		hamBurger.click();
	}
	
	public void openSettings() {
		settings.click();		
	}
	
	public void openUsers() {
		users.click();
	}
	
	public void addUser() {
		addUsers.click();
	}
	
	public void enterFirstName(String getFirstName) {
		firstName.sendKeys(getFirstName);
	}
	
	public void enterLastName(String getLastName) {
		lastName.sendKeys(getLastName);
	}
	
	public void enterUserName(String getUserName) {
		userName.sendKeys(getUserName);
	}
	
	public void enterEmail(String getEmail) {
		email.sendKeys(getEmail);
	}
	
	public void enterPassword(String getNewPassword) {
		newPassword.sendKeys(getNewPassword);
	}
	
	public void createVHC() {
		addNewVHC.click();
	}
	
	public void createManualy() {
		addManually.click();
	}
	
}
