package com.wiprojuly.javasdet;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeEdgeBrowser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D://edgedriver_win64//msedgedriver.exe//");
	    WebDriver driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        System.out.println( "Hello World!");
	}

}













