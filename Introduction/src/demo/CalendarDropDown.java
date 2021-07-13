/**
 * 
 */
package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author Naduni
 *
 */
public class CalendarDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.xpath(""));
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	//	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		//Thread.sleep(2000L);
	//	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
	//	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight.ui-state-active')]")).click();
		driver.close();
		driver.quit();
	}	
}
//ui-state-default ui-state-highlight ui-state-active
//ui-datepicker-group.ui-datepicker-group-first
//ctl00_mainContent_view_date1