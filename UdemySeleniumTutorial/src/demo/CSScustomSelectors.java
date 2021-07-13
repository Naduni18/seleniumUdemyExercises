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
public class CSScustomSelectors {
	public static void main(String[] args) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com");
	driver.findElement(By.cssSelector("input.input.r4.wide.mb16.mt8.username")).sendKeys("my name");
	driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("123456789");
	driver.findElement(By.cssSelector("#Login")).click();
	System.out.println(driver.findElement(By.cssSelector("div[id='error']")).getText());
	driver.close();
	driver.quit();
}
}
