package Aug162025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingEg {
	 public static void main(String[] args) throws InterruptedException {
	        ChromeOptions chromeOption = new ChromeOptions();
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(chromeOption);
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        
	       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        WebElement aboutamazon = driver.findElement(By.xpath("//a[normalize-space()='About Amazon']"));
	        
	        Actions ac = new Actions(driver);
	        
	        Thread.sleep(2000);
	        
	        ac.scrollToElement(aboutamazon).perform();
	        
	        aboutamazon.click();
	        
	        
	         
	        
	 }
}