/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author Naduni
 *
 */
public class EnabledDisabled {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//driver.findElement(By.xpath(""));
//	Boolean b = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled();
//	System.out.println(b);
	Assert.assertEquals(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"),"display: block; opacity: 0.5;");
	driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"));
//	Boolean b2 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled();
//	System.out.println(b2);
	Thread.sleep(2000L);
	driver.close();
	driver.quit();
}	
}
//RoundTrip
//ctl00_mainContent_view_date2