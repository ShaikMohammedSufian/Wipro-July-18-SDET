package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class deselectEg {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://grotechminds.com/multiple-select/");

        WebElement selectElement = driver.findElement(By.id("automobiles"));
        Select select = new Select(selectElement);

        // Select options first
        select.selectByVisibleText("Motorcycle");
        select.selectByIndex(2); // Sedan
        select.selectByIndex(3); // Hatchback
        Thread.sleep(2000);

        // Deselect options
        select.deselectByVisibleText("Motorcycle");
        Thread.sleep(2000);

        select.deselectByIndex(2);
        Thread.sleep(2000);

        select.deselectByIndex(3);
        Thread.sleep(2000);

       
    }
}
