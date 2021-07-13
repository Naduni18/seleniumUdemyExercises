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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Naduni
 *
 */
public class Links_count {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,30);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// driver.findElement(By.xpath(""));
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		int countA = driver.findElements(By.tagName("a")).size();//all links count
		WebElement ele  = driver.findElement(By.id("gf-BIG"));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("gf-BIG")));
		int countB = ele.findElements(By.tagName("a")).size();//links count in footer
		WebElement ELE2 = ele.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int countC = ELE2.findElements(By.tagName("a")).size();
		System.out.println(countA +"   "+countB+"   "+countC);
		
		for(int i = 0;i<countC;i++) {
			String clickonlink= Keys.chord(Keys.CONTROL,Keys.ENTER);	
			ELE2.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);	
		}
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		for(int i = 0;i<countC;i++) {
		String childid = it.next();		
	    System.out.println(driver.switchTo().window(childid).getTitle());
		}
		driver.close();
		driver.quit();
	}
}