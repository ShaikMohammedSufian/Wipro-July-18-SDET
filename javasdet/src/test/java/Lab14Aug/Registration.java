package Lab14Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    public static void main(String[] args) throws InterruptedException {

        // Set Chrome Options (optional)
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized"); // open browser maximized

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Open practice form
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        // Fill name
        driver.findElement(By.id("name")).sendKeys("Sufian");
        Thread.sleep(1000);

        // Fill email
        driver.findElement(By.id("email")).sendKeys("shaik@gmail.com");
        Thread.sleep(1000);

        // Select gender - Male
        driver.findElement(By.id("gender")).click();
        Thread.sleep(1000);

        // Fill mobile number
        driver.findElement(By.id("mobile")).sendKeys("1234567890");
        Thread.sleep(1000);

        // Enter date of birth
        driver.findElement(By.id("dob")).sendKeys("2002-04-11");
        Thread.sleep(1000);

        // Enter subjects
        driver.findElement(By.id("subjects"))
                .sendKeys("java selenium, python, software testing");
        Thread.sleep(1000);

        // Select hobby - Reading
        driver.findElement(By.xpath("//label[text()='Reading']/preceding-sibling::input")).click();
        Thread.sleep(1000);

        // Upload picture
        WebElement uploadPic = driver.findElement(By.id("picture"));
        uploadPic.sendKeys("D:/vs code/New folder/20031.jpg");
        Thread.sleep(1000);

        // Enter address
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='picture']"));
        currentAddress.sendKeys("Kurnool, Andhra Pradesh");
        Thread.sleep(1000);

        // Select State
        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByVisibleText("NCR");
        Thread.sleep(1000);

        // Select City
        Select citySelect = new Select(driver.findElement(By.id("city")));
        citySelect.selectByVisibleText("Agra");
        Thread.sleep(1000);

        // Click Login button
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
