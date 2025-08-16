package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementEg {
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
	        
	        WebElement prime = driver.findElement(By.xpath("//span[normalize-space()='Prime']"));
	        act.moveToElement(prime).perform();
	        Thread.sleep(3000);
	        
	        WebElement joinnow = driver.findElement
					(By.xpath("//a[@href ='/prime']"));
			act.click(joinnow).perform();
			Thread.sleep(2000);
	        
	        
	 }
}