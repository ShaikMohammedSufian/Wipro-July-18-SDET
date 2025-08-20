package Lab18Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(TestNGListner.class)					//HARD ASSERTION
public class practice {

	@Test(groups = {"Sanity","Regression"})
	public void Practice() throws InterruptedException {
		// allows the customization of Chromedriver sessions
		ChromeOptions chromeOptions = new ChromeOptions();
		// webdriver manager - download setup and maintenance of different browsers
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	    driver.manage().window().maximize();

	    //  Hard Assertion - Intentionally Wrong Expected Title
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "wrong";   // Wrong title on purpose
	    Assert.assertEquals(actualTitle, expectedTitle);
	    
	    System.out.println("Actual Title is : "+driver.getTitle());
	    System.out.println("Given wrong Title is : "+expectedTitle);

	    // Enter first and last name
	    WebElement firstname = driver.findElement(By.name("firstname"));
	    firstname.sendKeys("Sufian");
	    WebElement lastname = driver.findElement(By.name("lastname"));
	    lastname.sendKeys("Shaik");
	    Thread.sleep(2000);

	    // Select gender
	    WebElement gender = driver.findElement(By.id("sex-0"));
	    gender.click();
	    Thread.sleep(2000);
	        
	    // Select years of experience
	    WebElement experience = driver.findElement(By.xpath("//input[@id='exp-4']"));
	    experience.click();
	    Thread.sleep(2000);
	        
	    // Enter date
	    WebElement date = driver.findElement(By.id("datepicker"));
	    date.sendKeys("16-10-2003");
	    Thread.sleep(2000);
	        
	    // Select profession
	    WebElement profession = driver.findElement(By.cssSelector("#profession-1"));
	    profession.click();
	    Thread.sleep(2000);

	    // Select automation tool
	    WebElement tool = driver.findElement(By.cssSelector("#tool-2"));
	    tool.click();
	    Thread.sleep(2000);

	    // Select continent
	    WebElement continents = driver.findElement(By.xpath("//*[@id=\"continents\"]/option[2]"));
	    continents.click();
	    Thread.sleep(2000);

	    // Select command
	    WebElement commands = driver.findElement(By.xpath("//option[normalize-space()='Wait Commands']"));
	    commands.click();
	    Thread.sleep(2000);

	    // Submit the form
	    driver.findElement(By.id("submit")).click();
	    Thread.sleep(2000);

	    // Close the browser
	    driver.quit();
	}
}
