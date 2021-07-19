package com.autoVHC1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autoVHC1.testCases.BaseClass;

public class OverViewPage extends BaseClass {
	
	//select the first name input box to enter first name 
	@FindBy(xpath="//div//input[@formcontrolname=\"FirstName\" and @class=\"ng-untouched ng-pristine ng-invalid\"]")
	public WebElement firstName;
	//select the sur name input box to enter sur name 
	@FindBy(xpath="//div//input[@formcontrolname=\"Surname\" and @class=\"ng-untouched ng-pristine ng-invalid\"]")
	public WebElement surName;
	//click the title custome drop down 
	@FindBy(xpath="//div//av-select[@placeholder=\"Title\"]//div[@class=\"av-select-value\"]")
	public WebElement titleDD;
	//select a title from custome title drop down 
	@FindBy(xpath="//av-select-option[contains(text(),\"Rev\")]")
	public WebElement titleOptionSelect;
	
	public OverViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//writing the action methods for elements captured

	public void enterFirstName(String firstNameRem) {
		firstName.sendKeys(firstNameRem);
	}
	
	public void enterSurName(String surNameRem) {
		surName.sendKeys(surNameRem);
	}
	
	
	public void clickTitleDD() {
		titleDD.click();
	}
	
	public void selectTitle() {
		titleOptionSelect.click();
	}

}
