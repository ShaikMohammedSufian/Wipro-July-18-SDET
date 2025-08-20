package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swaglabs {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		// webdriver manager - download setup and maintance of the diff
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.saucedemo.com/");

		// name locator

		// enter text in username field

		Thread.sleep(2000);

		WebElement username = driver.findElement(By.name("user-name"));

		username.sendKeys("standard_user");

		Thread.sleep(2000);
		
		//password
		WebElement password = driver.findElement(By.name("password"));

		password.sendKeys("secret_sauce");

		Thread.sleep(2000);
		
		//login
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));

	    loginbutton.click();

		Thread.sleep(2000);

	}

}


