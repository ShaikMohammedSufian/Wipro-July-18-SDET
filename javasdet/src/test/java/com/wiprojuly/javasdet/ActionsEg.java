package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg {
	 public static void main(String[] args) throws InterruptedException {
		 
		 
		
	        // Set Chrome Options (optional)
	        ChromeOptions chromeOptions = new ChromeOptions();
	       // open browser maximized

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver(chromeOptions);
	       
	        // Open practice form
	        driver.get("https://www.amazon.in/");
	        
	        //Actions clas is used to simulate the mouse related activitiews
	        
	        Actions act = new Actions (driver);
	        
	        WebElement sell = driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
	        
	        act.doubleClick(sell).perform();
	        Thread.sleep(4000);
	        
	        driver.navigate().back();
	        
	        Thread.sleep(6000);
	        
	        //context click or a fright click
	        
	        WebElement mobiles = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
	        
	        act.contextClick(mobiles).perform();
	        
	     
	        driver.quit();
	        
}
}