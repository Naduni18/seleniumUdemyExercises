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
public class RegularExpression {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("it is me");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("it is me");
		//driver.findElement(By.xpath("//input[@name='proceed']")).click();
		driver.findElement(By.cssSelector("input[name*='procee']")).click();
		driver.close();
		driver.quit();
	}
}
