package com.dias.demoproj;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Setup {
		/**
	 * @author Sumedha
	 * Class to provide driver
	 *
	 */
	public static WebDriver driver = null;
	public static final String CHROME_WEBDRIVE_PROPERTY_KEY="webdriver.chrome.driver";
//	public static final String FIREFOX_WEBDRIVE_PROPERTY_KEY="webdriver.firefox.bin";
//	public static final String IE_WEBDRIVE_PROPERTY_KEY="webdriver.ie.driver";

	public static final String CHROME_WEBDRIVE_PROPERTY_VALUE="..\\resources\\test\\chromedriver.exe";
//	public static final String FIREFOX_WEBDRIVE_PROPERTY_VALUE="C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
//	public static final String IE_WEBDRIVE_PROPERTY_VALUE="\\chromedriver_win32\\IEDriverServer.exe";
//	
	
	@BeforeSuite
	public static void getDriver() throws Exception {
	WebDriver driver=new ChromeDriver();
	System.setProperty(CHROME_WEBDRIVE_PROPERTY_KEY,
			CHROME_WEBDRIVE_PROPERTY_VALUE);
	System.out
			.println(System.getProperty(CHROME_WEBDRIVE_PROPERTY_KEY));
	driver.get("www.google.com");
	}

	/**
	*After Suite
	*/
	@AfterSuite
	public static void afterClass() {
	driver.quit();
	}
}
