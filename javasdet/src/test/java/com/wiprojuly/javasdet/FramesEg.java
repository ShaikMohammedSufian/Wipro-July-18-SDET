package com.wiprojuly.javasdet;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FramesEg {
	 public static void main(String[] args) throws InterruptedException {
		 
		 
		
	        // Set Chrome Options (optional)
	        ChromeOptions chromeOptions = new ChromeOptions();
	       // open browser maximized

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver(chromeOptions);
	       
	        // Open practice form
	        driver.get("https://jqueryui.com/droppable/");
	        
	        

	        
	        WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']")); 
	        driver.switchTo().frame(Frame);
	        
	        //driver.switchTo().frame(0);
	        
	        
	        Thread.sleep(2000);
	        WebElement drag = driver.findElement(By.id("draggable"));
	        
	        WebElement drop = driver.findElement(By.id("droppable"));
	        
	        Actions act = new Actions(driver);

			act.dragAndDrop(drag, drop).perform();
			
			Thread.sleep(2000);
			driver.quit();
	     
	        
	 }
}