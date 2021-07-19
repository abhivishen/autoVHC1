package com.autoVHC1.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.autoVHC1.utilities.ReadConfig;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class BaseClass {

	ReadConfig rc = new ReadConfig();
	public String appUrl = rc.getAppURL();
	public String siteCode = rc.getSiteCode();
	public String userName = rc.getUserName();
	public String password = rc.getPassword();
	public WebDriver driver;
	ExtentSparkReporter spark = new ExtentSparkReporter("./Reports\\extentreports.html");
	ExtentReports extent = new ExtentReports();

	@Parameters("browser")
	@BeforeSuite(alwaysRun = true)
	public void setup(String br) 
	{
		extent.attachReporter(spark);

		if(br.equalsIgnoreCase("CHROME"))
		{

			System.setProperty("webdriver.chrome.driver", rc.getChromeDriver());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.navigate().to(appUrl);

		}

		else if(br.equalsIgnoreCase("FIREFOX"))
		{

			System.setProperty("webdriver.gecko.driver", rc.getFirefoxDriver());
			driver = new FirefoxDriver();	
			driver.manage().window().maximize();
			//driver.navigate().to(appUrl);
		}

	}

	@AfterSuite
	public void teardown() throws InterruptedException

	{

		Thread.sleep(8000);
		driver.quit();
	}


	public void explicitWaitRecreated(int timeUnits, WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver, timeUnits);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void implicitWaitRecreated() 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
