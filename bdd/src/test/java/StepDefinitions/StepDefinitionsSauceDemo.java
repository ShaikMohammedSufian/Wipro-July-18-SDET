package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionsSauceDemo {

    public static WebDriver driver;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
    }

    @When("user enters the username")
    public void user_enters_the_username() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
    }

    @When("user enters the password")
    public void user_enters_the_password() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }

    @When("user is naqvigated to home page")
    public void user_is_naqvigated_to_home_page() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(" User navigated to Products page");
    }

    @When("user select product and adds to cart")
    public void user_select_product_and_adds_to_cart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        System.out.println(" Product added to cart");
    }

    @When("user clicks on add to cart icon")
    public void user_clicks_on_add_to_cart_icon() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
    }

    @When("user clicks on the checkout button")
    public void user_clicks_on_the_checkout_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
    }

    @When("user enter firstname")
    public void user_enter_firstname() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("first-name")).sendKeys("Shaik");
        Thread.sleep(2000);
    }

    @When("user enter lastname")
    public void user_enter_lastname() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("Sufian");
        Thread.sleep(2000);
    }

    @When("user enters the zip code")
    public void user_enters_the_zip_code() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("500001");
        Thread.sleep(2000);
    }

    @When("user clicks on the continue button")
    public void user_clicks_on_the_continue_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
    }

    @Then("user clicks on the finish button")
    public void user_clicks_on_the_finish_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        System.out.println("Order completed successfully!");
        driver.quit();
    }
}



