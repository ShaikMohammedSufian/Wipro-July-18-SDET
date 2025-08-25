package com.wiprojuly.datadriventesting;
 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelWrite {

	WebDriver driver;

	XSSFWorkbook workbook;

	XSSFSheet sheet;

	XSSFCell cell;


	@Test

	public void login() throws IOException {

		File src = new File ("C:\\Users\\irfan\\eclipse-workspace\\javasdet\\TestData\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(src);

		// load the work book

		workbook = new XSSFWorkbook(fis) ;

		sheet = workbook.getSheetAt(0);

		// create a for loop to iterate in the sheet of rows and columns

		for (int i = 1; i<= sheet.getLastRowNum(); i++) {

			ChromeOptions chromeOptions = new ChromeOptions();
 
			WebDriverManager.chromedriver().setup();
 
			WebDriver driver = new ChromeDriver(chromeOptions);
 
			// launch the url
 
			driver.get("https://www.facebook.com/login");

			driver.manage().window().maximize();
			
			//get title of page and write to excel
			String title = driver.getTitle();
			
			System.out.println(title);
			
			// write to excel sheet
			
			FileOutputStream fos = new FileOutputStream(src);
			
			//crreate the cell and add data to cell
			
			sheet.getRow(i).createCell(2).setCellValue(title);
			
			//plerform write operation and close the connection
			
			workbook.write(fos);
			
			fos.close();
			
			
			
			
		}
	}
}