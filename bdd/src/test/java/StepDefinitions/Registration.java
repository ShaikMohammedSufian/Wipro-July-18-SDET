package StepDefinitions;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;
import utils.DriverFactory;
public class Registration {
	
	 WebDriver driver = DriverFactory.getDriver();
	    RegistrationPage rp = new RegistrationPage(driver);

	    @Given("the user is on the Practice Registration Form page")
	    public void user_on_registration_page() throws InterruptedException {
	        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	        Thread.sleep(2000);
	    }

	    @When("the user enters name {string}")
	    public void user_enters_name(String name) throws InterruptedException {
	        rp.enterName(name);
	    }

	    @When("the user enters email {string}")
	    public void user_enters_email(String email) throws InterruptedException {
	        rp.enterEmail(email);
	    }

	    @When("the user selects gender {string}")
	    public void user_selects_gender(String gender) throws InterruptedException {
	        rp.selectGender();
	    }

	    @When("the user enters mobile number {string}")
	    public void user_enters_mobile(String mobile) throws InterruptedException {
	        rp.enterMobile(mobile);
	    }

	    @When("the user enters date of birth {string}")
	    public void user_enters_dob(String dob) throws InterruptedException {
	        rp.enterDOB(dob);
	    }

	    @When("the user enters subjects {string}")
	    public void user_enters_subjects(String subjects) throws InterruptedException {
	        rp.enterSubjects(subjects);
	    }

	    @When("the user selects hobby {string}")
	    public void user_selects_hobby(String hobby) throws InterruptedException {
	        rp.selectHobby();
	    }

	    @When("the user uploads a picture {string}")
	    public void user_uploads_picture(String path) throws InterruptedException {
	        rp.uploadPicture(path);
	    }

	    @When("the user enters address {string}")
	    public void user_enters_address(String address) throws InterruptedException {
	        rp.enterAddress(address);
	    }

	    @When("the user selects state {string}")
	    public void user_selects_state(String state) throws InterruptedException {
	        rp.selectState(state);
	    }

	    @When("the user selects city {string}")
	    public void user_selects_city(String city) throws InterruptedException {
	        rp.selectCity(city);
	    }

	    @When("the user clicks on the login button")
	    public void user_clicks_login() throws InterruptedException {
	        rp.clickLogin();
	    }

	    @Then("the registration should be submitted successfully")
	    public void registration_submitted() {
	        System.out.println("Registration submitted successfully!");
	    }
	}
	

