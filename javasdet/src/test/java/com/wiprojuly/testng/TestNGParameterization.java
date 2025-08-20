package com.wiprojuly.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/*<parameter name="browser"  value="chrome"/>
<parameter name="platform"  value="windows"/>*/


public class TestNGParameterization {
	
	@Parameters({ "browser", "platform" })

	@Test

	public void testparameters(String browser, String platform) {
		
		try {
		if (browser.equals("chrome") && (platform.equals("windows"))) {

			 

			ChromeOptions chromeOptions = new ChromeOptions();
 
			WebDriverManager.chromedriver().setup();
 
			WebDriver driver = new ChromeDriver(chromeOptions);
 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			

		}else {

			System.setProperty("webdriver.edge.driver", "D://edgedriver_win64//msedgedriver.exe//");
		    WebDriver driver = new EdgeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	        

		}


	
	}catch(Exception e) {
		System.out.println(e);
	}
 
	}
}
