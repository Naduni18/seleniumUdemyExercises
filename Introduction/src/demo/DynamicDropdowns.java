/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class DynamicDropdowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.xpath(""));
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(2000L);
	//	driver.findElement(By.xpath("//a[@value='MAA']")).click();//element not interactable ERROR
		
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//----------------------------------
		
		
		driver.close();
		driver.quit();
	}	
}
