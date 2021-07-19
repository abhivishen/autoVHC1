package com.autoVHC1.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.autoVHC1.PageObjects.DailyDiaryPage;
import com.aventstack.extentreports.ExtentTest;



public class TC_CreateUser_003 extends BaseClass {
	public Logger logger = LogManager.getLogger(TC_CreateUser_003.class.getClass());
	
	@Test(priority = 1)
	public void createUser() throws InterruptedException {
		ExtentTest test = extent.createTest("CreateUser");
		DailyDiaryPage ddp = new DailyDiaryPage(driver);
		
		Thread.sleep(35000);
		
		ddp.clickHamburger();
		logger.info("The menu is opened");
		test.info("The menu is opened");
		
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ddp.openSettings();
		logger.info("Settings opened");
		test.info("Settings opened");
		
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ddp.openUsers();
		logger.info("userssettings opened");
		test.info("userssettings opened");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ddp.addUser();
		logger.info("Add User button in user settings clicked");
		test.info("Add User button in user settings clicked");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ddp.enterFirstName("Automation");
		logger.info("First Name enetered");
		test.info("First Name enetered");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ddp.enterLastName("TestUser1");
		logger.info("Last Name enetered");
		test.info("Last Name enetered");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ddp.enterEmail("dummyTestUser1@dummy.com");
		logger.info("Email enetered");
		test.info("Email enetered");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ddp.enterUserName("TestUser1");
		logger.info("User Name enetered");
		test.info("User Name enetered");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ddp.enterPassword("Welcome2020!");
		logger.info("Password enetered");
		test.info("Password enetered");
	}

}
