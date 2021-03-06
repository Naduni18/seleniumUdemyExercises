/**
 * 
 */
package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Naduni
 *
 */
public class MultipleWindows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.get("https://rahulshettyacademy.com");
		String s = driver.findElement(By.xpath("//a[contains(text(),'All-Access Membership-Complete Access to 25+ Cours')]")).getText();
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(s);
		driver.close();
		driver.quit();
	}

}
//a[href*='https://courses.rahulshettyacademy.com/p'][1]