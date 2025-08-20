package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeOptions = new ChromeOptions();
		// webdriver manager - download setup and maintance of the diff
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// name locator

		// enter text in username field

		Thread.sleep(2000);

		WebElement username = driver.findElement(By.name("username"));

		username.sendKeys("Admin");

		Thread.sleep(2000);
		
		//password
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

		password.sendKeys("admin123");

		Thread.sleep(2000);
		
		//login
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));

	    loginbutton.click();

		Thread.sleep(2000);

	}

}

/*
 * locators in selenium id - unique attribute name - name attribute - name of
 * the element classname - common class name applied for multiple elements
 * grouped together linktext - text present on the link partial link text -
 * partial link text text on the web element tagname - the first word in the web
 * element after the opening tag - this is applied for mutlipel web elements in
 * the page css selector - #name div.oxd-form-row:nth-child(2) >
 * div:nth-child(1) > div:nth-child(2) > input:nth-child(1)
 */
/*
 * Element CSS Selector XPath Name input[placeholder='First Name']
 * //input[@placeholder='First Name'] Email
 * input[placeholder='name@example.com']
 * //input[@placeholder='name@example.com'] Gender - Male input[value='Male']
 * //input[@value='Male'] Gender - Female input[value='Female']
 * //input[@value='Female'] Gender - Other input[value='Other']
 * //input[@value='Other'] Mobile Number input[placeholder='Enter Mobile
 * Number'] //input[@placeholder='Enter Mobile Number'] Date of Birth
 * input[type='date'] //input[@type='date'] Subjects input[placeholder='Enter
 * Subject'] //input[@placeholder='Enter Subject'] Hobby - Sports
 * input[value='Sports'] //input[@value='Sports'] Hobby - Reading
 * input[value='Reading'] //input[@value='Reading'] Hobby - Music
 * input[value='Music'] //input[@value='Music'] Picture Upload
 * input[type='file'] //input[@type='file'] Current Address
 * textarea[placeholder='Current Address'] //textarea[@placeholder='Current
 * Address']
 */
