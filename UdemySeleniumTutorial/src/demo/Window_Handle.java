/**
 * 
 */
package demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handle {
	public static void main(String[] args) throws InterruptedException {
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\browserdrivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		//driver.findElement(By.xpath(""));
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		String emailid = driver.findElement(By.cssSelector("p.im-para.red")).getText().split(" ")[4];
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailid);
		driver.close();
		driver.quit();
	}	
}
