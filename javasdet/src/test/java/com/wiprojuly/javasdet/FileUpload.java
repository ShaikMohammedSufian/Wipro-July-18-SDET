package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        // Setup Chrome options
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Open file upload page
        driver.get("https://the-internet.herokuapp.com/upload");

        // Maximize window
        driver.manage().window().maximize();

        // Locate file input element
        WebElement uploadInput = driver.findElement(By.id("file-upload"));

        // Provide local file path (Change this to your actual file path)
        uploadInput.sendKeys("D:/vs code/New folder/20031.jpg");

      

        // Click upload button
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();
        

        // Check upload confirmation message
        String message = driver.findElement(By.tagName("h3")).getText();
        if (message.contains("File Uploaded!")) {
            System.out.println("The file is uploaded successfully");
        } else {
            System.out.println("The file upload failed");
        }

        
    }
}
