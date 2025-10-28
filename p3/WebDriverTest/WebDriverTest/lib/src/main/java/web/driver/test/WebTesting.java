package web.driver.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import java.nio.file.Paths;


public class WebTesting {
	private static WebDriver localDriver;
	
	
	public static WebDriver getDriver() {
		return localDriver;
	}
	
	
	public static void initSystemProperties() {
		/* Sustituye este path por el tuyo */
		String chromePath = Paths.get("C:/Drivers/ChromeDriver/chromedriver.exe").toString();
		System.out.println(chromePath);
				
		// Chrome Driver
		/** Tested for Chrome Version 141.0.7390.123       **/
		/** Tested for chromedriver Version 141.0.7390.122 **/
		System.setProperty("webdriver.chrome.driver", chromePath);
	}
	
	
	public static WebDriver launchDriver(String siteUrl, String browser) {
		if (browser.equals("chrome")) {
			// Set options for Chrome
/*
			ChromeOptions options = new ChromeOptions()
							.addArguments("--homepage \""+siteUrl+"\"")
							.setAcceptInsecureCerts(true)
							.setHeadless(false);
*/
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--homepage \""+siteUrl+"\"");
			options.setAcceptInsecureCerts(true);
			//options.addArguments("start-maximized"); // open Browser in maximized mode
			//options.addArguments("disable-infobars"); // disabling infobars
			//options.addArguments("--disable-extensions"); // disabling extensions
			//options.addArguments("--disable-gpu"); // applicable to windows os only
			//options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			//options.addArguments("--no-sandbox"); // Bypass OS security model
							
			// Browser is launched on creation of the driver
			quitDriver();
			localDriver = new ChromeDriver(options);
			localDriver.get(siteUrl);
		}
		
		return localDriver;
	}
	
	public static void quitDriver() {
		if (localDriver != null) {
			localDriver.quit();
			localDriver = null;
		}
	}
}
