package Aug162025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	 public static void main(String[] args) throws InterruptedException {
	        ChromeOptions chromeOption = new ChromeOptions();
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(chromeOption);
	        driver.get("https://the-internet.herokuapp.com/tables");
	        driver.manage().window().maximize();
	        
	        //find the rows present
	        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	        
	        int rowcount= rows.size();
	        
	        System.out.println("Row Size is "+rowcount);
	        
	        //find coulumn present
	        
	        List<WebElement> col = driver.findElements(By.xpath("//table[@id='table1']/thead/tr[1]/th"));
	        
	        int colcount = col.size();
	        
	        System.out.println("colum size is "+colcount);
	        //text of cell
	        
	        WebElement celltext = driver.findElement(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]"));
	        
	        String actualcelltext = celltext.getText();
	        
	        String expectedcelltext ="tconway@earthlink.net";
	        
	        if(actualcelltext.equalsIgnoreCase(expectedcelltext)) {
	        	System.out.println("The text is same "+actualcelltext);
	        }else {
	        	System.out.println("The text is not same");
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	 }
}
