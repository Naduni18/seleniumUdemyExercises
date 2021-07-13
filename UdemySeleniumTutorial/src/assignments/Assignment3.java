/**
 * 
 */
package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Naduni
 *
 */
public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, 10);

		driver.get("https://the-internet.herokuapp.com/");
		// driver.findElement(By.xpath(""));
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'windows')]")));
		driver.findElement(By.xpath("//a[contains(@href,'windows')]")).click();

		String window = driver.getWindowHandle();
		driver.switchTo().window(window);
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows);
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.close();
		driver.quit();
	}
}
