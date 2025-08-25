package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    private WebDriver driver;

    // Locators
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By gender = By.id("gender"); 
    private By mobileField = By.id("mobile");
    private By dobField = By.id("dob");
    private By subjectsField = By.id("subjects");
    private By hobby = By.xpath("//label[text()='Reading']/preceding-sibling::input");
    private By uploadPicture = By.id("picture");
    private By addressField = By.xpath("//textarea[@id='picture']"); 
    private By stateDropdown = By.id("state");
    private By cityDropdown = By.id("city");
    private By loginButton = By.xpath("//input[@value='Login']");

    // Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterName(String name) throws InterruptedException {
        driver.findElement(nameField).sendKeys(name);
        Thread.sleep(2000);
        
    }

    public void enterEmail(String email) throws InterruptedException {
        driver.findElement(emailField).sendKeys(email);
        Thread.sleep(2000);
    }

    public void selectGender() throws InterruptedException {
        driver.findElement(gender).click();
        Thread.sleep(2000);
    }

    public void enterMobile(String mobile) throws InterruptedException {
        driver.findElement(mobileField).sendKeys(mobile);
        Thread.sleep(2000);
    }

    public void enterDOB(String dob) throws InterruptedException {
        driver.findElement(dobField).sendKeys(dob);
        Thread.sleep(2000);
    }

    public void enterSubjects(String subjects) throws InterruptedException {
        driver.findElement(subjectsField).sendKeys(subjects);
        Thread.sleep(2000);
    }

    public void selectHobby() throws InterruptedException {
        driver.findElement(hobby).click();
        Thread.sleep(2000);
    }

    public void uploadPicture(String path) throws InterruptedException {
        driver.findElement(uploadPicture).sendKeys(path);
        Thread.sleep(2000);
    }

    public void enterAddress(String address) throws InterruptedException {
        driver.findElement(addressField).sendKeys(address);
        Thread.sleep(2000);
    }

    public void selectState(String state) throws InterruptedException {
        Select select = new Select(driver.findElement(stateDropdown));
        select.selectByVisibleText(state);
        Thread.sleep(2000);
    }

    public void selectCity(String city) throws InterruptedException {
        Select select = new Select(driver.findElement(cityDropdown));
        select.selectByVisibleText(city);
        Thread.sleep(3000);
    }

    public void clickLogin() throws InterruptedException {
        driver.findElement(loginButton).click();
        Thread.sleep(4000);
    }

  
}
