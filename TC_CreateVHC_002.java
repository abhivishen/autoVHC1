package com.autoVHC1.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.autoVHC1.PageObjects.DailyDiaryPage;
import com.autoVHC1.PageObjects.OverViewPage;

public class TC_CreateVHC_002 extends BaseClass{
	public Logger logger = LogManager.getLogger(TC_CreateVHC_002.class.getClass());
	

	@Test
	public void createVHCManually() throws InterruptedException {
		DailyDiaryPage ddp = new DailyDiaryPage(driver);
		OverViewPage ovp=new OverViewPage(driver);
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ddp.createVHC();
		logger.info("clicked on the addVHC button");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ddp.createManualy();
		logger.info("clicked on the create VHC");
		
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ovp.clickTitleDD();
		logger.info("Clicked on title drop down");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ovp.selectTitle();
		logger.info("Title Selected");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ovp.enterFirstName("Zeus");
		logger.info("FirstName entered");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ovp.enterSurName("Ginger");
		logger.info("SurName entered");
	}

}
