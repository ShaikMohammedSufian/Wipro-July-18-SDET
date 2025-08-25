package Lab18Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGListner.class) 
public class Login {

    //  Suite Level
    @BeforeSuite
    public void beforeSuite() {
        System.out.println(">>> Executed @BeforeSuite - Runs once before all test suites");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(">>> Executed @AfterSuite - Runs once after all test suites");
    }

    //  Test Level 
    @BeforeTest
    public void beforeTest() {
        System.out.println(">>> Executed @BeforeTest - Runs before <test> block in XML");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(">>> Executed @AfterTest - Runs after <test> block in XML");
    }

    //  Class Level 
    @BeforeClass
    public void beforeClass() {
        System.out.println(">>> Executed @BeforeClass - Runs once before all test methods in this class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(">>> Executed @AfterClass - Runs once after all test methods in this class");
    }

    // Method Level 
    @BeforeMethod
    public void beforeMethod() {
        System.out.println(">>> Executed @BeforeMethod - Runs before each @Test method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println(">>> Executed @AfterMethod - Runs after each @Test method");
    }


    // Test Cases 

    // Test Case 1: Positive Login Test
    @Test(priority = 0, groups = "Regression")
    public void positiveLoginTest() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        Thread.sleep(2000);

        if (driver.getCurrentUrl().contains("logged-in-successfully")) {
            System.out.println(" URL verification passed - logged in successfully");
        } else {
            System.out.println("URL verification failed!");
        }

        WebElement message = driver.findElement(By.tagName("h1"));
        if (message.getText().contains("Logged In Successfully")) {
            System.out.println("Success Message Verified");
        } else {
            System.out.println("Success message not found!");
        }

        WebElement logoutBtn = driver.findElement(By.linkText("Log out"));
        if (logoutBtn.isDisplayed()) {
            System.out.println("Log out Button is displayed");
        } else {
            System.out.println("Log out button is not displayed!");
        }

        driver.quit();
    }

    // Test Case 2: Negative Username Test
    @Test(priority = 1, groups = {"Sanity", "Regression"}, dependsOnMethods = {"positiveLoginTest"})
    public void negativeUsernameTest() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("incorrectUser");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();
        Thread.sleep(2000);

        WebElement error = driver.findElement(By.id("error"));
        if (error.isDisplayed() && error.getText().equals("Your username is invalid!")) {
            System.out.println("Username error message displayed correctly");
        } else {
            System.out.println("Unexpected or missing error message");
        }

        driver.quit();
    }

    // Test Case 3: Negative Password Test
    @Test(priority = 2, groups = "Sanity")
    public void negativePasswordTest() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("incorrectPassword");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();
        Thread.sleep(2000);

        WebElement error = driver.findElement(By.id("error"));
        if (error.isDisplayed() && error.getText().equals("Your password is invalid!")) {
            System.out.println("Password error message displayed correctly");
        } else {
            System.out.println("Unexpected or missing error message");
        }

        driver.quit();
    }
}
