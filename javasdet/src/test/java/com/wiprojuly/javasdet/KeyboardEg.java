package com.wiprojuly.javasdet;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEg {
	 public static void main(String[] args) throws InterruptedException {
		 
		 
		
	        // Set Chrome Options (optional)
	        ChromeOptions chromeOptions = new ChromeOptions();
	       // open browser maximized

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver(chromeOptions);
	       
	        // Open practice form
	        driver.get("https://www.facebook.com/");
	        
	        //Actions clas is used to simulate the mouse related activitiews
	        Actions act = new Actions (driver);
	        
	        Thread.sleep(2000);
	        
	        WebElement email = driver.findElement(By.xpath("//input[@id ='email']"));
	        
	        act.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("Hello").keyUp(Keys.SHIFT).build().perform();
	        
	        Thread.sleep(2000);
	        
	    
	        WebElement password = driver.findElement(By.xpath("//input[id ='pass']"));
	        
	        act.moveToElement(password).click().sendKeys("hi").release().build().perform();
	        
	        Thread.sleep(3000);
	 }
}