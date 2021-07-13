/**
 * 
 */
package assignments;

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
public class Assignment4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naduni\\Documents\\udemy\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, 30);

		driver.get("https://the-internet.herokuapp.com/");
		// driver.findElement(By.xpath(""));
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);

		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'windows')]")));
		driver.findElement(By.xpath("//a[contains(@href,'nested')]")).click();

		String window = driver.getWindowHandle();
		driver.switchTo().window(window);
		driver.findElement(By.cssSelector("frameset frame")).getAttribute("src");
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		driver.close();
		driver.quit();
	}
}
