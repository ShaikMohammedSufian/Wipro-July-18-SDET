package com.wiprojuly.javasdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		ChromeOptions chromeOptions = new ChromeOptions();
		// webdriver manager - download setup and maintance of the diff
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.facebook.com/");
		// mximize the window
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//get page title
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		//get the source code of html
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		Thread.sleep(2000);
		//fetch current url
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		//close the current window
		
		driver.close();
		
	}

}
