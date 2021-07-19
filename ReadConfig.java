package com.autoVHC1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public Properties pro = new Properties();;

	public ReadConfig() 
	{

		try {
			FileInputStream fs= new FileInputStream("C:\\Users\\jq2870\\eclipse-workspace\\autoVHC1\\configuration\\config.properties");
			
			pro.load(fs);
		}catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}


	}


	//create getter methodss to get the value from config.properties file
	public String getAppURL() {
		String url = pro.getProperty("appUrl");
		return url;
	}
	
	public String getSiteCode() {
		String siteCode = pro.getProperty("siteCode");
		return siteCode;
	}
	
	public String getUserName() {
		String userName = pro.getProperty("userName");
		return userName;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getChromeDriver() {
		String chromeDriver = pro.getProperty("chromePath");
		return chromeDriver;
	}
	
	public String getFirefoxDriver() {
		String firefoxDriver = pro.getProperty("firefoxPath");
		return firefoxDriver;
	}
	
	public String getMsedgeDrriver() {
		String msedgeDriver = pro.getProperty("msedgePath");
		return msedgeDriver;
	}
}