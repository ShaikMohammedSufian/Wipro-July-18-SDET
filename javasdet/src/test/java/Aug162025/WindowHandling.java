package Aug162025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	 public static void main(String[] args) throws InterruptedException {
	        ChromeOptions chromeOption = new ChromeOptions();
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(chromeOption);
	        driver.get("https://the-internet.herokuapp.com/windows");
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        //click on link to open the child tab
	        
	        WebElement clickhere = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));	        
	        clickhere.click();
	        
	        Thread.sleep(2000);
	        //fetch all window handles - there wiill be two[0]-default,[1]
	        
	        Object[] windowHandles = driver.getWindowHandles().toArray();
	        
	        System.out.println(windowHandles);

	        driver.switchTo().window((String) windowHandles[1]);
	        
	        String title = driver.getTitle();
	        
	        System.out.println(title);
	        
	        Thread.sleep(2000);
	        
	        driver.close();
	        
	        driver.switchTo().window((String) windowHandles[0]);
	        
	        driver.quit();
	        
}
}
