package com.autoVHC1.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.autoVHC1.PageObjects.DailyDiaryPage;
import com.autoVHC1.PageObjects.LoginPage;
import com.aventstack.extentreports.ExtentTest;

public class TC_Login_001 extends BaseClass
{
	public Logger logger = LogManager.getLogger(TC_Login_001.class.getClass());
	
	
	@Test(priority = 0)
	public void loginTest() throws IOException, InterruptedException {
		
		ExtentTest test = extent.createTest("Login");
		
		LoginPage lp = new LoginPage(driver);
		
		driver.get(appUrl);
	
		Thread.sleep(15000);

		//performing the operations

		lp.setSiteCode(siteCode);
		logger.info("Entering site code successful");
		test.info("Entering site code successful");
		
		lp.setUserName(userName);
		logger.info("Entering username successful");
		test.info("Entering username successful");
		
		lp.setPassword(password);
		logger.info("Entering password successful");
		test.info("Entering password successful");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		lp.clickSignin();
		logger.info("User Logged in successfully");
		test.info("User Logged in successfully");

	}

}
