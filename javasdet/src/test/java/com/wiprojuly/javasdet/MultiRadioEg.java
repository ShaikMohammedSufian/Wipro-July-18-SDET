package com.wiprojuly.javasdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiRadioEg {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		// webdriver manager - download setup and maintance of the diff
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// mximize the window
		
		driver.manage().window().maximize();
		
		List<WebElement> radioboxes=driver.findElements(By.xpath("//input[@type='radio']"));
		
		int size = radioboxes.size();
		System.out.println(size);
		
		//for loop to iterate in the list of checkboxes
		
		for (int i =0; i<size;i++) {
			
			Thread.sleep(2000);
			
			radioboxes.get(i).click();
		
		
		Thread.sleep(2000);
		
		
		
		
		
	}
}

}


