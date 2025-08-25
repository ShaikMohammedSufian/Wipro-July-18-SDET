package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownEg {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		// webdriver manager - download setup and maintance of the diff
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement drop = driver.findElement(By.xpath("//select[@id ='dropdown-class-example']"));
		
		Select sel = new Select(drop);
		
		//select by visible text
		sel.selectByVisibleText("Option1");
		Thread.sleep(2000);
		

		//select by value
		sel.selectByValue("option2");
		Thread.sleep(2000);

		//select by index
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
