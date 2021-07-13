/**
 * 
 */
package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Naduni
 *
 */
public class Actions_ {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");	   
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath(""));
		
		WebElement ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		WebElement serchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).contextClick().build().perform();	
		a.moveToElement(serchbox).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		
		
		
		driver.close();
		driver.quit();
	}	
}
