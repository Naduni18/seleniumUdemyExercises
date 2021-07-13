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
public class Locators2 {
	//should be unique
	static long x = 10000;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("my name");
		driver.findElement(By.name("pw")).sendKeys("12345678");
		//driver.findElement(By.className("button r4 wide primary")).click();
		//driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		driver.close();
		driver.quit();
	}

}
