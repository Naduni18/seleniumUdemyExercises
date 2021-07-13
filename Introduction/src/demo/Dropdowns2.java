/**
 * 
 */
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class Dropdowns2 {
	//static dropdowns
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		String s1 = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(s1);
		driver.findElement(By.id("divpaxinfo")).click();		
		Thread.sleep(2000L);
		int i =1;
		while(i<5) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}	
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000L);
		String s = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(s);	
		driver.close();
		driver.quit();
	}	
}
