package Lab14Aug;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Websitepractice {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOption = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOption);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        // Radio  
        WebElement radio = driver.findElement(By.xpath("//input[@value='radio3']"));
        radio.click();
        Thread.sleep(1000);

        // Dropdown 
        WebElement drop = driver.findElement(By.id("dropdown-class-example"));
        Select sel = new Select(drop);
        sel.selectByIndex(3);    // Indexing starts from 0
        Thread.sleep(1000);

        // Checkbox 
        WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
        checkbox.click();
        Thread.sleep(1000);

        //  Alert 
        // Enter name
        WebElement prompt = driver.findElement(By.id("name"));
        prompt.sendKeys("Sufi");
        Thread.sleep(1000);

        // Click Alert Button
        WebElement alertBtn = driver.findElement(By.id("alertbtn"));
        alertBtn.click();
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text is: " + alert.getText());
        alert.accept();
        Thread.sleep(1000);

        // Mouse Hover 
        WebElement mouse = driver.findElement(By.id("mousehover"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mouse).perform();
        Thread.sleep(1000);

        // Click on "Top" option
        WebElement topOption = driver.findElement(By.xpath("//a[text()='Top']"));
        actions.moveToElement(topOption).click().perform();
        
        
        
        //frames
        
        WebElement Frame = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
        driver.switchTo().frame(Frame);
        

        // Optional: Close the browser
        Thread.sleep(2000);
        driver.quit();
    }
}
