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
public class ValidationTestCase {

	public static void main(String[] args) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("my name");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123456889");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[id='error']")).getText());
		
		driver.close();
		driver.quit();

	}

}
