package com.wiprojuly.javasdet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class InvokeChromeBrowser {

	public static void main(String[] args) {
		//allows the customization of Chromedriver seesions by modifying the browser
		ChromeOptions chromeOptions = new ChromeOptions();
		//webdriver manager - download setup and maintance of the diff
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
