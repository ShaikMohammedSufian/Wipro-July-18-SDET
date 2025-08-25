//package StepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//import pages.loginpage;
//import utils.DriverFactory;
//
//public class StepDefinitions {
//	
//	
//WebDriver driver = DriverFactory.getDriver();
////loginpage lp = new loginpage(driver);
//	
//	//login page
//	@Given("User is on the login page")
//	public void User_is_on_the_login_page() throws InterruptedException {
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(4000);
//	}
//
//	//enter username
//	@When("user enters the username")
//	public void user_enters_the_username() throws InterruptedException {
//		WebElement username = driver.findElement(By.name("username"));
//		username.clear();
//		username.sendKeys("Admin");
//		Thread.sleep(4000);
//	}
//
//	//enter password
//	@When("user enters the password")
//	public void user_enters_the_password() throws InterruptedException {
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		password.clear();
//		password.sendKeys("admin123");
//		Thread.sleep(4000);
//	}
//
//	
//
//	//click login button
//	@When("user clicks on the login button")
//	public void user_clicks_on_the_login_button() throws InterruptedException {
//		Thread.sleep(5000);
//		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
//		loginbutton.click();
//		Thread.sleep(4000);
//	}
//
//	//go to home page
//	@Then("user is naqvigated to home page")
//	public void user_is_naqvigated_to_home_page() throws InterruptedException {
//		Thread.sleep(6000);
//		WebElement admin = driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
//		if (admin.isDisplayed()) {
//			System.out.println(" User is on the home page");
//		} else {
//			System.out.println(" User is not on the home page");
//		}
//	}
////	
////	//enter invalid password
////	@When("user enter invalid password")
////	public void user_enter_invalid_password() throws InterruptedException {
////		Thread.sleep(4000);
////		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
////		password.clear();
////		password.sendKeys("admin12345");
////		Thread.sleep(4000);
////	}
////	
////	//validation for invalid password
////	@Then("error message Invalid credentials will show")
////	public void error_message_invalid_credentials_will_show() throws InterruptedException {
////		Thread.sleep(4000);
////		WebElement error = driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']"));
////		if (error.isDisplayed() && error.getText().equals("Invalid credentials")) {
////			System.out.println(" Password error message displayed correctly");
////		} else {
////			System.out.println("Unexpected or missing error message");
////		}
////	}
////
////
////
////
//////data driven using example keyword
////
////@When("user enters the {string} and {string}")
////
////public void user_enters_the(String username , String password ) throws InterruptedException {
////
////	WebElement username1 = driver.findElement(By.name("username"));
////
////	username1.sendKeys(username);
////
////	Thread.sleep(4000);
////
////
////	WebElement password1 = driver.findElement(By.name("password"));
////
////	password1.sendKeys(password);
////
////	Thread.sleep(4000);
////
////
////}
////
//////data driven with just one data
////@When("user enters credentials")
////public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
////
////	
////
////	List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
////
////	for (Map<String, String> user : users) {
////
////
////		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
////
////		Thread.sleep(10000);
////
////		String username = user.get("username");
////		String password = user.get("password");
////
////		WebElement username1 = driver.findElement(By.name("username"));
////
////		Thread.sleep(4000);
////
////		username1.sendKeys(username);
////
////		Thread.sleep(2000);
////
////		WebElement password1 = driver.findElement(By.name("password"));
////
////		password1.sendKeys(password);
////
////		Thread.sleep(2000);
////
////		
////
////
////	}
////}
////
////@Given("the user is on the login page")
////public void the_user_is_on_the_login_page() throws InterruptedException {
////	// launch the application on the chrome browser
////			Thread.sleep(10000);
////
////			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
////
////			Thread.sleep(2000);
////
////}
////
////@When("the user enters username {string} and password {string}")
////public void the_user_enters_username_and_password(String username, String password) throws InterruptedException {
////
////lp.enterCredentials(username, password);
////}
////
////@Then("the user should be navigated to the home page")
////public void the_user_should_be_navigated_to_the_home_page() {
////	lp.clickLogin();
////}
//}
