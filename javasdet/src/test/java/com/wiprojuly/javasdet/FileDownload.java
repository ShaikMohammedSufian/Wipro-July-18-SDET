package com.wiprojuly.javasdet;

import java.io.File; // ✅ Correct import
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.HashMap;

public class FileDownload {
    public static void main(String[] args) throws InterruptedException {

        // ✅ Change Chrome download location to D:\
        String downloadPath = "D:\\";
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory", downloadPath);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", chromePrefs);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Open file download page
        driver.get("https://the-internet.herokuapp.com/download");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Click download link
        WebElement fileDownload = driver.findElement(By.xpath("//a[@href='download/test-file.txt']"));
        fileDownload.click();
        Thread.sleep(3000); // Wait for download to complete

        // Check if file exists in D:\
        File f = new File("D:\\test-file.txt");

        if (f.exists()) {
            System.out.println("✅ The file is present at: " + f.getAbsolutePath());
        } else {
            System.out.println("❌ The file is not present.");
        }

        driver.quit();
    }
}
