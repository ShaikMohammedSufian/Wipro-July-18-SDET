package Lab14Aug;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToLabSession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Action class is used to simulate the mouse related activities
		Actions act = new Actions(driver);
		
		WebElement mouse = driver.findElement(By.xpath("//button[@id='mousehover']"));
		act.moveToElement(mouse).perform();
		
		Thread.sleep(2000);
		WebElement top = driver.findElement(By.xpath("//a[@href='#top']"));
		act.click(top).perform();
		
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if (url.contains("https://rahulshettyacademy.com/AutomationPractice/#top")) {
		    System.out.println("Navigate to Top");
		} else {
		    System.out.println("Nothing");
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}