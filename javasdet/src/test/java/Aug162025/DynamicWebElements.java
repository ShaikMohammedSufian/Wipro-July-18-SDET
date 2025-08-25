package Aug162025;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebElements {
	public static void main(String[] args) throws InterruptedException {

		// dynamic web elements – values keep changing and they have alpha numeric
		// values
		
		
		//startswith,endswith,contains,clubbing
		// starts with

		/*
		 * //input[@id = 'id_43546'] 
		 * //input[@id = 'id_67769'] 
		 * //input[@id = 'id_45545']
		 */
		//ends with
		
		/*
		 *////input[@id = '656846_name']
		////input[@id = '8455555_name']
		////input[@id = '123846_name']
			
		/*
		 * //input[starts-with(@id, 'id_')] 
		 * //input[starts-with(text(), 'id_')]
		 * //input[ends-with(@id, '_name')]
		 *  //a[contains(text(),'name')]
		 *  //button[@name = 'login' and @type = 'submit']
		 */
		
		ChromeOptions chromeOption = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// click on link to open the child tab
		
		
		
		
		
		
		
		
		

	}
}
